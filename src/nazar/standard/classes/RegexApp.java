package nazar.standard.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        System.out.println("Demo Regular Expression");
        System.out.println("Pattern Class dan Matcher Class");
        System.out.println("Pattern -> representasi hasil kompilasi dari pola regular expression yang dibuat");
        System.out.println("Matcher => engine untuk melakukan pencarian setelah pattern ditentukan");

        System.out.println("mencari data yang dimulai dari a-Z dan ditengahnya huruf a dengan diakhiri a-Z");
        String data = "nazar sidik permana software engineer jakarta timur indonesia";
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*"); //->
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
