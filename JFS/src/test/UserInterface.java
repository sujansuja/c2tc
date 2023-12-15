package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserInterface {

	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface();
		String fileName = "C:\\Users\\sujan\\Desktop\\dognames.txt";
		String result = userInterface.findPetName(fileName);
		System.out.println(result);
	}

	public String findPetName(String fileName) {
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] names = line.split("\\s+");
				for (String name : names) {
					if (countVowels(name) == 2) {
						return name;
					}
				}
			}
		} catch (FileNotFoundException e) {
			return "Please give the correct file name";
		} catch (IOException e) {
			return "Error occurred while reading the names from file";
		}

		return "No pet name found with exactly two vowels";
	}

	private int countVowels(String str) {
		int count = 0;
		for (char c : str.toLowerCase().toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		return count;
	}
}