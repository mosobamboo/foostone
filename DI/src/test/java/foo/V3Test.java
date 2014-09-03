package foo;

import v3.FactoryContainer;
import v3.IButton;
import v3.IFactory;
import v3.ITextBox;
import v3.IWindow;

public class V3Test {

	/*
	 * FactoryContainer is the service provider
	 */
	
	public static void main(String[] args) {
		IFactory factory = FactoryContainer.factory;
		IWindow window = factory.makeWindow();
		window.showInfo();
		ITextBox textbox = factory.makeTextBox();
		textbox.showInfo();
		IButton button = factory.makeButton();
		button.showInfo();
	}
}
