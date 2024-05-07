package observerDesignPattern;

public class ClientClass {

	public static void main(String[] args) {
		Publisher publisher=new Publisher();
		
		User user1=new User(1);
		User user2=new User(2);
		User user3=new User(3);
		
		publisher.subscribe(user1);
		publisher.subscribe(user2);
		publisher.subscribe(user3);
		
		publisher.notify("New Notification");
	}

}
