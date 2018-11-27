package study_part6;

/**
 * Created by biz on 2018/11/15.
 */

class person extends Thread {

    private int number = 50;

    public person(String name) {
        super.setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (number >0){
                System.out.println(super.getName()+"吃了第"+number-- +"个苹果");
            }
        }
    }
}

public class ThreadTestDemo1 {

    public static void main(String[] args) {
        new person("小A").run();
        new person("小B").run();
        new person("小C").run();
    }
}
