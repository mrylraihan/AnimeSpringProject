package com.animes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "anime")
public class AnimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer animeId;
	@Column(name = "name")
	private String name;
	@Column(name = "genre")
	private String genre;
	@Column(name = "episode_count")
	private Integer episodeCount;
	@Column(name = "studio")
	private String studio;
	@Column(name = "review")
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
	
	
}
