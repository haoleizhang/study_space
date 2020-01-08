package study_part9;

import java.io.Serializable;

/**
 * @program: Maventest
 * @description: user类
 * @author: 作者名称
 * @date: 2020-01-08 23:18
 **/
public class UserDemo implements Serializable {

    private String name;

    private String password;

    private int age;

    public UserDemo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDemo{" +
            "name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", age=" + age +
            '}';
    }
}
