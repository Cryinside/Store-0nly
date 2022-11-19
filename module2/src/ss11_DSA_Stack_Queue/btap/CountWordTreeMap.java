package ss11_DSA_Stack_Queue.btap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class CountWordTreeMap {
    public static void main(String[] args) {
        countWord();
    }
    private static void countWord(){
        String str="lua nep la lua nep la";
          str=str.replaceAll(",","");
        String[] arr=str.split("");
        String key="";
        Integer value;
        TreeMap<String, Integer> map=new TreeMap<String, Integer>();
        int size=arr.length;
        for (int i = 0; i <size ; i++) {
            key=arr[i];
            if (map.containsKey(key)){
                value=map.get(key);
                map.remove(key);
                map.put(key,value+1);
            }else {
                map.put(key,1);
            }
        }
//        Set<String> set=map.keySet();
        Iterator i =map.keySet().iterator();
        while (i.hasNext()){
            key=(String)i.next();
            System.out.println("Từ "+key+"' xuất hiện "+map.get(key)+" lần");
        }


    }
}
