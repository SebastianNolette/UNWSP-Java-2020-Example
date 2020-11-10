package src;

//Department should have Name (String), Head(String), and Number of Employes(integer)

public class Department 
{
	//variable(s)
	private String name, head;
	private int employeeCount;
	
	/*dont need this?
	public Department(String N, String M, int num)
	{
		name = N;
		head = M;
		employeeCount = num;
	}
	*/
	
	public String getName() {
		return name;
	}
	
	public void setName(String N) {
		name = N;
	}
	
	public int getEmployeeCount() {
		return employeeCount;
	}
	
	public void setEmployeeCount(int num) {
		employeeCount = num;
	}

	public String getHead() {
		return head;
	}
	
	public void setHead(String M) {
		head = M;
	}
	

	
}
