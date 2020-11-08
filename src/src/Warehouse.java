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
		// TODO Auto-generated method stub
		return null;
	}

}
