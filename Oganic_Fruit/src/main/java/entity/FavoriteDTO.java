package entity;

public class FavoriteDTO {

	private int id;
	private int productId;
	private int accountId;
	public FavoriteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FavoriteDTO(int id, int productId, int accountId) {
		super();
		this.id = id;
		this.productId = productId;
		this.productId = productId;
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
	@Override
	public String toString() {
		return "FavoriteDTO [id=" + id + ", productId=" + productId + ", accountId=" + accountId + "]";
	}
	
	
}
