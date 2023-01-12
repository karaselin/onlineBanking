package com.example.onlineBanking.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineBanking.business.abstracts.AccountService;
import com.example.onlineBanking.entities.concretes.Account;
import com.example.onlineBanking.entities.concretes.User;

/*
*@AuthorSelinKara
*/

@RestController
@RequestMapping("/api/accounts")
public class AccountsController {
	
	@Autowired
	private AccountService accountService;

	
	@Autowired
	public AccountsController(AccountService accountService) {
		super();
		this.accountService = accountService;
		
	}
	
	@GetMapping("/getAll")
	public List<Account> getAll(){
		List<Account> accounts = accountService.getAll();
		return accounts;
	}
	
	@PostMapping(path = "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Account account) {
		this.accountService.createAccountForUser(account);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable String id) {
		this.accountService.deleteAccountById(id);
	}
}
