package basicprogram.programs;

import java.util.HashMap;

//Can we keep an object of a Class as key in HashMap?
public class HashMapExampleCanKeepObjectAsKey {
    public static void main(String[] args) {
        HashMap<MyClass, String> hashMap = new HashMap<>();
        MyClass key1 = new MyClass("one");
        MyClass key2 = new MyClass("Two");

        hashMap.put(key1, "value for key1");
        hashMap.put(key2, "value for key2");

        String value1 = hashMap.get(key1);
        String value2 = hashMap.get(key2);

        System.out.println("value for key1 : "+value1);
        System.out.println("value for key2 : "+value2);
    }
}
