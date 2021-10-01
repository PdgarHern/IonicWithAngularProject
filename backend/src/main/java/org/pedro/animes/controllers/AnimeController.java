package org.pedro.animes.controllers;

import java.util.List;
import java.util.Optional;

import org.pedro.animes.entity.models.Anime;
import org.pedro.animes.entity.services.IAnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
public class AnimeController {
	
	@Autowired
	IAnimeService animeService;
	
	@GetMapping("/animes")
	List<Anime> getAll() {
		return animeService.getAll();
	}
	
	@GetMapping("/animes/{id_anime}")
	Anime getOne(@PathVariable("id_anime") long id) {
		Optional<Anime> a = animeService.getOne(id);
		
		if (a.isPresent()) {
			return a.get();
		}
		
		return null;
	}
	
	@PostMapping("/animes")
	void add(Anime anime) {
		animeService.add(anime);
	}
	
	@DeleteMapping("/animes/{id_anime}")
	void delete(@PathVariable("id_anime") long id) {
		animeService.delete(id);
	}

}
