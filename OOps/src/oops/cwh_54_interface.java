package oops;


interface Bicycle{
	
	int a =45;
	void applyBreak(int decrement);
	void speedUp(int increment);
}
interface HornBicycle{
	int a = 45;
	void blowHornK3g();
	void blogHornmhn();
}
class AvonCycle implements Bicycle,HornBicycle{
	
	int speedUp = 7;

	@Override
	public void applyBreak(int decrement) {
		
		System.out.println("Applying Break");
		
	}

	@Override
	public void speedUp(int increment) {
		
		System.out.println("Applying speedUp");
		
	}

	@Override
	public void blowHornK3g() {
		System.out.println("kvi khusi kvi gam");
		
	}

	@Override
	public void blogHornmhn() {
		System.out.println("main hu na");
		
	}
	
	
	
}

public class cwh_54_interface {

	public static void main(String[] args) {
		
		AvonCycle ac = new AvonCycle();
		ac.applyBreak(5);
		ac.blowHornK3g();
		ac.blogHornmhn();
		//you can create prop in interfaces bt you cannot modify the prop in interfaces as they are final
		//System.out.println(ac.a);
		

	}

}
