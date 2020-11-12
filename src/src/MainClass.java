package src;

//Test


public class MainClass {

	public static void main(String[] args) {
		
		// Each attribute should have a getter and setter method. 
		
		// Classes with minimum Attributes (these must be included for the program to work)
		// Customer Should have name(String), and city(String)
		Customer Cust = new Customer();
		// Employee should have name (String), department(String), and Manager(String)
		Employee John = new Employee();
		// Manager should the same attributes of Employee with the addition of Store (String)	
		Manager Paul = new Manager();
		// Sale should have number of items(integer) and ItemName (String)
		Sale SaleStore = new Sale(); 
		
		// Item should have Name(String) and Price (double)
		Item TShirt = new Item();
		Item Mug = new Item();
		// Campus Store Should have Location(String), Number of Employes(integer), and name of manager (String)
		Shop CampusStore = new Shop();
		// Department should have Name (String), ManagerName(String), and Number of Employes(integer)
		Department SalesDept = new Department();
		// Complaint should have ComplaintNumber (integer) Receipt (String), EmployeeName (String), CustomerName(String) 
		Complaint Concern = new Complaint();
		
		// CompEmail should have Customer Name (String) Manager name (String) and Response (String)
		CompEmail BadItem = new CompEmail();
		// City should have Name(string) and Tax Rate (double), and StoreLocation (String)
		City Roseville = new City();
		// Transaction Should have CustomerName (String) 
		Transaction TShirtTrans = new Transaction();
		
		//Receipt should have Price (double) CustomerName (string) and Item Name (string)
		// It should also have a print Receipt Method (System.out.print or Joption pane attributes)
		Receipt Change = new Receipt();
		
		// Form should have Form number (integer), Manager Name(string), and department (String)
		//It should also have a print Form that allows a string input.
		Form Report = new Form();
		
		// Vendor Should have Name(String), Item Name Supplied (String),
		Vendor TShirtsRUs = new Vendor();
		
		// Warehouse should have an array of Item types(String, size is constructor) and Location(String)
		Warehouse RosevilleWareHouse = new Warehouse(10);
		
		// Delivery should have ItemName(String), CustomerName(String), DeliveryAddress(String), and TruckNumber (integer)
		Delivery ShirtDelivery = new Delivery();
		// DeliveryTruck should have a TruckNumber (integer), Trucktype (String), and Average MPG (double)
		DeliveryTruck Truck = new DeliveryTruck();
		
		double Pricing;
		String Response, ManagerReport;
		
		// Setup for Customer
		Cust.setName("Franklin Graham");
		Cust.setCity("Asheville");
				
		// Setup for Employee
		John.setName("John Mark");
		John.setDepartment("Sales");
		John.setManager("Paul");
		
		// Setup for Manager
		Paul.setName("Saul Paul");
		Paul.setDepartment("Sales");
		Paul.setManager("Peter");
		Paul.setStore("Roseville");
		
		// Setup for Department
		SalesDept.setName("Sales");
		SalesDept.setEmployeeCount(10);
		SalesDept.setHead("Simon Peter");
		
		// Setup for Items
		TShirt.setName("UNWSP Shirt");
		TShirt.setPrice(5.99);
		Mug.setName("UNSWP Mug");
		Mug.setPrice(4.99);
		
		// Setup for Trucks
		Truck.setNum(5532);
		Truck.setType("Semi-truck");
		Truck.setAveMPG(4.6);
		
		// Setup for Warehouse
		// The set and get methods should first get the index of where it will be stored in the array
		RosevilleWareHouse.setItem(0,"UNWSP Shirt");
		RosevilleWareHouse.setItem(1,"UNSWP Mug");
		RosevilleWareHouse.setLocation("Roseville");
		
		// Setup for Vendor
		TShirtsRUs.setName("T-Shirts-R-Us");
		TShirtsRUs.setItemSupplied("UNWSP Shirt");
		
		// Setup for Sale
		SaleStore.setItem("UNWSP Shirt");
		SaleStore.setNumber(3);
		
		// Setup for 
		CampusStore.setLocation("Billy");
		CampusStore.setEmployees(5);
		CampusStore.setManagerName(Paul.getName());
		
		Roseville.setTax(0.25);
		Roseville.setState("MN");
		Roseville.setStore(CampusStore.getLocation());
		
		Pricing = TShirt.getPrice()*SaleStore.getNumber()*Roseville.getTax();
		
		Change.setPrice(Pricing);
		Change.setName(Cust.getName());
		Change.setItem(SaleStore.getItem());	
		// This method should use all attributes within the class in the print output
		Change.Print();
		
		Concern.setReceipt("Receipt 3301");
		Concern.setNumber(1);
		Concern.setEmployeeName(John.getName());
		Concern.setCustomerName(Cust.getName());
		
		// a
		
		
		BadItem.setCustomer(Concern.getCustomerName());
		BadItem.setManagerName(Paul.getName());

		Response = "Hey, My T shirt has not been delivered" + BadItem.getManagerName();
		
		BadItem.setResponse(Response);

		// This is the setup for a Transaction Object
		TShirtTrans.setCustName(Cust.getName());
		TShirtTrans.setItem(Change.getItem());
		TShirtTrans.setTotal(Change.getPrice());
		
		ShirtDelivery.setItem(TShirtTrans.getItem());
		ShirtDelivery.setCustName(TShirtTrans.getCustName());
		ShirtDelivery.setDeliveryAddress("3003 Snelling Ave N, Roseville, MN 55113");
		ShirtDelivery.setTruckNum(Truck.getNum());
			
		
		ManagerReport= "We had a great sale of T-shirts this quarter. We got $" + Double.toString(TShirtTrans.getTotal())+ " out of one transaction";
		
		// This is the setup for a report object
		Report.setFormID(124);
		Report.setManagerName(John.getManager());
		Report.setDepartment(SalesDept.setName());
		// This method should use all attributes within the class in the print output in addition to the message.
		Report.print(ManagerReport);
		
		//This calls every get method
		
		System.out.println("");
		System.out.println("Report on all objects");
		System.out.println(Cust.getName() + " " + Cust.getCity());
		System.out.println(John.getName() + " " + John.getDepartment() +" " + John.getManager());
		System.out.println(Paul.getName() + " " + Paul.getDepartment() + " " + Paul.getManager() + " " + Paul.getStore());
		System.out.println(SalesDept.getName() + " " + SalesDept.getEmployeeCount() + SalesDept.getHead());
		System.out.println(Mug.getName() + " " + Mug.getPrice());
		System.out.println(Truck.setNum() + " " + Truck.getType() + " "+ Truck.getAveMPG());
		System.out.println(RosevilleWareHouse.getLocation() + " " + RosevilleWareHouse.getItem(0) + " " + RosevilleWareHouse.getItem(1));
		System.out.println(TShirtsRUs.getName() + " " + TShirtsRUs.getItemSupplied());
		System.out.println(SaleStore.getItem() + " " + SaleStore.getNumber());
		System.out.println(CampusStore.getLocation() + " " + CampusStore.getEmployees() + " " + CampusStore.getManagerName());
		System.out.println(Roseville.getTax() + " " + Roseville.getState() + " " + Roseville.getStore());
		System.out.println(Change.getPrice() + " " + Change.getName() + " " + Change.getItem());
		System.out.println(Concern.getReceipt() + " " +  Concern.getNumber() + " " + Concern.getEmployeeName() + " " + Concern.getCustomerName());
		System.out.println(BadItem.getCustomer() + " " + BadItem.getManagerName() + " " + BadItem.getResponse());
		System.out.println(TShirtTrans.getCustName() + " " + TShirtTrans.getItem() + " " + TShirtTrans.getTotal());
		System.out.println(ShirtDelivery.getItem() + " " + ShirtDelivery.getCustName() + ShirtDelivery.getDeliveryAddress() + " " + ShirtDelivery.getTruckNum());
		System.out.println(Report.getFormID() + " " + Report.getManagerName() + " " +Report.getDepartment());
		
	}

}

