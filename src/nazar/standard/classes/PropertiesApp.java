package nazar.standard.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        System.out.println("Demo Properties File");
        System.out.println("Penyimpanan konfigurasi");
        System.out.println("Key value dipisahkan dengan tanda =");

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.user");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException e){
            System.out.println("File tidak ditemukan");
        } catch (IOException e){
            System.out.println("Gagal me-load file");
        }


        //
        System.out.println("menyimpan ke dalam properties");
        try {
            Properties properties = new Properties();
            properties.put("name.first", "nazar");
            properties.put("name.last", "permana");
            properties.store(new FileOutputStream("other.properties"), "test store properties file");
        } catch (FileNotFoundException e){
            System.out.println("File tidak ditemukan");
        } catch (IOException e){
            System.out.println("Gagal me-load file");
        }

    }
}
