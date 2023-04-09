package nazar.standard.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        System.out.println("Demo Scanner class IO");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama: ");
        String nama = scanner.nextLine();
        System.out.println("Hello " + nama);
    }
}
