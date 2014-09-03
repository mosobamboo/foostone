package v3;

public class WindowFactory implements IFactory {

	public IWindow makeWindow() {
		// TODO Auto-generated method stub
		return new WindowsWindow();
	}

	public IButton makeButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	public ITextBox makeTextBox() {
		// TODO Auto-generated method stub
		return new WindowsTextBox();
	}

}
