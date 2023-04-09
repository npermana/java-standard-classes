package nazar.standard.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        System.out.println("Demo Arrays Class");
        System.out.println("Berisi static method untuk manipulasi array seperti pencarian, pengurutan");

        // Sorting
        int[] numbers = {
                1, 5, 2, 7, 3, 9, 8, 1023, 512, 333, 821, 78
        };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Pencarian
        System.out.println(Arrays.binarySearch(numbers, 1023));
        System.out.println(Arrays.binarySearch(numbers, 3));

        // Copy to other array
        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        // Copy to other array
        int[] result2 = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println(Arrays.toString(result2));
    }
}
