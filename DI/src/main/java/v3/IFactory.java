package v3;

public interface IFactory {

	IWindow makeWindow();
	
	IButton makeButton();
	
	ITextBox makeTextBox();
}
