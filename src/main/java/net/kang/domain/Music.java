package net.kang.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="music")
public class Music {
	@Id
	String id;
	String title;
	String singer;
	int year;
	String genre;
}
