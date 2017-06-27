package com.springbootrest.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootrest.bean.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
