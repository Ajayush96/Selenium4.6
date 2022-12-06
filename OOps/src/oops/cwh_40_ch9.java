package oops;

class MyEmployee{
	private int id;
	private String name;
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setId(int i) {
		this.id=i;
	}
	public int getId() {
		return id;
	}
}

public class cwh_40_ch9 {

	public static void main(String[] args) {
		
		MyEmployee harry = new MyEmployee();
//		harry.id=54;
//		harry.name="codeWithHarry";
		harry.setName("This is Private modifier");
		System.out.println(harry.getName());

	}

}
