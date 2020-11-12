package src;

public class Complaint 
{
	private int number;
	private String CustName;
	private String EmpName;
	private String rcpt;
	
	public void setReceipt(String r)
	{
		rcpt = r;
	}
	public String getReceipt()
	{
		return rcpt;
	}
	public void setNumber(int n)
	{
		number = n;
	}
	public int getNumber()
	{
		return number;
	}
	public void setEmployeeName(String en)
	{
		EmpName = en;
	}
	public String getEmployeeName()
	{
		return EmpName;
	}
	public void setCustomerName(String cn)
	{
		CustName = cn;
	}
	public String getCustomerName()
	{
		return CustName;
	}
}
