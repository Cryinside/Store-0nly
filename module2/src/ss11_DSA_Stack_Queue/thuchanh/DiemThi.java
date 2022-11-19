package ss11_DSA_Stack_Queue.thuchanh;

import java.util.*;

public class DiemThi {
    public static void main(String[] args) {
//        // Tao mot hash map
//        HashMap hm = new HashMap();
//        // Dat cac phan tu vao map
//        hm.put("Zara", new Double(3434.34));
//        hm.put("Mahnaz", new Double(123.22));
//        hm.put("Ayan", new Double(1378.00));
//        hm.put("Daisy", new Double(99.22));
//        hm.put("Hieu", new Double(99.08));
//
//        // Lay mot set cac entry
//        Set set = hm.entrySet();
//        // Lay mot iterator
//        Iterator i = set.iterator();
//        // Hien thi cac phan tu
//        while(i.hasNext()) {
//            Map.Entry me = (Map.Entry)i.next();
//            System.out.print(me.getKey() + ": ");
//            System.out.println(me.getValue());
//        }
//        System.out.println();
//        // Gui 1000 vao trong tai khoan cua Zara
//        double balance = ((Double)hm.get("Hieu")).doubleValue();
//        hm.put("Zara", new Double(balance + 1000));
//        System.out.println("Balance moi cua Hieu la: " +
//                hm.get("Zara"));
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);

        Set<String> keys = customers.keySet();
        for (String key: keys){
            System.out.println("Key: " + key + ": " + customers.get(key));
        }
    }


}
