package study_part8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemoTest {

    public static void main(String[] args) {

        Map<Integer,Object> map = new HashMap<>();

        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"小孙");



        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("张三"));
        System.out.println(map.get(1));
        System.out.println(map);

        Set<Integer> set = map.keySet();

        for (Integer se:
            set) {
            System.out.println(se);
            System.out.println(map.get(se));
        }

        Collection <Object> set1 = map.values();

        for (Object se1:set1
             ) {
            System.out.println(se1);
        }




    }
}
