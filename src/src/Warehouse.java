package src;

public class Warehouse {
	Item[] items;
	String location;
	
	public Warehouse(int size, String loc) {
		items = new Item[size];
		location=loc;
	}
	
	public Item getItem(int i) {
		return items[i];
	}
	
	public void setItem(int i, Item q) {
		items[i]=q;
	}

	public String getLocation() {
		return location;
	}
	

	public void setLocation(String name) {
		location=name;
	}

}
