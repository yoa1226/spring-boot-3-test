package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "USER_TRANSLATION")
public class UserTranslation extends AbstractTranslationEntity<User> {

	private String translation;

	@Builder
	UserTranslation(Long id, User classifier, String localeCode, String translation) {
		super(id, classifier, localeCode);
		this.translation = translation;
	}
}
