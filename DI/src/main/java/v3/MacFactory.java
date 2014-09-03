package v3;

public class MacFactory implements IFactory {

	public IWindow makeWindow() {
		// TODO Auto-generated method stub
		return new MacWindow();
	}

	public IButton makeButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	public ITextBox makeTextBox() {
		// TODO Auto-generated method stub
		return new MacTextBox();
	}

}
