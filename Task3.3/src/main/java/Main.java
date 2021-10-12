import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1,
                                                 Set<? extends T> set2) {
        Set<T> hashset1 = new HashSet<>(set1);
        Set<T> hashset2 = new HashSet<>(set2);
        Set<T> hashset3 = new HashSet<>();
        hashset3.addAll(hashset1);
        hashset3.addAll(hashset2);
        hashset2.retainAll(hashset1);
        hashset3.removeAll(hashset2);
        return hashset3;
    }
}

class Main2 {
    public static void main(String[] args) {
        Set<Object> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        Set<Object> b = new HashSet<>();
        b.add(4);
        b.add(2);
        b.add(3);
        System.out.println(Main.symmetricDifference(a,b));
    }
}