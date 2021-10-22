import javax.print.DocFlavor;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = createUsers();
        Map<Integer, ArrayList<User>> Users2 = processUsers(users);
        printUserMap(Users2, 18);
    }

    private static ArrayList<User> createUsers() {
        ArrayList<User> users1 = new ArrayList<>();
        User u1 = new User();
        u1.setAge(18);
        u1.setSurname("Валеев");
        u1.setName("Максум");
        users1.add(u1);
        //
        User u2 = new User();
        u2.setAge(19);
        u2.setSurname("Павлунин");
        u2.setName("Дмитрий");
        users1.add(u2);
        //
        User u3 = new User();
        u3.setAge(18);
        u3.setSurname("хабибулин");
        u3.setName("Ильдар");
        users1.add(u3);
        //
        User u4 = new User();
        u4.setAge(20);
        u4.setSurname("Бережной");
        u4.setName("Алексей");
        users1.add(u4);
        //
        User u5 = new User();
        u5.setAge(28);
        u5.setSurname("Стародубцев");
        u5.setName("Дмитрий");
        users1.add(u5);
        //
        User u6 = new User();
        u6.setAge(41);
        u6.setSurname("Валеева");
        u6.setName("Елена");
        users1.add(u6);
        //
        User u7 = new User();
        u7.setAge(11);
        u7.setSurname("Валеев");
        u7.setName("Амир");
        users1.add(u7);
        //
        User u8 = new User();
        u8.setAge(18);
        u8.setSurname("Исаченко");
        u8.setName("Богдан");
        users1.add(u8);
        //
        User u9 = new User();
        u9.setAge(18);
        u9.setSurname("Ибраимов");
        u9.setName("Дамир");
        users1.add(u9);
        return users1;

    }

    private static Map<Integer, ArrayList<User>> processUsers(ArrayList<User> users) {
        Map<Integer, ArrayList<User>> multiMap = new HashMap<>();
        for (User i : users) {
            ArrayList<User> user = new ArrayList<>();
            if (multiMap.get(i.getAge()) != null) {
                user.addAll(multiMap.get(i.getAge()));
            }
            user.add(i);
            multiMap.put(i.getAge(), user);

        }
        return multiMap;
    }

    public static void printUserMap(Map<Integer, ArrayList<User>> map, Integer age) {
        ArrayList<User> users3 = map.get(age);
        System.out.println("Age: " + age);
        for (User i : users3) {
            System.out.println(i.toString());
        }
    }
}


