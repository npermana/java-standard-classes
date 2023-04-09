package nazar.standard.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        System.out.println("Demo StringTokenizer");
        System.out.println("nazar sidik permana");
        System.out.println("result:");

        String name = "nazar sidik permana";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
