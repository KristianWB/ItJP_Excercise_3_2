import java.util.Scanner;

public class Game_MultiplyThreeNumbers {
    public static void main(String[] args)   {

        // Generating 3 random numbers
        int number1 = (int)(System.currentTimeMillis() % 10 + 1);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10 + 1);
        int number3 = (int)Math.random() * 10 + 1;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " * " + number2 + " * " + number3 + " = ");

        int answer = input.nextInt();

        System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + answer + " is " + (number1 * number2 * number3 == answer));

    }
}
