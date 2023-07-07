package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "USERS")
public class User extends AbstractEntity<Long> implements WithTranslationKey {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Override
	public String getTranslationKey() {
		return name;
	}

	@Override
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public User(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
