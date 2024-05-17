package factoryDesignPattern;

public class OSFactory {
	OS osobject;
	
//	public OSFactory(OS osobject) {
//		this.osobject=osobject;
//	}
	public OS getInstance(String OSType){
		if(OSType=="Windows")
			osobject=new WIndows();
		else if(OSType=="IOS")
			osobject=new IOS(); 
		else osobject=new Android();
		
		return osobject;
	}
}
