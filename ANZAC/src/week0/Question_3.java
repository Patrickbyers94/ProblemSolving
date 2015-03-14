package week0;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_3 {
	public static <Syncronized> void main(String[] args) {
		BufferedReader br = null;
		Scanner s = null;
		String plate = null;
		int carsFound = 0;
		List<String> PossibleMatches = new ArrayList<String>();
		List<String> Matches = new ArrayList<String>();
		String line = null;
		try {
			br = new BufferedReader(new FileReader("src/week0/input3"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}

		try {
			plate = br.readLine();
			line = br.readLine();
			s = new Scanner(line);
			carsFound = s.nextInt();
			for (int i = 0; i < carsFound; i++) {
				PossibleMatches.add(br.readLine());
			}
		} catch (IOException e) {
			System.out.println("Failed to process the file");
			e.printStackTrace();
		}
		boolean fail = false;
		for (String p : PossibleMatches) {
			fail = false;
			for (int i = 0; i < 9; i++) {
				char c1 = plate.charAt(i);
				char c2 = p.charAt(i);
				if (c1 != c2 && c1 != '*') {
					fail = true;
				}
			}
				if (!fail) {
					Matches.add(p);
				}
		}

		System.out.println(Matches.size());
		for (String p : Matches) {
			System.out.println(p);
		}
	}
}
