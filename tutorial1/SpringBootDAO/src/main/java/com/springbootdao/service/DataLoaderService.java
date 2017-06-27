package com.springbootdao.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdao.bean.Author;
import com.springbootdao.bean.Post;
import com.springbootdao.repository.AuthorRepository;
import com.springbootdao.repository.PostRepository;

@Service
public class DataLoaderService {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;

	@Autowired
	public DataLoaderService(PostRepository postRepository, AuthorRepository authorRepository) {

		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}

	@PostConstruct
	public void createPost(){
		Author author1=new Author(new Long(3),"sumanth","talsila");
		authorRepository.save(author1);
		Post post1 = new Post("book3","details of book3",author1);
		postRepository.save(post1);
		
	}
}
