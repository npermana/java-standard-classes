package nazar.standard.classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        System.out.println("Demo Base64 Class");
        System.out.println("Encoding untuk mengubah binary ke text");

        String data = "nazar sidik permana";

        // encode
        String encoder = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encoder);

        byte[] decoder = Base64.getDecoder().decode(encoder);
        String result = new String(decoder);
        System.out.println(result);
    }
}
