package com.springbootdao.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdao.bean.Post;
import com.springbootdao.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	private static final Logger logger = LoggerFactory.getLogger(PostController.class);

	private PostService postService;

	@Autowired
	public PostController(PostService postService) {

		this.postService = postService;
	}

	@RequestMapping("/list")
	public List<Post> getListOfPosts(){
		return postService.getListOfPosts();
	}
}
