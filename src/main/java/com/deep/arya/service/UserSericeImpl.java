package com.deep.arya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deep.arya.dao.user.UserDbRepo;
import com.deep.arya.model.User;

@Service
public class UserSericeImpl implements UserSerivce {

	@Autowired
	UserDbRepo userdbRepo; 

	
	@Override
	public List<User> getAllUser() {
		return userdbRepo.findAll();
		
	}

}
