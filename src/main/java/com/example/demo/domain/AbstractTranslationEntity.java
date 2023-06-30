package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@MappedSuperclass
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public abstract class AbstractTranslationEntity<T extends AbstractEntity<Long> & WithTranslationKey> extends AbstractEntity {

	@Id
	@GeneratedValue
	private Long id;

	@JoinColumn(name = "CLASSIFIER_ID", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private T classifier;

	@Column(name = "LOCALE_CODE", length = 15, nullable = false)
	private String localeCode;

	AbstractTranslationEntity(Long id, T classifier, String localeCode) {
		this.id = id;
		this.classifier = classifier;
		this.localeCode = localeCode;
	}
}
