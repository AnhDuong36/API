package entity;

public class CategoryDTO {
	private int id ;
	private String code ;
	private String name;
	private String description;
	private boolean status;
	public CategoryDTO(int id, String code, String name, String description, boolean status) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.status = status;
	}
	public CategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description + ", status="
				+ status + "]";
	}
	
}
