package v3;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class FactoryContainer {

	public static IFactory factory;

	static{
		String factoryName = XmlUtil.getFactory();
        if ("Windows".equals(factoryName))
        {
        	factory = new WindowFactory();
        }
        else if ("Mac".equals(factoryName))
        {
        	factory = new MacFactory();
        }
        else
        {
            try {
				throw new Exception("Factory Init Error");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

		
		
	}
	
	public IFactory getFactory() {
		return factory;
	}

	public void setFactory(IFactory factory) {
		this.factory = factory;
	}
	
	
}
