package entity;

public class Rating {
	private int id;
	private int productId;
	private int accountId;
	private float star;
	private String description;
	private boolean status;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(int id, int productId, int accountId, float star, String description, boolean status) {
		super();
		this.id = id;
		this.productId = productId;
		this.accountId = accountId;
		this.star = star;
		this.description = description;
		this.status = status;
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
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public float getStar() {
		return star;
	}
	public void setStar(float star) {
		this.star = star;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Rating [id=" + id + ", productId=" + productId + ", accountId=" + accountId + ", star=" + star
				+ ", description=" + description + ", status=" + status + "]";
	}
	
}
