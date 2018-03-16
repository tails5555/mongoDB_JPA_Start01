package net.kang.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.kang.domain.Music;
import net.kang.service.MusicService;

@RestController
@RequestMapping("music")
public class MusicController {
	@Autowired MusicService musicService;
	@RequestMapping("findAll")
	public List<Music> findAll(){
		return musicService.findAll();
	}
	@RequestMapping("findOne")
	public Optional<Music> findOne(@RequestParam("id") String id) {
		return musicService.findById(id);
	}
	@RequestMapping("findBySinger")
	public List<Music> findBySinger(@RequestParam("singer") String singer){
		return musicService.findBySinger(singer);
	}
	@RequestMapping("findByYearBetween")
	public List<Music> findByYearBetween(@RequestParam("before") int before, @RequestParam("after") int after){
		return musicService.findByYearBetween(before, after);
	}
	@RequestMapping(value="insert", method=RequestMethod.POST)
	public void insert(@RequestBody Music music) {
		musicService.insert(music);
	}
	@RequestMapping(value="update", method=RequestMethod.PUT)
	public void update(@RequestBody Music music) {
		musicService.update(music);
	}
	@RequestMapping(value="delete", method=RequestMethod.DELETE)
	public void delete(@RequestParam("id") String id) {
		musicService.delete(id);
	}
}