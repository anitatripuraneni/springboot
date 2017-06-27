package com.springbootrest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springbootrest.bean.Post;

public interface PostRepository extends CrudRepository<Post,Long> {
	
	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();

	Post findById(Long id);

}
