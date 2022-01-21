package com.JPA.JPA;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository  extends CrudRepository<Person, Long> {
}
