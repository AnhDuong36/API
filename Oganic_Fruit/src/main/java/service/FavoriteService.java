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

import dao.FavoriteDAOImp;
import entity.Account;
import entity.Favorite;
import entity.FavoriteDTO;
import entity.Product;

@Path(value = "/favoriteService")
public class FavoriteService {
	@GET
	@Path("/getListFavorite")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListCities() {
		List<Favorite> listFavorite = new FavoriteDAOImp().selectAll();
		Gson son = new Gson();
		List<FavoriteDTO> listData = new ArrayList<FavoriteDTO>();
		for (Favorite a : listFavorite) {
			FavoriteDTO adto = new FavoriteDTO();
			listData.add(adto);
		}
		String data = son.toJson(listData);
		return data;
	}

	@POST
	@Path("/insertFavorite")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertFavorite(String a) {
		Gson son = new Gson();
		FavoriteDTO objDTO = son.fromJson(a, FavoriteDTO.class);
		Product objProduct = new Product();
		objProduct.setId(objDTO.getProductId());
		Account objAccount = new Account();
		objAccount.setId(objDTO.getAccountId());
		Favorite objFavorite = new Favorite(0, objProduct,objAccount);
		boolean bl = new FavoriteDAOImp().insert(objFavorite);
		String data = son.toJson(bl);
		return data;
	}

	@POST
	@Path("/updateFavorite")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateFavorite(String a) {
		Gson son = new Gson();
		FavoriteDTO objDTO = son.fromJson(a, FavoriteDTO.class);
		Product objProduct = new Product();
		objProduct.setId(objDTO.getProductId());
		Account objAccount = new Account();
		objAccount.setId(objDTO.getAccountId());
		Favorite objFavorite = new Favorite(0, objProduct,objAccount);
		boolean bl = new FavoriteDAOImp().update(objFavorite);
		String data = son.toJson(bl);
		return data;
	}
	
	@POST
	@Path("/deleteFavorite/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteFavorite(@PathParam ("ID") Integer id) {
		Gson son = new Gson();
		boolean bl = new FavoriteDAOImp().remove(id);
		String data = son.toJson(bl);
		return data;
	}
}
