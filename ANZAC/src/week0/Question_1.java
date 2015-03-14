package week0;

import java.io.*;
import java.util.*;

public class Question_1 {
	public static void main(String[] args) {
		// Initialize two lists to store the animal calls we know and the calls
		// we heard
		List<String> recording = new ArrayList<String>();
		List<String> calls = new ArrayList<String>();

		// Initialize a buffered reader to process the input and a field to
		// store the raw input
		BufferedReader br =null;
		try {
			br = new BufferedReader(new FileReader("src/week0/input1"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}
		String raw = null;

		try {
			raw = br.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read input file");
			System.exit(1);
		}

		String call = null;
		Scanner s = new Scanner(raw);
		while (s.hasNext()) {
			call = s.next();
				recording.add(call);
		}

		try {
			String dis = br.readLine();
			while (dis != "what does the fox say?" && dis!=null) {
				s = new Scanner(dis);
				s.next();
				s.next();
				calls.add(s.next());
				dis = br.readLine();
			}
		} catch (IOException ioe) {
			System.out.println("IO error trying to read input file");
			System.exit(1);
		}
		s.close();
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		Boolean found = false;
		for (String word : recording) {
			found = false;
			for (String c : calls) {
				if (word.equals(c)) {
					found = true;
					break;
				}
			}
			if (!found) {
				sb.append(word + " ");
			}
		}

		System.out.println(sb);
	}

}
