package src;

import src.ArrayListAndHashMap.CustomHashMap;

public class Test {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("q",1);
        map.put("a",2);
        map.put("f",3);
        map.put("g",4);

        System.out.println(map);
        System.out.println(map.get("a"));
        System.out.println(map.size());
        System.out.println(map.containsKey("f"));
        System.out.println(map.containsKey("k"));
        System.out.println(map.containsValue(4));
        System.out.println(map.containsValue(11));
        System.out.println(map.remove("q"));
        System.out.println(map.remove("a", 2));
    }
}
