package src;

public class Receipt {
	double Price;
	String CustomerName;
	String Item;
	
	public void setPrice(double p){
		Price=p;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public void setName(String n){
		CustomerName=n;
	}
	
	public String getName() {
		return CustomerName;
	}
	
	public void setItem(String i){
		Item=i;
	}
	
	public String getItem() {
		return Item;
	}
	
	public void Print() {
		System.out.print("Name: "+CustomerName+"\nPrice: "+Price+"\nItem: "+Item+"\n");
	}
}
