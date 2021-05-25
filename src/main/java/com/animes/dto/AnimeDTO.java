package com.animes.dto;

import com.animes.entity.AnimeEntity;
import com.sun.istack.NotNull;

public class AnimeDTO {
	private Integer animeId;
	@NotNull
	private String name;
	@NotNull
	private String genre;
	@NotNull
	private Integer episodeCount;
	@NotNull
	private String studio;
	private String review;
	
	public Integer getAnimeId() {
		return animeId;
	}
	public void setAnimeId(Integer animeId) {
		this.animeId = animeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Integer getEpisodeCount() {
		return episodeCount;
	}
	public void setEpisodeCount(Integer episodeCount) {
		this.episodeCount = episodeCount;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	public static AnimeEntity dtoToEntity(AnimeDTO dto) {
		AnimeEntity entity = new AnimeEntity();
		entity.setAnimeId(dto.getAnimeId());
		entity.setName(dto.getName());
		entity.setGenre(dto.getGenre());
		entity.setEpisodeCount(dto.getEpisodeCount());
		entity.setStudio(dto.getStudio());
		entity.setReview(dto.getReview());
		return entity;
		
	}
	
	public static AnimeDTO entityToDTO(AnimeEntity entity) {
		AnimeDTO dto = new AnimeDTO();
		dto.setAnimeId(entity.getAnimeId());
		dto.setName(entity.getName());
		dto.setGenre(entity.getGenre());
		dto.setEpisodeCount(entity.getAnimeId());
		dto.setStudio(entity.getStudio());
		dto.setReview(entity.getReview());
		return dto;
		
	}
	

}
