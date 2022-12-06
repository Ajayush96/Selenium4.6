package oops;

class Employee{
	int id;
	String name;
	int Salary;
	public void printDetails() {
		System.out.println("My id is "+ id);
		System.out.println("My name is "+ name);
	}
	public int getSalary() {
		return Salary;
		
	}
	
}

public class customClass {

	public static void main(String[] args) {

		Employee harry = new Employee();//instanciting a new Employee Object
		Employee john = new Employee();
		//setting attribute for harry
		harry.id = 15;
		harry.name= "codeWithHarry";
		harry.Salary=34;
		
		//setting attribute for harry
		john.id=17;
		john.name="john jha";
		john.Salary=12;
		
		//printing the attribute
//		System.out.println(harry.id);
//		System.out.println(harry.name);
		harry.printDetails();
		john.printDetails();
		
		//int Salary = john.getSalary();
		System.out.println(john.getSalary());
		
	}

}
