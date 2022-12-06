package oops;

interface MyCamera2{
	void takeSnap();
	void recordVideo();
	private void greet() {
		System.out.println("Good Morning");
	}
	default void record4kvideo() {
		greet();
		System.out.println("Recording in 4k");
	}
	
}

interface MyWifi2{
	String[] getNetworks();
	void connectTonetwork(String network);
}

class MyCellPhones2{
	void callNumber(int phoneNumber) {
		System.out.println("Calling "+ phoneNumber);
	}
	void pickCall() {
		System.out.println("Connecting... ");
	}
//	void takeSnap()
//	{
//		System.out.println("Taking snap");
//	}
}
class MySmartphone2 extends MyCellPhones2 implements MyWifi2,MyCamera2{

	@Override
	public void takeSnap() {
		
		System.out.println("Taking Snap");
		
	}

	@Override
	public void recordVideo() {
		System.out.println("Recording video");
		
	}
//   default void record4kvideo() {
//		System.out.println("Recording in 4k");
//	}

	@Override
	public String[] getNetworks() {
		System.out.println("Getting List of Network");
		String[] networklist = {"Harry","Prashanth","Ashish"};
		return networklist;
	}

	@Override
	public void connectTonetwork(String network) {
		System.out.println("Connecting t0 "+network);
		
	}
	public void sampleMeth() {
		System.out.println("meth");
	}
	
}

public class cwh_59_polymorphsim {

	public static void main(String[] args) {
		
		MyCamera2 cam1 = new MySmartphone2();//this is a smartphone but, use as a camera
		//cam1.getNetwork(); not allowed
		//cam1.sampleMeth(); not allowed
		
		cam1.record4kvideo();
		
		MySmartphone2 s= new MySmartphone2();
		s.sampleMeth();
		s.record4kvideo();
		s.getNetworks();
		s.callNumber(98812);
		

	}

}
