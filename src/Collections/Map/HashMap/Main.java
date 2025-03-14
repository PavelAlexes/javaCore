package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    Map<Integer, String> map = new HashMap<>();

        map.put(1, "hello");
        map.put(2, "hello");

//        System.out.println(map);

        Integer x = 1;

        System.out.println(x.hashCode());
    }



}
