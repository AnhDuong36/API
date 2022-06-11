package entity;

public class Order {
	private int  id ;
	private String code ;
	private String name ;
	private String email ;
	private String phone;
	private String address;
	private int totalQuantity;
	private float totalPrice;
	private boolean status;
	private int accountId;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String code, String name, String email, String phone, String address, int totalQuantity,
			float totalPrice, boolean status, int accountId) {
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
		this.accountId = accountId;
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
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", code=" + code + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", totalQuantity=" + totalQuantity + ", totalPrice=" + totalPrice
				+ ", status=" + status + ", accountId=" + accountId + "]";
	}
	
}
