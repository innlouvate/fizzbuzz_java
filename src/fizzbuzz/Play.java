package fizzbuzz;

/**
 * Created by louisefranklin on 17/05/2016.
 */
public class Play {

    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("Welcome to FizzBuzz!");
        System.out.println("Type 'Fizz' for a number divisible by 3 and 'Buzz' for numbers divisible by 5, then 'FizzBuzz' if it's divisible by both 3 and 5, otherwise just type the number");
        System.out.println("Ready to play?");

        int x = 0;
        String answer = "FizzBuzz";

        while(game.checkValue(x, answer)) {
            x++;
            answer = game.getUserInput("Next number: " + x);
        }
        System.out.println("Wrong answer! I think you wanted " + game.fizzBuzz(x) +"!");
    }

}
