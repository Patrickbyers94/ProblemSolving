package week0;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Question_2 {
	public static <Syncronized> void main(String[] args) {
		BufferedReader br = null;
		Scanner s = null;
		int people = 0;
		int X = 0;
		List<Integer> XMembers = new ArrayList<Integer>();
		HashMap<Integer, ArrayList<Integer>> influence = new HashMap<Integer, ArrayList<Integer>>();
		try {
			br = new BufferedReader(new FileReader("src/week0/input2"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}

		try {
			String line = br.readLine();
			s = new Scanner(line);
			people = s.nextInt();
			X = s.nextInt();
			line = br.readLine();
			s = new Scanner(line);
			for (int i = 0; i < X; i++) {
				XMembers.add(s.nextInt());
			}
			for (int i = 0; i < people; i++) {
				line = br.readLine();
				s = new Scanner(line);
				Integer p1 = s.nextInt();
				ArrayList<Integer> p2 = new ArrayList<Integer>();
				while (s.hasNext()) {
					p2.add(s.nextInt());
				}
				influence.put(p1, p2);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Integer> temp = null;
		ArrayList<Integer> tempRead = null;
		for (int p1 : influence.keySet()) {
			temp = influence.get(p1);
			tempRead = temp;
			for (int p2 : tempRead) {
				for (int p3 : influence.get(p2)) {
					if (!temp.contains(p3)) {
						temp.add(p3);
					}
				}
			}
			influence.put(p1, temp);
		}

		int maxInfluence = 0;
		int max = 0;
		
		for(int p1: influence.keySet()){
			temp = influence.get(p1);
			if(temp.size()>max){
				maxInfluence = p1;
				max=temp.size();
			}
		}
		System.out.println(maxInfluence);
	}
}
