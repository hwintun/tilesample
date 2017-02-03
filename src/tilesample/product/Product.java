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
	private String note;
	
	public Product() {}

	public Product(int productId, String productCode, String productNameEng, String productNameMm, String note) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.productNameEng = productNameEng;
		this.productNameMm = productNameMm;
		this.note = note;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCode=" + productCode + ", productNameEng=" + productNameEng
				+ ", productNameMm=" + productNameMm + ", note=" + note + "]";
	}
}
