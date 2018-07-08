import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in)
		;
		System.out.println("Let's play FizzBuzz!");
		System.out.println("Choose a number to play!");
		int number = input.nextInt();

		Fizzbuzz play = new Fizzbuzz();
		
        System.out.println(play.response(number));
        input.close();
	}

}
