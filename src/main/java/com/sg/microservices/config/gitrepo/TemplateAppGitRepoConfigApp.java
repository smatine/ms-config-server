package com.sg.microservices.config.gitrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TemplateAppGitRepoConfigApp {

	public static void main(String[] args) {
		SpringApplication.run(TemplateAppGitRepoConfigApp.class, args);
	}
}
