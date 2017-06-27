package com.springbootrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrest.bean.Post;
import com.springbootrest.repository.PostRepository;
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

	public Post getPostById(Long id) {
		return (Post) postRepository.findById(id);
	}

	public Post createPost(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	public Post updatePost(Long id, Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletePost(Long id) {
		// TODO Auto-generated method stub
		
	}
}
