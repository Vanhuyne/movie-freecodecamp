package dev.huy.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "movies")
@Data // add all getter, setter, equals(), hashCode() and toString().
@AllArgsConstructor // tao constructor co all tham so
	
@NoArgsConstructor // constructor khong tham so
public class Movie {
	@Id
	private ObjectId id;
	
	private String imdbId;
	private String title;
	private String releaseDate;
	private String trailerLink;
	private List<String> genres;
	private String poster;
	private List<String> backdrops;

	@DocumentReference
	private List<Review> riviewIds;
	
	
}
