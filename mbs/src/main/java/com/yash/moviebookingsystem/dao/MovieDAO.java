package com.yash.moviebookingsystem.dao;

import com.yash.moviebookingsystem.model.Movie;

/**
 * This is dao which will perform basic operation like insert check availablity.
 * @author lenovo
 *
 */
public interface MovieDAO {

	/**
	 * This method will insert the movie to the given screen object
	 * @param screenName - screen name
	 * @param movie - movie to be added to the screen
	 * @return it will return the status of the  movie being inserted or not
	 */
	boolean insert(String screenName, Movie movie);

	/**
	 * This method will check the screen availabilty.
	 * @param screenName name of the screen
	 * @return it will return the status of screen available or not
	 */
	boolean checkScreenAvailable(String screenName);

}
