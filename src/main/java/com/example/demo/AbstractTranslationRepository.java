package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.example.demo.domain.AbstractEntity;
import com.example.demo.domain.AbstractTranslationEntity;
import com.example.demo.domain.WithTranslationKey;

@NoRepositoryBean
public interface AbstractTranslationRepository<C extends AbstractEntity<Long> & WithTranslationKey, T extends AbstractTranslationEntity<C>> extends CrudRepository<T, Long> {

	List<T> findTranslationsByClassifierId(Long classifierId);

}
