package com.bootcamp.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.languages.models.Language;

@Repository
public interface LanguageRepo extends CrudRepository<Language, Long> {

	public List<Language> findAll();

}
