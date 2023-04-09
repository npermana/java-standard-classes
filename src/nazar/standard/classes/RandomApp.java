package nazar.standard.classes;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        System.out.println("Demo Random Class");
        System.out.println("mengenerate random number");

        Random random = new Random();
        for(int n = 0; n < 10; n++){
            int val = random.nextInt(20);
            System.out.println(val);
        }
    }
}
