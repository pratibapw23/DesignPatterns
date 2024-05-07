package observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
	private List<ISubscriber> users=new ArrayList<>();

	public void subscribe(User user) {
		users.add(user);
	}
	public void unsubscribe(User user) {
		users.remove(user);
	}
	public void notify(String string) {
		for(ISubscriber user:users) {
			user.notify(string);
		}
	}

}
