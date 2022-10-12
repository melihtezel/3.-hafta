
public class CustomerManager {

	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer,ICreditManager creditManager) {
	// interface referans tiptir.
		_customer = customer;
	_creditManager = creditManager;
	}
	public void Save() {
	System.out.println("Müşteri Kaydedildi..");
	}
	
	public void  GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi..");
	}
	



}

