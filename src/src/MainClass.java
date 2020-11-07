package src;




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
		// Sale should have number of items(integer) and Item (class)
		Sale SaleStore = new Sale();
		// Item should have Name(String) and Price double
		Item TShirt = new Item();
		Item Mug = new Item();
		// Campus Store Should have Location(String), Number of Employes(integer), and name of manager (String)
		Shop CampusStore = new shop();
		// Department should have Name (String), ManagerName(String), and Number of Employes(integer)
		Department SalesDept = new Department();
		// Complaint should have ComplaintNumber (integer) Receipt (class), EmployeeName (String), CustomerName(String) 
		Complaint Concern = new Complaint();
		// CompEmail should have Customer Name (String) Manager name (String) and Response (String)
		CompEmail BadItem = new CompEmail();
		// City should have Name(string) and Tax Rate (double), and StoreLocation (String)
		City Roseville = new City();
		
		// Transaction Should have CustomerName (String) 
		Transaction TShirtTrans = new Transaction();
		
		//Receipt should have Price (double) CustomerName (string) and Item (string)
		// It should also have a print Receipt Method (System.out.print or Joption pane attributes)
		Receipt Change = new Receipt();
		
		// Form should have Form number (integer), Manager Name(string), and department (String)
		//It should also have a print Form.
		Form Report = new Form();
		
		// Vendor Should have Name(String), Item Name Supplied (String),
		Vendor TShirtsRUs = new Vendor();
		
		// Warehouse should have an array of Item types(Item, size is constructor) and Location(String)
		Warehouse RosvilleWareHouse = new Warehouse(10);
		
		// Delivery should have ItemName(String), CustomerName(String), DeliveryAddress(String)
		Delivery ShirtDelivery = new Delivery();
		
		
		
		double Pricing;
		String Response, ManagerReport;
		
		
		Cust.setName("Franklin Graham");
		Cust.setCity("Asheville");
				
		John.setName("John Mark");
		John.setDepartment("Sales");
		John.setManager("Paul");
		
		
		Paul.setName("Saul Paul");
		Paul.setDepartment("Sales");
		Paul.setManager("Peter");
		Paul.setStore("Roseville");
		
		SalesDept.setName("Sales");
		SalesDept.setEmployeeCount(10);
		SalesDept.setHead("Simon Peter");
		
		
		TShirt.setName("UNWSP Shirt");
		TShirt.setPrice(5.99);
		Mug.setName("UNSWP Mug");
		Mug.setPrice(4.99);
		
		RosvilleWareHouse.setItem(0,TShirt);
		RosvilleWareHouse.setItem(1,Mug);
		RosvilleWareHouse.setLocation("Roseville");
		
		TShirtsRUs.setName("T-Shirts-R-Us");
		TShirtsRUs.setItemSupplied("UNWSP Shirt");
		
		SaleStore.setItem(TShirt);
		SaleStore.setNumber(3);
		
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
		
		Concern.setReceipt(Change);
		Concern.setNumber(1);
		Concern.setEmployeeName(John.getName());
		Concern.setCustomerName(Cust.getName());
		
		// 
		
		
		BadItem.setCustomer(Concern.getCustomerName);
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
		
			
		ManagerReport= "We had a great sale of T-shirts this quarter. We got $" + Double.toString(TShirtTrans.getTotal())+ " out of one transaction";
		
		// This is the setup for a report object
		Report.setnumber(124);
		Report.setManagerName(John.getManager());
		Report.setDepartment(SalesDept.setName());
		// This method should use all attributes within the class in the print output in addition to the message.
		Report.print(ManagerReport);
		
		//
		
		
		
		

	}

}
