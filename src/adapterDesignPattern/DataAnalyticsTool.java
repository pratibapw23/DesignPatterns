package adapterDesignPattern;

public class DataAnalyticsTool {
	String jsonData;
	
	public DataAnalyticsTool() {
		
	}
	
	public DataAnalyticsTool(String jsonData) {
		this.jsonData=jsonData;
	}
	
	public void analyseData() {
		System.out.println(jsonData);
	}
}
