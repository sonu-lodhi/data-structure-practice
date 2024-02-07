package collectionframework;

import java.util.HashMap;

public class ConstantHashCodeHashMap {
    public static void main(String[] args) {
        HashMap<ConstantHashCodeObject, String> hashMap = new HashMap<>();
        ConstantHashCodeObject key1 = new ConstantHashCodeObject("Key1");
        ConstantHashCodeObject key2 = new ConstantHashCodeObject("Key2");

        hashMap.put(key1, "Value1");
        hashMap.put(key2,"Value2");

        String value1 = hashMap.get(key1);
        String value2 = hashMap.get(key2);

        System.out.println("Value for key1 "+value1);
        System.out.println("Value for key2 "+value2);

    }
}
