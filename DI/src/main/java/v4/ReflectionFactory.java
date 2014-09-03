package v4;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import v3.IButton;
import v3.ITextBox;
import v3.IWindow;

public class ReflectionFactory {

	private static String window;
	
	private static String textBox;
	
	private static String button;
	
	static{
	 String factoryName = "";
	 SAXReader saxReader = new SAXReader();		
   	 String relativelyPath=System.getProperty("user.dir"); 
   	 System.out.println("dir:"+relativelyPath);
	Document document = null;
		try {
			document = saxReader.read(new File(relativelyPath+"/src/main/resources/obj.xml"));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Element root = document.getRootElement();
		 window = root.element("window").getText();
		 button = root.element("button").getText();
		 textBox = root.element("textBox").getText();
	}
	
	public static IWindow makeWindow() throws Exception{
		Class cls = Class.forName(window);
		IWindow _window = (IWindow) cls.newInstance();
		return _window;
	}
	
	public static IButton makeButton() throws Exception{
		Class cls = Class.forName(button);
		IButton _button = (IButton) cls.newInstance();
		return _button;		
	}
	
	public static ITextBox makeTextBox() throws Exception{
		Class cls = Class.forName(textBox);
		ITextBox _textBox = (ITextBox) cls.newInstance();
		return _textBox;		
	}
}
