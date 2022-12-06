package oops;

interface sampleInterface{
	void meth1();
	void meth2();
}

interface childSampleInterface extends sampleInterface{
	void meth3();
	void meth4();
}

class mySampleClass implements childSampleInterface{

	@Override
	public void meth1() {
		System.out.println("meth1");
		
	}

	@Override
	public void meth2() {
		System.out.println("meth2");
		
	}

	@Override
	public void meth3() {
		System.out.println("meth3");
		
	}

	@Override
	public void meth4() {
		System.out.println("meth4");
		
	}
	
}

public class cwh_58_InheritanceInInterface {

	public static void main(String[] args) {
		mySampleClass obj = new mySampleClass();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();

	}

}
