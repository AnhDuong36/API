package entity;

public class ProductDTO {
	private int id ;
	private String code ;
	private String name;
	private int categoryId;
	private String description;
	private boolean status;
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(int id, String code, String name, int categoryId, String description, boolean status) {
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
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
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
