package com.CRxCD.app.simpleSpellchecker;

import java.util.Scanner;
/**
<<<<<<< HEAD
 * <h1> Type or quit </h1>
 * <p> The program asks from the user to quit or to type text he would like to processed</p>
=======
 * <h1> Type or quit</h1>
>>>>>>> parent of 014119a... JavaDOC - 1st App.java
 * 
 * @author Haris Barounis
 */

import util.ParseElement;

public class App {
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Spellchecker by CRxCD- in development");
  		String input1 = " " ;
  		
  		/**
  		 * <p> if the user type "quit", the program stops running</p>
  		 * 
  		 * @param input1 
  		 */
  		while (input1.compareToIgnoreCase("quit") != 0) {
          	System.out.println("Type 'Quit' in order to quit or type your text or the path of the file you would like to be processed:");//prompt user
  			sc = new Scanner(System.in);
  			input1 = sc.nextLine();
  			
  			/**
  			 *  <p>if the user do not type anything, the program show the relevant message
  			 *  and asks him to type at least one word</p>
  			 *  
  			 *  @param input1 
  			 */
  			while (input1.isEmpty()) {
  				System.out.println("You must type at least one word.");
  				input1 = sc.nextLine();
  			}
  			/**
  			 *  <p> if the user do not type "quit", then the program parse the text
  			 *  to ParseElement</p>
  			 *  
  			 *  @param input1 
  			 */
  			if (input1.compareToIgnoreCase("quit") != 0) {
  				ParseElement.reader(input1);
  			}
      }
    }
}
