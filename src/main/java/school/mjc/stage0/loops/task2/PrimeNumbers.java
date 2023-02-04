package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;
        while (number <= printToInclusive){
            if (number == 2 || number == 3 || number == 5 ||
                    (number%2 != 0 && number%5 != 0 && number%3 != 0)){
                System.out.println(number);
            } else {
                System.out.print("");
            }
            number++;
        }
    }
}
