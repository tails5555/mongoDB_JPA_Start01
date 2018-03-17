package net.kang.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="album")
public class Album {
	@Id
	String id;
	String title;
	Date releaseDate;
}
