package src;

public class Transaction {
	String custName;
	String item;
	double total;
	
	public Transaction() {
		
	}
	
	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String cust) {
		custName=cust;
	}

	public String getItem() {
		return item;
	}
	
	public void setItem(String change) {
		item=change;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double change) {
		total=change;
	}

}
