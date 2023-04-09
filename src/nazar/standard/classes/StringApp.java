package nazar.standard.classes;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringApp {
    public static void main(String[] args) {
        String name = "Nazar Sidik Permana";

        String lowerCase = name.toLowerCase();
        String upperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(name.length());  // length of string
        System.out.println(name.startsWith("Nazar"));
        System.out.println(name.endsWith("Permana"));
        String[] names = name.split(" ");
        for(String n : names){
            System.out.println(n);
        }
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isBlank());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(1));

        char[] chars = name.toCharArray();
        for(char a : chars){
            System.out.println(a);
        }
    }
}
