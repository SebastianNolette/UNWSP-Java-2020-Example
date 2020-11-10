package src;

//Department should have Name (String), Head(String), and Number of Employes(integer)

//Eric Everson
//11/10/2020

public class Department 
{
	//variable(s)
	private String name, head;
	private int employeeCount;
	
	//name
	public String getName() {
		return name;
	}
	
	public void setName(String N) {
		name = N;
	}
	
	//employeeCount
	public int getEmployeeCount() {
		return employeeCount;
	}
	
	public void setEmployeeCount(int num) {
		employeeCount = num;
	}

	//head
	public String getHead() {
		return head;
	}
	
	public void setHead(String M) {
		head = M;
	}
	

	
}
