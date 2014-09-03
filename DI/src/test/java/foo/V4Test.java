package foo;

import v3.IButton;
import v3.ITextBox;
import v3.IWindow;
import v4.ReflectionFactory;

public class V4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			IWindow window = ReflectionFactory.makeWindow();
			window.showInfo();
			
			IButton button = ReflectionFactory.makeButton();
			button.showInfo();
			
			ITextBox textBox = ReflectionFactory.makeTextBox();
			textBox.showInfo();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
