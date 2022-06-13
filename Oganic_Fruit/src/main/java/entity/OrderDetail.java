package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OrderDetail")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "ProductID", referencedColumnName = "ID")
	private Product product;
//	private int productId;
	@ManyToOne
	@JoinColumn(name = "OrderID", referencedColumnName = "ID")
	private Order orderDetail;
//	private int orderId;
	@Column(name = "Price")
	private float price;
	@Column(name = "Quantity")
	private int quantity;
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetail(int id, Product product, Order orderDetail, float price, int quantity) {
		super();
		this.id = id;
		this.product = product;
		this.orderDetail = orderDetail;
		this.price = price;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(Order orderDetail) {
		this.orderDetail = orderDetail;
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
		return "OrderDetail [id=" + id + ", product=" + product + ", orderDetail=" + orderDetail + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
}
