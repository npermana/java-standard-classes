package nazar.standard.classes;

public class RuntimeApp {
    public static void main(String[] args) {
        System.out.println("Demo Runtime class");

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
        runtime.gc();
    }
}
