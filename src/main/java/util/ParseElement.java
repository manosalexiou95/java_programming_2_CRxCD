package util;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

/**
 * <h1> Parse Element </h1>
 * 
 * @param input1 the parameter that is passed by App.java
 * @param wordArray 
 * @param wordList
 * 
 * @author Haris Barounis
 * @version JDK 1.1
 * @since 1.1
 */

public class ParseElement {
	public static LinkedList<String> reader(String input1) {
		String[] wordArray;
		LinkedList<String> wordList = new LinkedList<String>();
		
		
		/**
		 * <h2>Parse and initialize input1</h2>
		 * <p><b>input1 = FilePath : </b> if the user input a FilePath, the program  </p>
		 * <p><b>input1 = text : </b> if the user type text, the program  </p>
		 * 
		 * @param input1 the parameter that is passed by App.java
		 * @exception IOException 
		 * @see IOException
		 */
		if (isFilePath(input1)){
			Path file = Paths.get(input1);
			wordArray = new String[10];
			try {
				BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8);
				String sCurrentLine = null;
				while ((sCurrentLine =reader.readLine()) != null) {
					wordArray = sCurrentLine.split(" ");
					for (int i = 0; i < wordArray.length; i++) {
						wordList.add(wordArray[i]);
					}
				}
				for (int z = 0; z < wordList.size(); z++) {
					System.out.println(wordList.get(z));
					}
				System.out.println(wordList.size());
			} catch (IOException e) {
				System.err.format("IOException: %s%n", e);
			}
			System.out.println("Your file was initialized.");
			return wordList;
		} else {
			wordArray = new String[10];
			wordArray = input1.split(" ");
			for (int i = 0; i < wordArray.length; i++) {
				wordList.add(wordArray[i]);
			}
			for (int z = 0; z < wordList.size(); z++) {
				System.out.println(wordList.get(z));
			}
			System.out.println("Your input was initialized.");
			return wordList;
		}
	}
	
	/**
	 * <h2> Check the FilePath</h2>
	 * <p> If the user input Filepath, then the program check if the path exists or not</p>
	 * 
	 * @param str the Filepath tha user input
	 * @param f store the <i>String str</i> as a file
	 * @param checker checks if the File "f" exists
	 * @return  true if the file "f" exists or false if it doesn't 
	 */
	public static boolean isFilePath(String str) {
		File f = null;
		boolean checker = false;
		try{
			f = new File(str);
			checker = f.exists();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return checker;
	}
}
