package com.animes.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.animes.dto.AnimeDTO;
import com.animes.entity.AnimeEntity;
import com.animes.exception.AnimeException;
import com.animes.repository.AnimeRepository;

@Service(value = "animeService")
@Transactional
public class AnimeServiceImpl implements AnimeService{
	
	@Autowired
	private AnimeRepository animeRepository;

	@Override
	public AnimeDTO getAnimeByName(String name) throws AnimeException {
		AnimeEntity animeE = animeRepository.getAnimeByName(name);
		if(animeE == null) {
			throw new AnimeException("Service.Anime_Not_Found");
		}
		return AnimeDTO.entityToDTO(animeE);
	}

	@Override
	public List<AnimeDTO> findByGenre(String genre) throws AnimeException {
		List<AnimeEntity> animeList = animeRepository.findByGenre(genre);
		if(animeList.isEmpty()) {
			throw new AnimeException("Service.Anime_Not_Found");
		}
		List<AnimeDTO> aDtoList = new ArrayList<AnimeDTO>();
		for(AnimeEntity aEntity:animeList) {
			aDtoList.add(AnimeDTO.entityToDTO(aEntity));
		}
		return aDtoList;
	}

	@Override
	public List<AnimeDTO> findByMostEpisodes() throws AnimeException {
		List<AnimeEntity> animeList = animeRepository.findByMostEpisodes();
		if(animeList.isEmpty()) {
			throw new AnimeException("Service.Anime_Not_Found");
		}
		List<AnimeDTO> aDtoList = new ArrayList<AnimeDTO>();
		for(AnimeEntity aEntity:animeList) {
			aDtoList.add(AnimeDTO.entityToDTO(aEntity));
		}
		return aDtoList;
	}

	@Override
	public List<AnimeDTO> findAll() throws AnimeException {
		List<AnimeEntity> animeList = animeRepository.findAll();
		if(animeList.isEmpty()) {
			throw new AnimeException("Service.Anime_Not_Found");
		}
		List<AnimeDTO> aDtoList = new ArrayList<AnimeDTO>();
		for(AnimeEntity aEntity:animeList) {
			aDtoList.add(AnimeDTO.entityToDTO(aEntity));
		}
		return aDtoList;
	}

}
