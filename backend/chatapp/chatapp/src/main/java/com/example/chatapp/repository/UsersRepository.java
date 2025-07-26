package com.example.chatapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.chatapp.entity.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {
	
}
