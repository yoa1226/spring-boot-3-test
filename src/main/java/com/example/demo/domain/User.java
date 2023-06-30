package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "USERS")
@Data
@NoArgsConstructor
public class User extends AbstractEntity<Long> implements WithTranslationKey {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Override
	public String getTranslationKey() {
		return name;
	}

	@Builder
	User(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
