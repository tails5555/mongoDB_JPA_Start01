package net.kang.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.kang.domain.Music;

public interface MusicRepository extends MongoRepository<Music, String>{

}
