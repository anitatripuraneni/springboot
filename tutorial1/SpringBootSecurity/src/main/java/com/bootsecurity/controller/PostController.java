package com.bootsecurity.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
	// @Secured("ROLE_GUEST")
	@RequestMapping("/list")
	public String list() {
		return "in post contrller class";
	}

	@Secured({ "ROLE_ADMIN", "ROLE_GUEST", "ROLE_USER" })
	@RequestMapping("/add")
	public String addPost() {
		foo();
		return "post added successfully";
	}

	@Secured("ROLE_USER")
	@RequestMapping("/drafts")
	public String viewDrafts() {
		return "view drafts";
	}

	private void foo() {
		// do something

	}
}
