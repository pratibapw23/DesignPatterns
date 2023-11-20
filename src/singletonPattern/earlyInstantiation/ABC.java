package singletonPattern.earlyInstantiation;

public class ABC {

	private static ABC obj=new ABC(); //Early Instantiation of object
	
	private ABC() { // Private Constructor
		
	}
	
	public static ABC getABCInstance() { //global access point to singleton object
		return obj;
	}
}
