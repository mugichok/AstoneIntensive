package ArrayListAndHashMap;

import ArrayListAndHashMap.Exceptions.IndexOutOfBoundsException;

public class Main {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        CustomArrayList<Integer> list = new CustomArrayList<>(10);
        System.out.println(list.isEmpty());
        list.add(1);
        list.add(56);
        list.add(567);
        System.out.println(list.contains(567));
        System.out.println(list.get(1));
        System.out.println(list.toString());
        System.out.println();
        CustomHashMap<String, Integer> map= new CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("pow", 45);
        System.out.println(map.get("two"));
        System.out.println(map.size());
        System.out.println(map.containsKey("two"));
        System.out.println(map.containsValue(45));
        System.out.println(map.toString());

    }
}
