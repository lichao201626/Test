import java.util.ArrayList;
import java.util.List;

public class DtoSort {
    static class Odto {
        @Override
        public String toString() {
            return this.name + ">>>>" + this.age;
        }

        Odto (String name, int age) {
            this.age = age;
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private String name;
        private int age;
    }
    public static void main(String[] args) {
        List<Odto> dtos = new ArrayList<>();
        Odto o1 = new Odto("2021-12-23 22:23", 12);
        Odto o2 = new Odto("2021-11-23 02:23", 13);
        Odto o3 = new Odto("2021-11-23 12:23", 14);
        dtos.add(o1);
        dtos.add(o2);
        dtos.add(o3);
        dtos.sort((a, b) -> {
            return a.name.compareTo(b.name);
        });
        System.out.println(dtos);
    }

}

