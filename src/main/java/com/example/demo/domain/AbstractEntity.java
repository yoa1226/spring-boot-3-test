package com.example.demo.domain;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import lombok.Data;

import org.springframework.data.domain.Persistable;

@MappedSuperclass
@Data
public abstract class AbstractEntity<ID> implements Persistable<ID> {

	@Override
	public abstract ID getId();

	@Transient
	@Override
	public boolean isNew() {
		return getId() == null;
	}
}
