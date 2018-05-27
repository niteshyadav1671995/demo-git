package com.yash.moviebookingsystem.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.yash.moviebookingsystem.exception.EmptyFileException;
import com.yash.moviebookingsystem.exception.FileNotExistException;
import com.yash.moviebookingsystem.exception.NullFileException;

public class OperatorMenu {

	private static final Logger LOGGER = Logger.getLogger(OperatorMenu.class);

	public static void getOperatorMenu(String filePath) {
		checkForFilePathNull(filePath);
		if (filePath != null) {
			try {
				FileReader fileReader = new FileReader(filePath);
				readFile(filePath, fileReader);
			} catch (FileNotFoundException e) {
				LOGGER.info("File Name: " + filePath + " not Found");
				throw new FileNotExistException("File does not exist");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void readFile(String filePath, FileReader fileReader) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		checkForEmptyFile(line);
		while (line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
		}

	private static void checkForEmptyFile(String line) {
		if (line == null)
			throw new EmptyFileException("File is Empty");
	}

	private static void checkForFilePathNull(String filePath) {
		if (filePath == null) {
			throw new NullFileException("File is null, no such file found");
		}
	}

}
