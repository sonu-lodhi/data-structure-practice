package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        hm.put("Chapati",12);
        hm.put("Kadai Paneer", 300);

        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            System.out.println(me.getKey() +" : " +me.getValue());
        }



    }
}
