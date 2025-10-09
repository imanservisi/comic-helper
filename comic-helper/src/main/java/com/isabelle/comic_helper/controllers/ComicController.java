package com.isabelle.comic_helper.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.isabelle.comic_helper.entity.Comic;
import com.isabelle.comic_helper.repository.ComicRepository;

@Controller
@RequestMapping("/")
public class ComicController {

	@Autowired
	private ComicRepository comicRepository;

	@GetMapping
	public String getAllComics(Model model) {
		List<Comic> comics = comicRepository.findAll();
		model.addAttribute("comics", comics);
		model.addAttribute("comic", new Comic()); // Ajout de l'objet Comic pour le formulaire
		
		return "index";
	}
	
	@PostMapping
	public String createComic(@ModelAttribute Comic comic) {
		comic.setDateCreation(LocalDateTime.now());
		comicRepository.save(comic);
		
		return "redirect:/";
	}
}
