package v3;

public class User {

	private IFactory factory;

	public IFactory getFactory() {
		return factory;
	}

	public void setFactory(IFactory factory) {
		this.factory = factory;
	}
	
	public void start(){
		factory.makeWindow().showInfo();
		factory.makeTextBox().showInfo();
		factory.makeButton().showInfo();
	}
	
	
}
