package adapterDesignPattern;

public class Adapter extends DataAnalyticsTool {

	XMLData xmldata;
	
	public Adapter(XMLData xmldata) {
		this.xmldata=xmldata;
	}
	public void analyseData() {
		System.out.println("Converting XML Data:"+xmldata.getXmlData()+":to json data");
	}

}
