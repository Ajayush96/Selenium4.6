package oops;

class Employee1{
	int Salary;
	String name;
	
	public int getSalary() {
		return Salary;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String n) {
		name = n;
	}
}
public class practiceSet1 {

	public static void main(String[] args) {
		
		Employee1 harry = new Employee1();
		
		harry.setName("This is practice1");
		harry.Salary = 34;
		
		System.out.println(harry.getSalary());
		System.out.println(harry.getName());

	}

}
