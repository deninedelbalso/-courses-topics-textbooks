
public class Fizzbuzz {

	public String response(int number) {
		
		if(number % 3 == 0 && number % 5 ==0) {
			return "fizzbuzz";
		}
		if(number <=0) {
			return "error";
		}
		
		if(number % 3 == 0 && number % 5 ==0) {
			return "fizzbuzz";
		}
		
		if(number % 3 == 0) {
			return "fizz";
		}
		if(number % 5 == 0) {
				return "buzz";
		}
		
		
											
		return "" + number;
	}
}
