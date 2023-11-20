package singletonPattern.lazyInstantiation;

public class ABC {

	private static ABC obj=null;
	
	private ABC() { // Private Constructor
		
	}
	
	public static ABC getABCInstance() { //global access point to singleton object
		if(obj==null) {
			synchronized(ABC.class) { //only one thread should create instance - DCL issue exist
				if(obj==null) {
					return new ABC();
				}
			}
		}
		return obj;
	}
}
