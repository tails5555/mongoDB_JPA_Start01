package net.kang.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.kang.domain.Album;
public interface AlbumRepository extends MongoRepository<Album, String>{
	List<Album> findByReleaseDateAfter(Date releaseDate);
}
