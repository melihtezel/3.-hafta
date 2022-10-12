
public class Main {

	public static void main(String[] args) {
	CreditManager creditManager = new CreditManager();
	creditManager.Calculate();
    
	
	Customer customer1 = new Customer();
	customer1.setId(1);
	customer1.setLastName("tezel");
	customer1.setName("melih");
	
	Customer customer2 = new Customer();
	customer2.setId(3);
	customer2.setLastName("tezel");
	customer2.setName("murat");
	
	Customer[] customers= {customer1,customer2};
	for (Customer customer : customers) {
		System.out.println(customer.getName());
	}
	
	Company company = new Company();
	company.taxNumber ="5";
	Person person = new Person();
	person.nationalIdentity="123456";
	person.setName("Melih");
	person.setId(1);
	
	
	
	}
}
