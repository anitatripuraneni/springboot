package com.springbootdao.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootdao.bean.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
