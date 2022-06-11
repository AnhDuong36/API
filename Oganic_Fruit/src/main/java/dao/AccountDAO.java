package dao;

import java.util.List;

import entity.Account;

public interface AccountDAO {
	public List<Account> getListAccount();
	 public Account getAccountById(Integer accId);
	 public boolean insertAccount(Account acc);
	 public boolean updateAccount(Account acc);
	 public boolean deleteAccount(Integer accId);
}
