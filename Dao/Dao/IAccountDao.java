package Dao;

import java.util.List;

import Models.*;

public interface IAccountDao {

	void insert(AccountModel account);

	void edit(AccountModel account);

	void delete(String username);

	AccountModel get(String username);

	List<AccountModel> getAll();

	AccountModel findById(String username);
}