package strategyDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		Context object=new Context();
		int firstNumber=10;
		int secondNumber=30;
		
		String action="sub";
		if(action=="add") {
			object.setStrategy(new ConcreteStrategyAdd());
		}
		if(action=="sub") {
			object.setStrategy(new ConcreteStrategySub());
		}
		if(action=="mul") {
			object.setStrategy(new ConcreteStrategyMultiply());
		}
		
		int result=object.executeStrategy(firstNumber, secondNumber);
		System.out.println(result);
	}

}
