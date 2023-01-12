package com.example.onlineBanking.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineBanking.entities.concretes.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
}
