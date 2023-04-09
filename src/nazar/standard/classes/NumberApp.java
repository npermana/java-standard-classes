package nazar.standard.classes;

public class NumberApp {
    public static void main(String[] args) {
        System.out.println("Demo konversi tipe number ke tipe number lainnya");

        Integer intVal = 100;
        Long longVal = intVal.longValue();
        Double doubleVal = intVal.doubleValue();
        Short shortVal = intVal.shortValue();

        System.out.println(intVal);
        System.out.println(longVal);
        System.out.println(doubleVal);
        System.out.println(shortVal);

        System.out.println("Demo konversi tipe String ke Number");
        String contoh = "10000";
        Integer contohInt = Integer.parseInt(contoh);
        System.out.println(contohInt);

        String doubleContoh = "10.02";
        Double contohDouble = Double.parseDouble(doubleContoh);
        System.out.println(contohDouble);
    }
}
