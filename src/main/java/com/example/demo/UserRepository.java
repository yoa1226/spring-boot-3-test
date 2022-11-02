package com.example.demo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	Optional<User> findIneByName(String name);

	default Optional<User> findBy(String name) {
		return findIneByName(name);
	}

	default Optional<User> findBy(long id) {
		return findById(id);
	}


}
