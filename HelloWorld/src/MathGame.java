import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MathGame {


    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;

        for(int i = 0; i < 10; i++){
            // Generate two random numbers for the question
            int firstNumber = random.nextInt(99);
            int secondNumber = random.nextInt(99);

            boolean isCorrect = askQuestion(firstNumber, secondNumber);

            if( isCorrect ){
                count++;
                System.out.println("Yey you did it! Well done Einstein");
            }else{
                System.out.println("Wrong, idiot.");
            }

            System.out.printf("%s/%s correctly answered %n", count, 10);
        }
        System.out.println("Quiz finished!");
        System.out.println("You got " + count + " questions correct, well done!");


    }



    private static boolean askQuestion( int firstNumber, int secondNumber ) {
        Scanner input = new Scanner(System.in);

        int correct = 0;
        if( firstNumber > secondNumber ){
            // Make it subtraction
            // Calculate the answer to the question
            correct = firstNumber - secondNumber;
            // Display the question to the user
            System.out.printf("%s - %s = %n", firstNumber, secondNumber);
        }else {
            // Make it addition
            // Calculate the answer to the question
            correct = firstNumber + secondNumber;
            // Display the question to the user
            System.out.printf("%s + %s = %n", firstNumber, secondNumber);
        }

        int response = input.nextInt();

        if( response == correct ){
            return true;
        }else{
            return false;
        }
    }
}