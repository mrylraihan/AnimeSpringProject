package com.animes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.animes.entity.AnimeEntity;

public interface AnimeRepository extends JpaRepository<AnimeEntity, Integer>{
	
	@Query("select a from AnimeEntity a where a.name = :name")
	public AnimeEntity getAnimeByName(@Param("name")String name);
	
	public List<AnimeEntity> findByGenre (String genre);
	
	@Query("select a from AnimeEntity a where a.episodeCount = (select max(a.episodeCount) from AnimeEntity a)")
	public List<AnimeEntity> findByMostEpisodes ();

}
