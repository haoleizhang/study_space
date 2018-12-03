package study_part7;

/**
 * Created by zhanghaolei on 2018/11/29.
 */




public class AppTest {

    public static void main(String[] args) {

        ShareDemo shareDemo = new ShareDemo();

        new Thread(new ProductDemo(shareDemo)).start();

        new Thread(new CustomerDemo(shareDemo)).start();
    }
}
