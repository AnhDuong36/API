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

import dao.AccountDAOImp;
import entity.Account;
import entity.AccountDTO;

@Path(value = "/accountService")
public class AccountService {
	@GET
	@Path("/getListAccount")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListCities() {
		List<Account> listAccount = new AccountDAOImp().getListAccount();
		Gson son = new Gson();
		List<AccountDTO> listData = new ArrayList<AccountDTO>();
		for (Account a : listAccount) {
			AccountDTO adto = new AccountDTO(a.getId(), a.getCode(), a.getName(), a.getEmail(), a.getPhone(),
					a.getBirthday(), a.getAddress(), a.isRole(), a.isGender());
			listData.add(adto);
		}
		String data = son.toJson(listData);
		
		return data;
	}

	@POST
	@Path("/insertAccount")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertAccount(String a) {
		Gson son = new Gson();
		AccountDTO objDTO = son.fromJson(a, AccountDTO.class);
		Account objAccount = new Account(0, objDTO.getCode(),objDTO.getName(),objDTO.getEmail(),objDTO.getPhone(),objDTO.getAddress(),objDTO.getBirthday(),objDTO.isGender(),objDTO.isRole());
		boolean bl = new AccountDAOImp().insertAccount(objAccount);
		String data = son.toJson(bl);
		return data;
	}

	@POST
	@Path("/updateAccount")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateAccount(String a) {
		Gson son = new Gson();
		AccountDTO objDTO = son.fromJson(a, AccountDTO.class);
		Account objAccount = new Account(0, objDTO.getCode(),objDTO.getName(),objDTO.getEmail(),objDTO.getPhone(),objDTO.getAddress(),objDTO.getBirthday(),objDTO.isGender(),objDTO.isRole());
		boolean bl = new AccountDAOImp().updateAccount(objAccount);
		String data = son.toJson(bl);
		return data;
	}
	
	@POST
	@Path("/deleteAccount/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String deleteAccount(@PathParam ("ID") Integer id) {
		Gson son = new Gson();
		boolean bl = new AccountDAOImp().deleteAccount(id);
		String data = son.toJson(bl);
		return data;
	}
}
