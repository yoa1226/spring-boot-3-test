package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER_TRANSLATION")
public class UserTranslation extends AbstractTranslationEntity<User> {

	@Id
	@GeneratedValue
	private Long id;

	private String translation;

	public UserTranslation() {
	}

	public UserTranslation(User classifier, String localeCode, String translation) {
		super(classifier, localeCode);
		this.translation = translation;
	}

	@Override
	public Long getId() {
		return id;
	}

	public String getTranslation() {
		return translation;
	}

	@Override
	public String toString() {
		return "UserTranslation{" +
				"id=" + id +
				", translation='" + translation + '\'' +
				'}';
	}
}
