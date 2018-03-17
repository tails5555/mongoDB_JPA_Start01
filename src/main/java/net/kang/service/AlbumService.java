package net.kang.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kang.domain.Album;
import net.kang.repository.AlbumRepository;

@Service
public class AlbumService {
	@Autowired AlbumRepository albumRepository;
	public List<Album> findAll(){
		return albumRepository.findAll();
	}
	public Optional<Album> findOne(String id) {
		return albumRepository.findById(id);
	}
	public void insert(Album album) {
		albumRepository.insert(album);
	}
	public void update(Album album) {
		albumRepository.save(album);
	}
	public void delete(String id) {
		albumRepository.deleteById(id);
	}
	public List<Album> findByReleaseDateAfter(Date date) {
		return albumRepository.findByReleaseDateAfter(date);
	}
}
