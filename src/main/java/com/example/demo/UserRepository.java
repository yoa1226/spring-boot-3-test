package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User>	 findIneByName(String name);

	default List<User> findBy(String name) {
		return findIneByName(name);
	}

	default Optional<User> findBy(long id) {
		return findById(id);
	}


}
