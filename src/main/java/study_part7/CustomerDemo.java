package study_part7;

/**
 * Created by zhanghaolei on 2018/11/29.
 */


public class CustomerDemo implements Runnable {

    private ShareDemo shareDemo = null;

    public CustomerDemo(ShareDemo shareDemo) {
        this.shareDemo = shareDemo;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            shareDemo.getSharDemo();
        }
    }

}
