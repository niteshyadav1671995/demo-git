package com.yash.moviebookingsystem.service;

import com.yash.moviebookingsystem.model.Movie;

/**
 * This is the service interface which will provide the services to the user for adding 
 * movie to the screen.
 * @author lenovo
 *
 */
public interface MovieService {

	/**
	 * This method will add movie to the screen.
	 * @param screenName Name of the Screen.
	 * @param movie Movie Object
	 * @return It will return true if the movie added else false.
	 */
	boolean addMovie(String screenName, Movie movie);



}
