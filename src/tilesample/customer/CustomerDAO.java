package tilesample.customer;

import java.util.List;

public interface CustomerDAO {
	public Customer selectCustomer(int customerId);
	
	public int insertCustomer(Customer cust);
	
	public int deleteCustomer(int customerId);
	
	public int updateCustomer(Customer cust);
	
	public List<Customer> listCustomer();
}
