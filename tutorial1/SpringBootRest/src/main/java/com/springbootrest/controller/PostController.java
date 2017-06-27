package com.springbootrest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.bean.Post;
import com.springbootrest.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	private static final Logger logger = LoggerFactory.getLogger(PostController.class);

	private PostService postService;

	@Autowired
	public PostController(PostService postService) {

		this.postService = postService;
	}

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Post> getListOfPosts(){
		return postService.getListOfPosts();
	}
	@RequestMapping(value="/list/{id}",method=RequestMethod.GET)
	public Post getPostById(@PathVariable("id") Long id){
		return postService.getPostById(id);
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public Post createPost(@RequestBody Post post){
		return postService.createPost(post);
	}
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public Post updatePost(@PathVariable("id") Long id,@RequestBody Post post){
		return postService.updatePost(id,post);
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void deletePost(@PathVariable("id") Long id){
		postService.deletePost(id);
	}
}
