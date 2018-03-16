package net.kang.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kang.domain.Music;
import net.kang.repository.MusicRepository;

@Service
public class MusicService {
	@Autowired MusicRepository musicRepository;
	public List<Music> findAll(){
		return musicRepository.findAll();
	}
	public Optional<Music> findById(String id){
		return musicRepository.findById(id);
	}
	public List<Music> findByYearBetween(int year1, int year2){
		return musicRepository.findByYearBetween(year1, year2);
	}
	public List<Music> findBySinger(String singer){
		return musicRepository.findBySinger(singer);
	}
	public void insert(Music music) {
		musicRepository.insert(music);
	}
	public void update(Music music) {
		musicRepository.save(music);
	}
	public void delete(String id) {
		musicRepository.deleteById(id);
	}
}
