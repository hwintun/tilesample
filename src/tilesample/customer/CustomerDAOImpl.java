package tilesample.customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class CustomerDAOImpl implements CustomerDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public CustomerDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Customer selectCustomer(int customerId) {
		final Customer c = new Customer();
		String sql = "select * from customers where customer_id=" + customerId;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Customer>() {

			@Override
			public Customer extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					c.setCustomerId(rs.getInt("customer_id"));
					c.setCustomerName(rs.getString("customer_name"));
					c.setCustomerContactNo(rs.getString("customer_phnoe_no"));
					c.setCustomerAddress(rs.getString("customer_address"));
					return c;
				}
				return null;
			}
			
		});
	}

	@Override
	public int insertCustomer(Customer cust) {
		String sql = "insert into customers (customer_id, customer_name, customer_phone_no, customer_address) values (?,?,?,?)";		
		return jdbcTemplate.update(sql, cust.getCustomerId(), cust.getCustomerName(), cust.getCustomerContactNo(), cust.getCustomerAddress());
	}

	@Override
	public int deleteCustomer(int customerId) {
		String sql = "delete from customers where customer_id=?";		
		return jdbcTemplate.update(sql, customerId);
	}

	@Override
	public int updateCustomer(Customer cust) {
		String sql = "update customers set customer_name=?, customer_phone_no=?, customer_address=? where customer_id=?";
		return jdbcTemplate.update(sql, cust.getCustomerName(), cust.getCustomerContactNo(), cust.getCustomerAddress(), cust.getCustomerId());
	}

	@Override
	public List<Customer> listCustomer() {
		String sql = "select * from customers";
		List<Customer> customerList = jdbcTemplate.query(sql, new RowMapper<Customer>(){

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer c = new Customer();
				c.setCustomerId(rs.getInt("customer_id"));
				c.setCustomerName(rs.getString("customer_name"));
				c.setCustomerContactNo(rs.getString("customer_phnoe_no"));
				c.setCustomerAddress(rs.getString("customer_address"));
				return c;
			}			
		});
		return customerList;
	}

}
