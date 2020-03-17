import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TODO: Week 3 & Week 4
public class MathGame {
    ArrayList<Question> questionList = new ArrayList<Question>();
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    int count = 0;

    public MathGame(){
        this.generateQuestions();
        this.startQuiz();
    }
    private void startQuiz() {
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < questionList.size(); i++){
            Question question = questionList.get(i);

            question.showQuestion();

            int response = input.nextInt();
            boolean isCorrect = question.checkQuestion( response );

            if( isCorrect ){
                System.out.println("Correct the answer was " + question.answer);
                System.out.printf("%s/%s correctly answered the first attempt %n", count, 10);
            }else{
                questionList.add(question);
                System.out.println("Wrong");
            }

        }
        long timeEnd = System.currentTimeMillis();
        long timeTaken = (timeEnd - timeStart) / 1000;

        System.out.println("---Quiz Completed---");
        System.out.printf("Time to completion: %s seconds %n", timeTaken);
        System.out.printf("You got %s questions correct out of %s %n", count, 10);

    }

    private void generateQuestions() {
        for(int i = 0; i < 10; i++){
            this.questionList.add(new Question(random));
        }
    }


    public static void main(String[] args) {
        new MathGame();
    }
}