package com.javatech.repository;

import org.springframework.data.repository.CrudRepository;

import com.javatech.entities.User;

public interface UserRepsoitory extends CrudRepository<User, Integer>{

}
