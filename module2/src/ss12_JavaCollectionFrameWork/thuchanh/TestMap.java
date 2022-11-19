package ss12_JavaCollectionFrameWork.thuchanh;


import java.util.*;

public class TestMap {
    public static void main(String[] args) {

        //hashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in es");
        System.out.println(hashMap + "\n");

//        hashMap sx theo key
        System.out.println("----- Before sorting, random order -----");
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Smith", 30);
        hashMap1.put("Anderson", 31);
        hashMap1.put("Lewis", 29);
        hashMap1.put("Cook", 29);

        // khoi tao set entries
        Set<Map.Entry<String, Integer>> entries = hashMap1.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        System.out.println("----- After sorting by keys, ascending order -----");
        TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(hashMap1);
        Set<Map.Entry<String, Integer>> mappings = sorted.entrySet();
        for (Map.Entry<String, Integer> mapping : mappings) {
            System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
        }

        //        hashMap sx theo key
        System.out.println("----- Before sorting, random order -----");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                Integer v1 = o1.getValue();
                Integer v2 = o2.getValue();

                return v1.compareTo(v2);
            }
        };

        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);
        Collections.sort(list, comparator);
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>(list.size());
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("----- After sorting by values -----");
        Set<Map.Entry<String, Integer>> sortedEntries = sortedMap.entrySet();
        for (Map.Entry<String, Integer> mapping : sortedEntries) {
            System.out.println(mapping.getKey() + " ==>> " + mapping.getValue());
        }


        //treeMap sx theo key
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Smith", 30);
        treeMap.put("Anderson", 31);
        treeMap.put("Lewis", 29);
        treeMap.put("Cook", 29);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap + "\n");
        Map<String, Integer> treeMapReverse = new TreeMap<>(Collections.reverseOrder());
        System.out.println("Display entries in decrease order of key");
        treeMap.putAll(hashMap);
        System.out.println(treeMap);


        //

//        TreeMap<String, Integer> sorted= new TreeMap<String, Integer>(treeMap);
//        Set<Map.Entry<String,Integer>> setValue=sorted.entrySet();
//        for (Map.Entry<String,Integer> maps:setValue) {
//            System.out.println(maps.getKey()+" ==> "+ maps.getValue());
//        }

        //linkedHashMap

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println(linkedHashMap);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

        Set<Map.Entry<String, Integer>> entries1 = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries1) {
            System.out.println(entry.getKey()+" ==> "+entry.getValue());

        }
    }
}
