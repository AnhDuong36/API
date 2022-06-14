package entity;

import javax.persistence.Entity;
import javax.persistence.Table;


public class BannerDTO {
	private int id ;
	private String code ;
	private String name;
	private String images ;
	private boolean status;
	public BannerDTO(int id, String code, String name, String images, boolean status) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.images = images;
		this.status = status;
	}
	public BannerDTO() {
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
		return "Banner [id=" + id + ", code=" + code + ", name=" + name + ", images=" + images + ", status=" + status
				+ "]";
	}
	
}
