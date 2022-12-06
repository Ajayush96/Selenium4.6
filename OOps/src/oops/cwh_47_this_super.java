package oops;


class Ekclass{
	int a;
	
	public int getA() {
		return a;
	}
	public Ekclass(int a) {
		this.a = a;
	}
	
	public int returnone() {
		return 1;
	}
}

class Doclass extends Ekclass{

	public Doclass(int c) {
		super(c);
		System.out.println("Mai ek constructor hu");
		
	}
	
}
public class cwh_47_this_super {

	public static void main(String[] args) {
		
		Ekclass e = new Ekclass(65);
		Doclass d = new Doclass(5);
		System.out.println(e.getA());
	}

}
