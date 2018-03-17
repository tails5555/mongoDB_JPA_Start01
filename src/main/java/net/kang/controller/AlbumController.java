package net.kang.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.kang.domain.Album;
import net.kang.service.AlbumService;

@RestController
@CrossOrigin
@RequestMapping("album")
public class AlbumController {
	@Autowired AlbumService albumService;
	@RequestMapping("findAll")
	public List<Album> findAll(){
		return albumService.findAll();
	}
	@RequestMapping("findOne/{id}")
	public Optional<Album> findOne(@PathVariable("id") String id) {
		return albumService.findOne(id);
	}
	@RequestMapping("findByReleaseDateAfter/{releaseDate}")
	public List<Album> findBySinger(@PathVariable("releaseDate") @DateTimeFormat(pattern = "yyyyMMdd") Date releaseDate){
		return albumService.findByReleaseDateAfter(releaseDate);
	}
	@RequestMapping(value="insert", method=RequestMethod.POST)
	public void insert(@RequestBody Album album) {
		albumService.insert(album);
	}
	@RequestMapping(value="update", method=RequestMethod.PUT)
	public void update(@RequestBody Album album) {
		albumService.update(album);
	}
	@RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") String id) {
		albumService.delete(id);
	}
}
