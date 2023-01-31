package com.ar.moviezone.service;

import java.util.List;

import com.ar.moviezone.dto.MovieDTO;
import com.ar.moviezone.entity.Movie;
import com.ar.moviezone.exception.MovieZoneException;

public interface UserMovieService {
	
	List<MovieDTO> getAllMovies();
	
	MovieDTO getMovieById(Integer movieId) throws MovieZoneException;
}
