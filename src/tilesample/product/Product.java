package tilesample.product;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1965636900617980283L;

	private int productId;
	private String productCode;
	private String productNameEng;
	private String productNameMm;
	private int quantity;
	private float basePrice;
	private float salePrice;
	private String comments;
	
	public Product() {}

	public Product(int productId, String productCode, String productNameEng, String productNameMm, int quantity,
			float basePrice, float salePrice, String comments) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.productNameEng = productNameEng;
		this.productNameMm = productNameMm;
		this.quantity = quantity;
		this.basePrice = basePrice;
		this.salePrice = salePrice;
		this.comments = comments;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductNameEng() {
		return productNameEng;
	}

	public void setProductNameEng(String productNameEng) {
		this.productNameEng = productNameEng;
	}

	public String getProductNameMm() {
		return productNameMm;
	}

	public void setProductNameMm(String productNameMm) {
		this.productNameMm = productNameMm;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}

	public float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCode=" + productCode + ", productNameEng=" + productNameEng
				+ ", productNameMm=" + productNameMm + ", quantity=" + quantity + ", basePrice=" + basePrice
				+ ", salePrice=" + salePrice + ", comments=" + comments + "]";
	}	
}
