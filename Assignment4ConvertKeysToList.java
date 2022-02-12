import java.util.*;

public class Assignment4ConvertKeysToList {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(2, "L");
        map.put(3, "B");
        map.put(4, "R");
        map.put(5, "G");

        List<Integer> keyList = new ArrayList(map.keySet());
        System.out.println("Key List: " + keyList);
    }
}
