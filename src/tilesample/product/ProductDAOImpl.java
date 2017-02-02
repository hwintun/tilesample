package tilesample.product;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import tilesample.customer.Customer;

public class ProductDAOImpl implements ProductDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public ProductDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//////////////////////////////////////////////////////////////////////////
	//////////////////// PRIVATE METHODS - START /////////////////////////////
	//////////////////////////////////////////////////////////////////////////
	private int insertProduct(Product product) {
		String sql = "insert into products (product_id, product_code, product_name_mm, product_name_eng, product_quantity, product_base_price, product_sale_price, comments) values (?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, 
					product.getProductId(), product.getProductCode(), product.getProductNameMm(), product.getProductNameEng(), product.getQuantity(), 
					product.getBasePrice(), product.getSalePrice(), product.getComments());
	}
	
	private int updateProduct(Product product) {
		String sql = "update customers set product_code=?, product_name_mm=?, product_name_eng=?, product_quantity=?, product_base_price=?, product_sale_price=?, comments=? where product_id=?";
		return jdbcTemplate.update(sql, 
							product.getProductCode(), product.getProductNameMm(), product.getProductNameEng(), product.getQuantity(), 
							product.getBasePrice(), product.getSalePrice(), product.getComments(), product.getProductId());
	}
	//////////////////////////////////////////////////////////////////////////
	//////////////////// PRIVATE METHODS - END ///////////////////////////////
	//////////////////////////////////////////////////////////////////////////	

	@Override
	public Product selectProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int saveOrUpdateProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

}
