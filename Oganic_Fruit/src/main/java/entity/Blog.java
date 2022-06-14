package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Blog")
public class Blog {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "ID")
	private int id ;
	@Column(name = "Code")
	private String code ;
	@Column(name = "Name")
	private String name;
	@Column(name = "Description")
	private String description;
	@Column(name = "Images")
	private String images ;
	@Column(name = "Status")
	private boolean status;
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Blog(int id, String code, String name, String description, String images, boolean status) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.images = images;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description + ", images="
				+ images + ", status=" + status + "]";
	}
	
}
