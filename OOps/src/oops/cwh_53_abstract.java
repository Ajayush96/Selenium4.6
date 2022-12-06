package oops;


abstract class Base2{
	
	public Base2(){
		System.out.println("mai base2 ka constructor hu");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	
	abstract public void greet();
}

class child2 extends Base2{
	@Override
	public void greet() {
		System.out.println("Good Morning");
	}
	
abstract class child3 extends Base2{
	
	public void th() {
		System.out.println("I'm good");
	}
}
	
}

public class cwh_53_abstract {

	public static void main(String[] args) {
		
		child2 c = new child2();

	}

}
