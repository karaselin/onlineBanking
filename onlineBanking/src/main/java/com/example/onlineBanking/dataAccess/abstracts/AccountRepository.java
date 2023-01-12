package com.example.onlineBanking.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineBanking.entities.concretes.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {

}
