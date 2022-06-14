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
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id ;
	@Column(name = "Code")
	private String code ;
	@Column(name = "Name")
	private String name;
	@ManyToOne
	@JoinColumn(name = "CategoryId", referencedColumnName = "ID")
	private Category categoryId;
	@Column(name = "Description")
	private String description;
	@Column(name = "Status")
	private boolean status;
	@OneToMany(mappedBy = "productId")
	private List<OrderDetail> listOrderDetail;
	@OneToMany(mappedBy = "productId")
	private List<Favorite> listFavorite;
	@OneToMany(mappedBy = "productId")
	private List<Rating> listRating;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String code, String name, Category categoryId, String description, boolean status) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.categoryId = categoryId;
		this.description = description;
		this.status = status;
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
	public Category getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
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
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", categoryId=" + categoryId
				+ ", description=" + description + ", status=" + status + "]";
	}
	
}
