import java.util.Random;

public class Question {
    int value1;
    int value2;

    int operatorType;
    String operatorString;
    int answer;

    public Question(Random random) {
        this.value1 = random.nextInt(50);
        this.value2 = random.nextInt(50);
        this.operatorType = random.nextInt(3);

        switch(this.operatorType){
            case 0:
                operatorString = "+";
                this.answer = this.value1 + this.value2;
                break;
            case 1:
                operatorString = "-";
                this.answer = this.value1 - this.value2;
                break;
            case 2:
                operatorString = "*";
                this.answer = this.value1 * this.value2;
                break;
        }

    }

    public void showQuestion() {
        System.out.printf("%s %s %s = %n", this.value1, this.operatorString, this.value2);
    }

    public boolean checkQuestion(int response){
        if( this.answer == response ) {
            return true;
        }else{
            return false;
        }
    }

}
