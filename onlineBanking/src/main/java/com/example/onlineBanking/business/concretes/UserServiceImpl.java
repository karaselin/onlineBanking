package com.example.onlineBanking.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineBanking.business.abstracts.UserService;
import com.example.onlineBanking.dataAccess.abstracts.UserRepository;
import com.example.onlineBanking.entities.concretes.User;

@Service
public class UserServiceImpl implements UserService {
	//business rules
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		User newUser = new User();
		newUser.setName(user.getName());
		newUser.setSurname(user.getSurname());
		newUser.seteMail(user.geteMail());
		newUser.setIdentificationNumber(user.getIdentificationNumber());
		this.userRepository.save(newUser);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		User userToUpdate = userRepository.getReferenceById(user.getId());
		userToUpdate.setName(user.getName());
		userToUpdate.seteMail(user.geteMail());
		userToUpdate.setSurname(user.getSurname());
		this.userRepository.save(userToUpdate);
		return userToUpdate;
	}
}
