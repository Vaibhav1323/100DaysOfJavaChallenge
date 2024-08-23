import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionFramework {
    public static void main(String[] args) {
        // List interface
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);

        // Set interface
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("Set: " + set);

        // SortedSet interface
        Set<String> sortedSet = new TreeSet<>();
        sortedSet.add("Apple");
        sortedSet.add("Banana");
        sortedSet.add("Cherry");
        System.out.println("SortedSet: " + sortedSet);

        // Map interface
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        System.out.println("Map: " + map);

        // SortedMap interface
        Map<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Apple", 1);
        sortedMap.put("Banana", 2);
        sortedMap.put("Cherry", 3);
        System.out.println("SortedMap: " + sortedMap);

        // LinkedList and LinkedHashSet
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("LinkedList: " + linkedList);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Collections class
        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");
        Collections.sort(list2);
        System.out.println("Sorted list: " + list2);
    }
}
