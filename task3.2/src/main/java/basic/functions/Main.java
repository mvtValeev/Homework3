package basic.functions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exceptioninput {
        try {
            Scanner in = new Scanner(System.in);
            String forlist = in.nextLine();
            ArrayList<Integer> firstlist = Input(forlist.split(" "));
            ArrayList<Integer> mod3 = new ArrayList<>();
            ArrayList<Integer> mod2 = new ArrayList<>();
            ArrayList<Integer> mod01 = new ArrayList<>();
            for (Integer i: firstlist) {
                if ((i) % 3 == 0) {
                    mod3.add(i);
                }
                if ((i) % 2 == 0) {
                    mod2.add(i);
                }
                if ((i) % 2 != 0 && (i) % 3 != 0) {
                    mod01.add(i);
                }

            } printList(mod3);
            System.out.println("");
            printList(mod2);
            System.out.println("");
            printList(mod01);
            System.out.println("");
        } catch (Exceptioninput e) {
            System.out.println(e.getMessage());
        }
    }


    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> Input(String[] list) throws Exceptioninput {
        ArrayList<Integer> a = new ArrayList<>();
        if (list.length != 20) {
            throw new Exceptioninput("Неверное кол-во элементов");
        } else {
            for (String i : list) {
                try {
                    a.add(Integer.parseInt(i));
                } catch (Exception e) {
                    System.out.println(i+"e");
                    throw new Exceptioninput("Неверный формат ввода элемента " + i + ".");

                }

            }
            System.out.println(a);
            return a;

        }
    }
}

class Exceptioninput extends Exception {
    public Exceptioninput(String messege) {
        super(messege);
    }
}




