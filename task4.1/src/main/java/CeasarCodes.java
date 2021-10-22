import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CeasarCodes implements Coder {
    private final int key;
    private final HashMap<Integer, String> Alpha;

    public CeasarCodes(int key) {
        this.key = key;
        HashMap<Integer, String> Alpha = new HashMap<>();
        int s = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            s = s + 1;
            Alpha.put(s, String.valueOf(i));
        }
        this.Alpha = Alpha;
    }

    @Override
    public String decode(String input) {
        char[] arrayChars = input.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arrayChars.length; i++) {
            s.append(decodeLetter(String.valueOf(arrayChars[i])));
        }
        return s.toString();
    }

    @Override
    public String encode(String input) {
        char[] arrayChars = input.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arrayChars.length; i++) {
            s.append(encodeLetter(String.valueOf(arrayChars[i])));
        }
        return s.toString();
    }

    // здесь ваш код

    public String decodeLetter(String letter) {
        for (Map.Entry<Integer, String> i : Alpha.entrySet()) {
            if (Objects.equals(i.getValue(), letter)) {
                if (i.getKey() - this.key <= 0) {
                    return Alpha.getOrDefault((Alpha.size() + i.getKey() - this.key), "A").toString();
                } else {
                    return Alpha.getOrDefault((i.getKey() - this.key), "A").toString();
                }
            }

        }
        return "0";
    }

    public String encodeLetter(String letter) {
        for (Map.Entry<Integer, String> i : Alpha.entrySet()) {
            if (Objects.equals(i.getValue(), letter)) {
                if (i.getKey() + this.key >= Alpha.size()) {
                    return Alpha.getOrDefault((i.getKey() + this.key - Alpha.size()), "A").toString();
                } else {
                    return Alpha.getOrDefault((i.getKey() + this.key), "A").toString();
                }
            }

        }
        return "0";
    }

    public static void main(String[] args) {
        CeasarCodes t = new CeasarCodes(4);
        System.out.println(t.decode("abcd"));
        System.out.println(t.encode("wxyz"));
    }
}





