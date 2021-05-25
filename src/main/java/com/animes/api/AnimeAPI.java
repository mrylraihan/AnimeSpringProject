package com.animes.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animes.dto.AnimeDTO;
import com.animes.exception.AnimeException;
import com.animes.service.AnimeService;

@Validated
@RestController
@RequestMapping(value = "animeAPI")
@CrossOrigin
public class AnimeAPI {
	
	@Autowired
	private AnimeService animeService;
	
	@GetMapping(value = "name/{name}")
	public ResponseEntity<AnimeDTO> getAnimeByName(@PathVariable String name) throws AnimeException {
		AnimeDTO animeDTO = animeService.getAnimeByName(name);
		return new ResponseEntity<AnimeDTO>(animeDTO,HttpStatus.OK);
	}
	@GetMapping(value = "genre/{genre}")
	public ResponseEntity<List<AnimeDTO>> findByGenre (@PathVariable String genre) throws AnimeException {
		List<AnimeDTO> dtoList = animeService.findByGenre(genre);
		return new ResponseEntity<List<AnimeDTO>>(dtoList,HttpStatus.OK);
	}
	@GetMapping(value = "mostEp")
	public ResponseEntity<List<AnimeDTO>> findByMostEpisodes () throws AnimeException {
		List<AnimeDTO> dtoList = animeService.findByMostEpisodes();
		return new ResponseEntity<List<AnimeDTO>>(dtoList,HttpStatus.OK);
	}
	@GetMapping(value = "getAllAnime")
	public ResponseEntity<List<AnimeDTO>>findAll() throws AnimeException {
		List<AnimeDTO> dtoList = animeService.findAll();
		return new ResponseEntity<List<AnimeDTO>>(dtoList,HttpStatus.OK);
	}

}
