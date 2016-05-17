package fizzbuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	public Boolean checkValue(int num, String answer) {
		return fizzBuzz(num).equals(answer);
	}
	public String fizzBuzz(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		}
		else if (num % 3 == 0) {
			return "Fizz";
		}
		else if (num % 5 == 0) {
			return "Buzz";
		}
		else {
			return String.valueOf(num);
		}
	}

	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) return null;
		} catch (IOException e) {
			System.out.print("IOException: " + e);
		}
		return inputLine;
	}

	public String printValues(int first, int last) {
		String result = fizzBuzz(first);
		for(int aa = first+1; aa <= last; aa++) {
			result = result.concat(", ").concat(fizzBuzz(aa));
		}
		return result;
	}
}
