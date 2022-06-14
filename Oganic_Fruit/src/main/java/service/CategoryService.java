package service;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import dao.CategoryDAOImp;
import entity.Category;
import entity.CategoryDTO;

@Path(value = "/categoryService")
public class CategoryService {
	@GET
	@Path("/getListCategory")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListCities() {
		List<Category> listCategory = new CategoryDAOImp().selectAll();
		Gson son = new Gson();
		List<CategoryDTO> listData = new ArrayList<CategoryDTO>();
		for (Category a : listCategory) {
			CategoryDTO adto = new CategoryDTO(a.getId(), a.getCode(), a.getName(), a.getDescription(), a.isStatus());
			listData.add(adto);
		}
		String data = son.toJson(listData);
		return data;
	}

	@POST
	@Path("/insertCategory")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertCategory(String a) {
		Gson son = new Gson();
		CategoryDTO objDTO = son.fromJson(a, CategoryDTO.class);
		Category objCategory = new Category(0, objDTO.getCode(),objDTO.getName(),objDTO.getDescription(),objDTO.isStatus());
		boolean bl = new CategoryDAOImp().insert(objCategory);
		String data = son.toJson(bl);
		return data;
	}

	@POST
	@Path("/updateCategory")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateCategory(String a) {
		Gson son = new Gson();
		CategoryDTO objDTO = son.fromJson(a, CategoryDTO.class);
		Category objCategory = new Category(0, objDTO.getCode(),objDTO.getName(),objDTO.getDescription(),objDTO.isStatus());
		boolean bl = new CategoryDAOImp().update(objCategory);
		String data = son.toJson(bl);
		return data;
	}
	
	@POST
	@Path("/deleteCategory/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteCategory(@PathParam ("ID") Integer id) {
		Gson son = new Gson();
		boolean bl = new CategoryDAOImp().remove(id);
		String data = son.toJson(bl);
		return data;
	}
}
