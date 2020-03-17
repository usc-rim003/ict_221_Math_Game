import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int count = 0;

        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < 10; i++){
            Question question = new Question(random);

            while(true) {
                question.showQuestion();

                int response = input.nextInt();
                boolean isCorrect = question.checkQuestion( response );

                if( isCorrect ){
                    count++;
                    System.out.println("Correct the answer was " + question.answer);
                    System.out.printf("%s/%s correctly answered %n", count, 10);
                    break;
                }else{
                    System.out.println("Wrong, please try again!");
                }
            }
        }
        long timeEnd = System.currentTimeMillis();
        long timeTaken = (timeEnd - timeStart) / 1000;

        System.out.println("---Quiz Completed---");
        System.out.printf("Time to completion: %s seconds %n", timeTaken);
        System.out.printf("You got %s questions correct out of %s %n", count, 10);

    }
}