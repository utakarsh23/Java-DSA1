
import java.util.HashMap;
import java.util.Map;

public class HashhMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "Utkarsh");
        map.put(150, "Shaurya");
        map.put(200, "Dhruv");
        for(Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        System.out.println("============");
        System.out.println(map.get(100));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.remove(200));
        System.out.println(map.entrySet());
        map.clear();
        System.out.println(map.size());
        System.out.println(map.entrySet());
        System.out.println(map);
        System.out.println(map.isEmpty());
    }
}
