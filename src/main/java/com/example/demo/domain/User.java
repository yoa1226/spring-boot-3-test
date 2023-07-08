package com.example.demo.domain;

import jakarta.persistence.Entity;

@Entity(name = "USERS")
public class User extends AbstractEntity<Long> implements WithTranslationKey {

//	@Id
//	@GeneratedValue
//	private Long id;

	private String name;


	public User() {
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getTranslationKey() {
		return name;
	}

	public void setTranslationKey(String name) {
		 this.name = name;
	}

	@Override
	public Long getId() {
		return super.getId();
	}

	@Override
	public void setId(Long aLong) {
		super.setId(aLong);
	}

	public String getName() {
		return name;
	}

	public User(String name) {
		this.name = name;
	}
//
//	@Override
//	public String toString() {
//		return "User{" +
//				"id=" + id +
//				", name='" + name + '\'' +
//				'}';
//	}
}
