package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int number = 0;
        int numberN = 0;
        if (multiplyByAndToInclusive > 0){
            while (number <= multiplyByAndToInclusive) {
                System.out.println(number * multiplyByAndToInclusive);
                number++;
            }

        }else if (multiplyByAndToInclusive < 0){
            while (number >= multiplyByAndToInclusive){
                System.out.println(numberN * multiplyByAndToInclusive);
                numberN++;
                number--;
            }
        }else {
            System.out.print("");
        }
    }
}
