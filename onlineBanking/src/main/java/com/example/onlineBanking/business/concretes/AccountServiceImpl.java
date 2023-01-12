package com.example.onlineBanking.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineBanking.business.abstracts.AccountService;
import com.example.onlineBanking.dataAccess.abstracts.AccountRepository;
import com.example.onlineBanking.dataAccess.abstracts.UserRepository;
import com.example.onlineBanking.entities.concretes.Account;
import com.example.onlineBanking.entities.concretes.User;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void createAccountForUser(Account account) {
		// TODO Auto-generated method stub
		Account newAccount = new Account();
		newAccount.setBalance(account.getBalance());
		newAccount.setCurrency(account.getCurrency());
	
		newAccount.setUser(userRepository.getReferenceById(account.getUser().getId()));
		
	}

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
		
	}


	@Override
	public void deleteAccountById(String id) {
		// TODO Auto-generated method stub
		Integer newId = Integer.parseInt(id);
		accountRepository.deleteById(newId);
	}
	
	

}
