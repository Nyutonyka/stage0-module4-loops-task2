package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 1;
        int factorial = 1;

        if(printToInclusive > 0){
            System.out.println(factorial);
            while (number <= printToInclusive){
                factorial = factorial * number;
                System.out.println(factorial);
                number++;
            }
        }else {
            System.out.println(factorial);
        }
    }
}
