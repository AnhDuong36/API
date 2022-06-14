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

import dao.BlogDAOImp;
import entity.Blog;
import entity.BlogDTO;

@Path(value = "/blogService")
public class BlogService {
	@GET
	@Path("/getListBlog")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListCities() {
		List<Blog> listBlog = new BlogDAOImp().selectAll();
		Gson son = new Gson();
		List<BlogDTO> listData = new ArrayList<BlogDTO>();
		for (Blog a : listBlog) {
			BlogDTO adto = new BlogDTO(a.getId(), a.getCode(), a.getName(), a.getDescription(),a.getImages(), a.isStatus());
			listData.add(adto);
		}
		String data = son.toJson(listData);
		return data;
	}

	@POST
	@Path("/insertBlog")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertBlog(String a) {
		Gson son = new Gson();
		BlogDTO objDTO = son.fromJson(a, BlogDTO.class);
		Blog objBlog = new Blog(0, objDTO.getCode(),objDTO.getName(),objDTO.getDescription(),objDTO.getImages(),objDTO.isStatus());
		boolean bl = new BlogDAOImp().insert(objBlog);
		String data = son.toJson(bl);
		return data;
	}

	@POST
	@Path("/updateBlog")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateBlog(String a) {
		Gson son = new Gson();
		BlogDTO objDTO = son.fromJson(a, BlogDTO.class);
		Blog objBlog = new Blog(0, objDTO.getCode(),objDTO.getName(),objDTO.getDescription(),objDTO.getImages(),objDTO.isStatus());
		boolean bl = new BlogDAOImp().update(objBlog);
		String data = son.toJson(bl);
		return data;
	}
	
	@POST
	@Path("/deleteBlog/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteBlog(@PathParam ("ID") Integer id) {
		Gson son = new Gson();
		boolean bl = new BlogDAOImp().remove(id);
		String data = son.toJson(bl);
		return data;
	}
}
