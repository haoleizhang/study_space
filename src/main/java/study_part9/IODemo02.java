package study_part9;

import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @program: Maventest
 * @description: IO操作
 * @author: 作者名称
 * @date: 2020-01-02 23:09
 **/
public class IODemo02 {
    public static void main(String[] args) {
        Properties pro = System.getProperties();

        Set<Map.Entry<Object, Object>> set = pro.entrySet();

//        for (Map.Entry me:set
//             ) {
//            System.out.println(me.getKey()+"  +  "+me.getValue());

        System.out.println(pro.get("user.dir"));
//        }
    }
}
