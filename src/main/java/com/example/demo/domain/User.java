package com.example.demo.domain;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "USERS")
@Data
@NoArgsConstructor
public class User extends AbstractEntity implements WithTranslationKey {

	private String name;

	@Override
	public String getTranslationKey() {
		return name;
	}

	@Builder
	User(Long id, String name) {
		super(id);
		this.name = name;
	}
}
