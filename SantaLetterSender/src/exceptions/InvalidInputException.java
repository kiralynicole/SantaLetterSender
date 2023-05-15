package exceptions;

import javax.swing.JOptionPane;

public class InvalidInputException extends Exception {

	public InvalidInputException(String message) {
		super(message);    	
	}
}
