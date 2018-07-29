package com.deep.arya.dao.user;
import org.springframework.data.jpa.repository.JpaRepository;

import com.deep.arya.model.User;


public interface UserDbRepo extends JpaRepository<User,Integer> {

}
