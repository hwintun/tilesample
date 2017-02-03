package tilesample.product;

import java.io.Serializable;
import java.util.Date;

public class Warehouse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int warehouseId;
	private int productId;
	private String sellingPrice;
	private int quantity;
	private Date lastUpdateDate;
	private Date lastUpdateUser;	
	
	public Warehouse() {}

	public Warehouse(int warehouseId, int productId, String sellingPrice, int quantity, Date lastUpdateDate,
			Date lastUpdateUser) {
		super();
		this.warehouseId = warehouseId;
		this.productId = productId;
		this.sellingPrice = sellingPrice;
		this.quantity = quantity;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUser = lastUpdateUser;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Date getLastUpdateUser() {
		return lastUpdateUser;
	}

	public void setLastUpdateUser(Date lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	@Override
	public String toString() {
		return "Warehouse [warehouseId=" + warehouseId + ", productId=" + productId + ", sellingPrice=" + sellingPrice
				+ ", quantity=" + quantity + ", lastUpdateDate=" + lastUpdateDate + ", lastUpdateUser=" + lastUpdateUser
				+ "]";
	}
}
