package com.yash.moviebookingsystem.service;

import com.yash.moviebookingsystem.model.Screen;

/**
 * This is the service interface providing service to the screen like adding screen.
 * @author lenovo
 *
 */
public interface ScreenService {

	/**
	 * This will add the screen.
	 * @param screen Screen Object.
	 * @return It will return the no. of screens added till now.
	 */
	int addScreen(Screen screen);

}
