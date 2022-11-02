package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@MappedSuperclass
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public abstract class AbstractTranslationEntity<T extends AbstractEntity & WithTranslationKey> extends AbstractEntity {

	@JoinColumn(name = "CLASSIFIER_ID", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private T classifier;

	@Column(name = "LOCALE_CODE", length = 15, nullable = false)
	private String localeCode;

	AbstractTranslationEntity(Long id, T classifier, String localeCode) {
		super(id);
		this.classifier = classifier;
		this.localeCode = localeCode;
	}
}
