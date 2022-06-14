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
@Table(name = "Favorite")
public class Favorite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@ManyToOne
	@JoinColumn(name = "ProductID", referencedColumnName = "ID")
	private Product productId;
	@ManyToOne
	@JoinColumn(name = "AccountID", referencedColumnName = "ID")
	private Account account;

	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Favorite(int id, Product productId, Account accountId) {
		super();
		this.id = id;
		this.productId = productId;
		this.account = accountId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public Account getAccountId() {
		return account;
	}

	public void setAccountId(Account accountId) {
		this.account = accountId;
	}

	@Override
	public String toString() {
		return "Favorite [id=" + id + ", productId=" + productId + ", accountId=" + account + "]";
	}

}
