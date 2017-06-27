package com.springbootdao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdao.bean.Post;
import com.springbootdao.service.PostService;

@RestController
public class HomeContoller {
	@Autowired
	private PostService postService;

	
	@RequestMapping("/")
	public Post home() {
		return postService.getLatestPost();

	}
}
