package nazar.standard.classes;

import java.util.Objects;

public class ObjectsApp {
    public static class Data{
        String data;

        public Data(){
//            this.data = "";
        }

        public Data(String data){
            this.data = data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data data1 = (Data) o;

            return Objects.equals(data, data1.data);
        }

        @Override
        public int hashCode() {
            return data != null ? data.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        System.out.println("Demo Objects App");
        System.out.println("Untuk menghindari Nullpointerexception atau pengechekan terhadap null data maka gunakan Objects");
        execute(new Data("nazar"));
        execute(new Data());
        System.out.println("eksekusi code lebih aman");
    }

    public static void execute(Data data){
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
    }
}
