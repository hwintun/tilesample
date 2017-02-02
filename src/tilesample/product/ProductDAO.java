package tilesample.product;

import java.util.List;

public interface ProductDAO {
	public Product selectProduct(int productId);
	
	public int deleteProduct(int productId);
	
	public List<Product> listProduct();
	
	public int saveOrUpdateProduct(Product product);
}
