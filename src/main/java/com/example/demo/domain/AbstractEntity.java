package com.example.demo.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;

import org.springframework.data.domain.Persistable;

import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Persistable<ID> {

    @Id
    @GeneratedValue
    private ID id;

    @Override
    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Transient
    @Override
    public boolean isNew() {
        return getId() == null;
    }
}
