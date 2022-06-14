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

import dao.BannerDAOImp;
import entity.Banner;
import entity.BannerDTO;


@Path(value = "/bannerService")
public class BannerService {
	@GET
	@Path("/getListBanner")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListCities() {
		List<Banner> listBanner = new BannerDAOImp().selectAll();
		Gson son = new Gson();
		List<BannerDTO> listData = new ArrayList<BannerDTO>();
		for (Banner a : listBanner) {
			BannerDTO adto = new BannerDTO(a.getId(), a.getCode(), a.getName(), a.getImages(), a.isStatus());
			listData.add(adto);
		}
		String data = son.toJson(listData);
		return data;
	}

	@POST
	@Path("/insertBanner")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertBanner(String a) {
		Gson son = new Gson();
		BannerDTO objDTO = son.fromJson(a, BannerDTO.class);
		Banner objBanner = new Banner(0, objDTO.getCode(),objDTO.getName(),objDTO.getImages(),objDTO.isStatus());
		boolean bl = new BannerDAOImp().insert(objBanner);
		String data = son.toJson(bl);
		return data;
	}

	@POST
	@Path("/updateBanner")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateBanner(String a) {
		Gson son = new Gson();
		BannerDTO objDTO = son.fromJson(a, BannerDTO.class);
		Banner objBanner = new Banner(0, objDTO.getCode(),objDTO.getName(),objDTO.getImages(),objDTO.isStatus());
		boolean bl = new BannerDAOImp().update(objBanner);
		String data = son.toJson(bl);
		return data;
	}
	
	@POST
	@Path("/deleteBanner/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteBanner(@PathParam ("ID") Integer id) {
		Gson son = new Gson();
		boolean bl = new BannerDAOImp().remove(id);
		String data = son.toJson(bl);
		return data;
	}
}
