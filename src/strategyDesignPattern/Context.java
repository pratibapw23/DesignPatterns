package strategyDesignPattern;

public class Context {
	private Strategy strObject;
	
	public Strategy setStrategy(Strategy strObject) {
		return this.strObject= strObject;
	}
	
	public int executeStrategy(int a,int b) {
		return strObject.execute(a, b);
	}
}
