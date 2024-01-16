package hash_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map map = new HashMap<String, List<String>>();
        List<String> list = new ArrayList<>();
        list.add("taemin");
        list.add("khvicha");
        map.put("gets", list);

        Object gets = map.get("gets");
        System.out.println(gets);
    }
}
