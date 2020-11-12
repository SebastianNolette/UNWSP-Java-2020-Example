package src;//Test

//Warehouse should have an array of Item types(Item, size is constructor) and Location(String)

public class Warehouse {
	String[] items;
	String location;
	
	public Warehouse(int size, String loc) {
		items = new String[size];
		location=loc;
	}
	
	public String getItem(int i) {
		return items[i];
	}
	
	public void setItem(int i, String q) {
		items[i]=q;
	}

	public String getLocation() {
		return location;
	}
	
	public void setLocation(String loc) {
		location=loc;
	}

}
