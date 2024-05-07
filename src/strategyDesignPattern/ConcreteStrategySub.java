package strategyDesignPattern;

public class ConcreteStrategySub implements Strategy{

	@Override
	public int execute(int a, int b) {
		return a-b;
	}

}
