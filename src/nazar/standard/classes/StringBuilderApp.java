package nazar.standard.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        // not thread-safe
        StringBuilder builder = new StringBuilder();
        builder.append("nazar");
        builder.append(" ");
        builder.append("sidik");
        builder.append(" ");
        builder.append("permana");
        String name = builder.toString();
        System.out.println(name);

        // for thread-safe better use StringBuffer
    }
}
