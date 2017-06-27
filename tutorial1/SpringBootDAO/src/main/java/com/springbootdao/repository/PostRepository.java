package com.springbootdao.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springbootdao.bean.Post;

public interface PostRepository extends CrudRepository<Post,Long> {
	
	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();

}
