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
	@Column(name = "Id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "ProductID", referencedColumnName = "ID")
	private Product prod;
//	private int productId;
	@ManyToOne
	@JoinColumn(name = "AccountID", referencedColumnName = "ID")
	private Account favorite;
//	private int accountId;
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Favorite(int id, Product prod, Account favorite) {
		super();
		this.id = id;
		this.prod = prod;
		this.favorite = favorite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	public Account getFavorite() {
		return favorite;
	}
	public void setFavorite(Account favorite) {
		this.favorite = favorite;
	}
	@Override
	public String toString() {
		return "Favorite [id=" + id + ", prod=" + prod + ", favorite=" + favorite + "]";
	}
	
	
	
}
