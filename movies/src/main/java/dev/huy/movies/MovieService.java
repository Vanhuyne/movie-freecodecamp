package dev.huy.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired // Đánh dấu (tiêm) một instance của MovieRepository vào thuộc tính này khi khởi tạo MovieService.
    private MovieRepository movieRepository;
    public List<Movie> allMoives(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMoive(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
