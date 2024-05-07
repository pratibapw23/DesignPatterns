package adapterDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		XMLData xmlObject=new XMLData("sample xml data");
		DataAnalyticsTool obj=new Adapter(xmlObject);
		ClientClass client=new ClientClass();
		client.processData(obj);
	}

}
