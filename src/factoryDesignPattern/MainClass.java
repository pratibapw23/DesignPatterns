package factoryDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		String OSType="Android";
		
		OSFactory object = new OSFactory();
		OS obj=object.getInstance(OSType);
		obj.show();
	}

}
