package com.example.demo.domain;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.springframework.data.domain.Persistable;

@MappedSuperclass
public abstract class AbstractEntity<ID> implements Persistable<ID> {

	@Transient
	@Override
	public boolean isNew() {
		return getId() == null;
	}
}
