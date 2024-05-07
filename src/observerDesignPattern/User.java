package observerDesignPattern;

public class User implements ISubscriber{

	private int id;
	
	public User(int id) {
		this.id=id;
	}
	
	@Override
	public void notify(String msg) {
		System.out.println("message for"+" "+id+"="+msg);
	}

}
