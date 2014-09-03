package v3;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlUtil {

	public static String getFactory(){
		// TODO Auto-generated method stub
		String factoryName = "";
		SAXReader saxReader = new SAXReader();
        try {
        	 String relativelyPath=System.getProperty("user.dir"); 
        	 System.out.println("dir:"+relativelyPath);
			Document document = saxReader.read(new File(relativelyPath+"/src/main/resources/pc.xml"));
			Element root = document.getRootElement();
			Element factory = root.element("factory");
			factoryName = factory.getText();
			System.out.println(factoryName);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
        
        return factoryName;
	}
}
