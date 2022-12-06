package oops;

class MyMainEmployee{
	private int id;
	private String name;
	
//	public MyMainEmployee() {
//		id = 65;
//		name = "Your-name-here";
//	}
	public MyMainEmployee(String Myname,int MyId) {
		id = MyId;
		name = Myname;
	}
	public MyMainEmployee() {
		id = 12;
		name = "This is overloading testing";
	}
	public MyMainEmployee(String YourName) {
		id = 18;
		name = YourName;
	}
	public String getName() {return name;}
	public void setName(String n) {this.name= n;}
	
	public int getId() {return id;}
	public void setId(int i) {this.id = i;}
	
}

public class cwh_42_constructors {

	public static void main(String[] args) {
		
		MyMainEmployee harry = new MyMainEmployee("This is Constructor",4001);
		MyMainEmployee harry1 = new MyMainEmployee("This is Constructor1");
		MyMainEmployee harry2 = new MyMainEmployee();
//		harry.setName("codeWithHarry");
//		harry.setId(14);
		System.out.println(harry.getName()+" " + harry1.getName()+" "+harry2.getName());
		System.out.println(harry.getId()+" "+harry1.getId()+" "+harry2.getId());

	}

}
