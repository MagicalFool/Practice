package practice014_concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        ConcurrentHashMap hashMap = new ConcurrentHashMap();
        HashMap map = new HashMap();
        Hashtable<Object, Object> table = new Hashtable<Object, Object>();
//        Object put = table.put("1", "2");
//        table.put("1","3");
//        Collections.synchronizedMap(map);
//        System.out.println(put);
        new ThreadDemo(map, 0, 30).start();
        new ThreadDemo(map, 30, 60).start();
        new ThreadDemo(map, 60, 90).start();

        System.out.println(map);
        System.out.println(map.size());
    }
}
