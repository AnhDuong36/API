package entity;

public class OrderDetail {
	private int id;
	private int productId;
	private int orderId;
	private float price;
	private int quantity;
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetail(int id, int productId, int orderId, float price, int quantity) {
		super();
		this.id = id;
		this.productId = productId;
		this.orderId = orderId;
		this.price = price;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", productId=" + productId + ", orderId=" + orderId + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
}
