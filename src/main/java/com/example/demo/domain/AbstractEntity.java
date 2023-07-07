package com.example.demo.domain;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;

import org.springframework.data.domain.Persistable;

@MappedSuperclass
public abstract class AbstractEntity<ID> implements Persistable<ID> {

	@Transient
	@Override
	public boolean isNew() {
		return getId() == null;
	}
}
