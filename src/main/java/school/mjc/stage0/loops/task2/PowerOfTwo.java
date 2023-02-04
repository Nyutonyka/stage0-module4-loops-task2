package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 1;
        int result = 1;
        if (power >= 0){
            System.out.println(result);
            while (count <= power){
                result = result * 2;
                count++;
                System.out.println(result);
            }
        }else {
            System.out.println("too much power");
        }
    }
}
