package nazar.standard.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        System.out.println("Demo String Joiner");
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("nazar");
        joiner.add("sidik");
        joiner.add("permana");

        String name = joiner.toString();
        System.out.println(name);
    }
}
