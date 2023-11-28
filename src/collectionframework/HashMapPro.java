package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapPro {
    public static void main(String[] args) {
        String time1 = String.valueOf(System.currentTimeMillis());
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(101, "Apple");
        hashMap.put(102, "Mango");
        hashMap.put(103, "Banana");
        hashMap.put(101, "Fruits");
        hashMap.put(101, "Pickle");

        for (Map.Entry m : hashMap.entrySet()) {
            System.out.println(m.getKey() +" "+ m.getValue());
        }

        System.out.println();

    }
}
