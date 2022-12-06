package oops;

interface MyCamera{
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

interface MyWifi{
	String[] getNetworks();
	void connectTonetwork(String network);
}

class MyCellPhones{
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
class MySmartphone extends MyCellPhones implements MyWifi,MyCamera{

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
	
}
public class cwh_57_default_methods {

	public static void main(String[] args) {
		
		MySmartphone ms = new MySmartphone();
		ms.record4kvideo();
		String[] ar=ms.getNetworks();
		for(String item:ar)
		{
			System.out.println(item);
		}
		
		

	}

}
