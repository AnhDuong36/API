package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "Code")
	private String code;
	@Column(name = "Name")
	private String name;
	@Column(name = "Email")
	private String email;
	@Column(name = "Phone")
	private String phone;
	@Column(name = "Address")
	private String address;
	@Column(name = "TotalQuantity")
	private int totalQuantity;
	@Column(name = "TotalPrice")
	private float totalPrice;
	@Column(name = "Status")
	private boolean status;
	@ManyToOne
	@JoinColumn(name = "AccountID", referencedColumnName = "ID")
	private Account account;
	@OneToMany(mappedBy = "orderId")
	private List<OrderDetail> listOrderDetail;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int id, String code, String name, String email, String phone, String address, int totalQuantity,
			float totalPrice, boolean status, Account accountId, List<OrderDetail> listOrderDetail) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.totalQuantity = totalQuantity;
		this.totalPrice = totalPrice;
		this.status = status;
		this.account = accountId;
		this.listOrderDetail = listOrderDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Account getAccountId() {
		return account;
	}

	public void setAccountId(Account accountId) {
		this.account = accountId;
	}

	public List<OrderDetail> getListOrderDetail() {
		return listOrderDetail;
	}

	public void setListOrderDetail(List<OrderDetail> listOrderDetail) {
		this.listOrderDetail = listOrderDetail;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", code=" + code + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", totalQuantity=" + totalQuantity + ", totalPrice=" + totalPrice
				+ ", status=" + status + ", accountId=" + account + ", listOrderDetail=" + listOrderDetail + "]";
	}

}
