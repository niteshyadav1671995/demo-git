package com.yash.moviebookingsystem.dao;

import java.util.List;

import com.yash.moviebookingsystem.model.Screen;

/**
 * This is dao of screen which will do some basic operation on the screens
 * like adding the screen and getting the screens 
 * @author lenovo
 *
 */
public interface ScreenDAO {

	/**
	 * This will add the screen.
	 * @param screen - screen object
	 * @return it will return the size of the list which will test the no. of screen being
	 * added
	 */
	int add(Screen screen);

	/**
	 * This method will provide the list of screens.
	 * @return List of Screens
	 */
	List<Screen> getScreens();

}
