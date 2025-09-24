package com.isabelle.comic_helper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ComicHelperApplication {

	@RequestMapping("/")
	String home() {
		return "Welcome to Comic Helper";
	}

	public static void main(String[] args) {
		SpringApplication.run(ComicHelperApplication.class, args);
	}

}
