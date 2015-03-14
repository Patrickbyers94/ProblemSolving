package week0;

import java.util.*;
import java.io.*;

public class Question_6 {
	public static <Syncronized> void main(String[] args) {
		String line = null;
		List<Integer> numbers = new ArrayList<Integer>();
		int zeros = 0;
		BufferedReader br = null;
		Scanner s = null;
		try {
			br = new BufferedReader(new FileReader("src/week0/input6"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}

		try {
			line = br.readLine();
			while (!line.equals("0")) {
				s = new Scanner(line);
				numbers.clear();
				zeros = 0;
				while (s.hasNext()) {
					int num = s.nextInt();
					if (num == 0) {
						zeros++;
					} else {
						numbers.add(num);
					}
				}
				Collections.sort(numbers);
				StringBuilder n1 =new StringBuilder();
				StringBuilder n2 =new StringBuilder();
				n1.append(Integer.toString(numbers.remove(0)));
				n2.append(Integer.toString(numbers.remove(0)));
				if(zeros%2 == 1){
					while (zeros>1){
						n1.append(Integer.toString(0));
						n2.append(Integer.toString(0));
						zeros = zeros-2;
					}
					n1.append(Integer.toString(0));
					n2.append(Integer.toString(numbers.remove(0)));
				}
				else{
					while (zeros>0){
						n1.append(Integer.toString(0));
						n2.append(Integer.toString(0));
						zeros = zeros-2;
					}
				}
				while (numbers.size() >= 2) {
					n1.append(Integer.toString(numbers.remove(0)));
					n2.append(Integer.toString(numbers.remove(0)));
				}
				if(numbers.size() != 0){
					n1.append(Integer.toString(numbers.remove(0)));
				}
				int num1 = Integer.parseInt(n1.toString());
				int num2 = Integer.parseInt(n2.toString());
//				System.out.println(num1);
//				System.out.println(num2);
				System.out.println(num1+num2);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Failed to process the file");
			e.printStackTrace();
		}
	}
}
