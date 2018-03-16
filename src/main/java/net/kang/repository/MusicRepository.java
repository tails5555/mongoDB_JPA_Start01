package net.kang.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.kang.domain.Music;

public interface MusicRepository extends MongoRepository<Music, String>{
	List<Music> findByYearBetween(int year1, int year2);
	List<Music> findBySinger(String singer);
}
