package tilesample.customer;

import java.util.List;

public interface CustomerDAO {
	public Customer selectCustomer(int customerId);	
	
	public int deleteCustomer(int customerId);	
	
	public List<Customer> listCustomer();
	
	public int saveOrUpdateControl(Customer cust);
}
