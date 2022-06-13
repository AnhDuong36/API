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
@Table(name = "Rating")
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "ProductID", referencedColumnName = "ID")
	private Product prods;
//	private int productId;
	@ManyToOne
	@JoinColumn(name = "AccountID", referencedColumnName = "ID")
	private Account rating;
//	private int accountId;
	@Column(name = "Star")
	private float star;
	@Column(name = "Description")
	private String description;
	@Column(name = "Status")
	private boolean status;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(int id, Product prods, Account rating, float star, String description, boolean status) {
		super();
		this.id = id;
		this.prods = prods;
		this.rating = rating;
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
	public Product getProds() {
		return prods;
	}
	public void setProds(Product prods) {
		this.prods = prods;
	}
	public Account getRating() {
		return rating;
	}
	public void setRating(Account rating) {
		this.rating = rating;
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
		return "Rating [id=" + id + ", prods=" + prods + ", rating=" + rating + ", star=" + star + ", description="
				+ description + ", status=" + status + "]";
	}
	
}
