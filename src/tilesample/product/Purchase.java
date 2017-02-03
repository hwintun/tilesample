package tilesample.product;

import java.io.Serializable;
import java.util.Date;

public class Purchase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int purchaseId;
	private int productId;
	private int quantity;
	private double basePrice;
	private Date purchaseDate;
	private Date lastUpdateDate;
	private Date lastUpdateUser;
	
	public Purchase() {}

	public Purchase(int purchaseId, int productId, int quantity, double basePrice, Date purchaseDate,
			Date lastUpdateDate, Date lastUpdateUser) {
		super();
		this.purchaseId = purchaseId;
		this.productId = productId;
		this.quantity = quantity;
		this.basePrice = basePrice;
		this.purchaseDate = purchaseDate;
		this.lastUpdateDate = lastUpdateDate;
		this.lastUpdateUser = lastUpdateUser;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
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
		return "Purchase [purchaseId=" + purchaseId + ", productId=" + productId + ", quantity=" + quantity
				+ ", basePrice=" + basePrice + ", purchaseDate=" + purchaseDate + ", lastUpdateDate=" + lastUpdateDate
				+ ", lastUpdateUser=" + lastUpdateUser + "]";
	}	
}
