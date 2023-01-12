package com.example.onlineBanking.business.abstracts;

import java.util.List;

import com.example.onlineBanking.entities.concretes.User;

public interface UserService {
List<User> getAll();
void createUser(User user);
User updateUser(User user);
}
