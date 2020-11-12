package src;

public class Employee
{
	
	String name, department, manager;
	
	public void setName (String n)
	{
		name = n;
	}
	
	public void setDepartment (String d)
	{
		department = d;
	}
	
	public void setManager (String m)
	{
		manager = m;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public String getDepartment ()
	{
		return department;
	}
	
	public String getManager ()
	{
		return manager;
	}
}
