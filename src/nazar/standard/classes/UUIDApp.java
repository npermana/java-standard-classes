package nazar.standard.classes;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        System.out.println("Demo UUID Class, untuk jadi primary key di database salah satu penerapannya");
        for(int i = 0; i < 100; i++){
            UUID uuid = UUID.randomUUID();

            String key = uuid.toString();
            System.out.println(uuid);
        }
    }
}
