package com.example.onlineBanking.business.abstracts;

import java.util.List;

import com.example.onlineBanking.entities.concretes.Account;
import com.example.onlineBanking.entities.concretes.User;

public interface AccountService {
	List<Account> getAll();
	void createAccountForUser(Account account);
	void deleteAccountById(String id);
}
