package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER_TRANSLATION")
public class UserTranslation extends AbstractTranslationEntity<User> {

//	@Id
//	@GeneratedValue
//	private Long id;

	private String translation;

	public UserTranslation() {
	}

	public UserTranslation(User classifier, String localeCode, String translation) {
		super(classifier, localeCode);
		this.translation = translation;
	}

	@Override
	public Long getId() {
		return super.getId();
	}

	@Override
	public void setId(Long aLong) {
		super.setId(aLong);
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

//	@Override
//	public String toString() {
//	}
}
