package study_part10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URLEncoder;
import java.util.Properties;

/**
 * @program: Maventest
 * @description: 获取配置文件里面的数据
 * @author: 作者名称
 * @date: 2020-01-14 17:23
 **/
public class getProper {

    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();


        properties.load(new FileInputStream("/Users/user/oa-platform/study_space/db"));



        System.out.println(properties.getProperty("username"));


    }

}
