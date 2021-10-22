import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Maps {

    public static Map<String, String> createMap() {
        HashMap<String, String> People = new HashMap<>();
        People.put("Павлунин", "Дмитрий");
        People.put("Валеев", "Максум");
        People.put("Хабибулин", "Ильдар");
        People.put("Семячкин", "Александр");
        People.put("Комелев", "Роман");
        People.put("Мостовых", "Егор");
        People.put("Акантьев", "Александр");
        People.put("Ветохин", "Александр");
        People.put("Калинин", "Иван");
        People.put("Шарипов", "Кирилл");
        return People;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String>
                                                            map) {
        HashMap<String, String> People1 = new HashMap<>();
        HashMap<String, String> People2 = new HashMap<>(map);
        Iterator<Map.Entry<String,String>> iter = People2.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,String> i = iter.next();
            if (!People1.containsValue(i.getValue())) {
                People1.put(i.getKey(), i.getValue());
            } else {
                removeItemFromMapByValue(map, i.getValue());
            }
        }
    }
    //напишите тут ваш код


    public static void removeItemFromMapByValue(Map<String, String> map,
                                                String value) {
        HashMap<String, String> People1 = new HashMap<>();
        for (Map.Entry<String, String> i : map.entrySet()) {
            if (!Objects.equals(i.getValue(), value)) {
                People1.put(i.getKey(), i.getValue());
            }

            //напишите тут ваш код
        } map.clear();
        map.putAll(People1);
    }

    public static void printMap(Map<String, String> map) {
        //напишите тут ваш код
        for (Map.Entry<String, String> me : map.entrySet()) {
            System.out.println("ключ : " + me.getKey() + ", значение = " + me.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, String> a1= createMap();
        removeTheFirstNameDuplicates(a1);
        printMap(a1);
        HashMap<Integer, String> Alpha= new HashMap<>();
        int s = 0;
        for(char i = 'a';i<='z';i++)
        {
            s = s + 1;
            Alpha.put(s, String.valueOf(i));

        }
        System.out.println(Alpha);
    }
}
