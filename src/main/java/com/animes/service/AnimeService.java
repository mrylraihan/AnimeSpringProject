package com.animes.service;

import java.util.List;

import com.animes.dto.AnimeDTO;
import com.animes.exception.AnimeException;



public interface AnimeService {
	
	public AnimeDTO getAnimeByName(String name) throws AnimeException;
	
	public List<AnimeDTO> findByGenre (String genre) throws AnimeException;
	
	public List<AnimeDTO> findByMostEpisodes () throws AnimeException;
	
	public List<AnimeDTO> findAll() throws AnimeException;

}
