package com.springbootdao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdao.bean.Post;
import com.springbootdao.repository.PostRepository;
@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;

	public Post getLatestPost() {
		return postRepository.findFirstByOrderByPostedOnDesc();
	}
	
	public List<Post> getListOfPosts(){
	return 	(List<Post>) postRepository.findAllByOrderByPostedOnDesc();
	}
}
