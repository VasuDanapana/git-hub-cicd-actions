package com.jfsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubCicdActionsApplication {
	
	@GetMapping("/")
	public String message() {
		return "Welcome to GIT Hub CICD Actions";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubCicdActionsApplication.class, args);
	}

}
