package oops;

class Base1{
	
	public Base1() {
		System.out.println("Mai ek constructor hu");
	}
	public Base1(int x) {
		System.out.println("Mai ek overloaded constructor hu: " + x);
	}
	
}

class Derived1 extends Base1{
	
	 Derived1() {
		//super(5);
		System.out.println("Mai ek derived class constructor hu");
	}
	 Derived1(int x, int y){
		 super(x);
		 System.out.println("I'm an overloaded constructor of Derived with value of y as: " + y);
		 
	 }
	
}

class ChildofDerived extends Derived1{
	ChildofDerived(){
		System.out.println("I'm a child of derived constructor");
	}
	ChildofDerived(int x, int y,int z){
		super(x,y);
		System.out.println("I'm an overloaded constructor of Derived with value of z as: " + z);
	}
	
}
public class cwh_46_constructors_in_inheritance{

	public static void main(String[] args) {
	
		//Base1 b = new Base1();
		//Derived1 d = new Derived1();
		//Derived1 d1 = new Derived1(14,15);
		ChildofDerived cd = new ChildofDerived(12,13,15);
	
	
		

	}

}
