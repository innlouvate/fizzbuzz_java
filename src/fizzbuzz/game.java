package fizzbuzz;

public class game {
	
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
	
	public String printValues(int first, int last) {
		String result = fizzBuzz(first); 
		for(int aa = first+1; aa <= last; aa++) {
			result = result.concat(", ").concat(fizzBuzz(aa));
		}
		return result; 
	}
	
	public Boolean checkValue(int num, String answer) {
		return fizzBuzz(num).equals(answer);
	}
}
