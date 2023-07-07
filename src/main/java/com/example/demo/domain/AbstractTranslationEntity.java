package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractTranslationEntity<T extends AbstractEntity<Long> & WithTranslationKey> extends AbstractEntity<Long> {

	@JoinColumn(name = "CLASSIFIER_ID", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private T classifier;

	@Column(name = "LOCALE_CODE", length = 15, nullable = false)
	private String localeCode;

	public AbstractTranslationEntity() {
	}

	AbstractTranslationEntity(T classifier, String localeCode) {
		this.classifier = classifier;
		this.localeCode = localeCode;
	}

	public T getClassifier() {
		return classifier;
	}

	public String getLocaleCode() {
		return localeCode;
	}

}
