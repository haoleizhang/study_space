package study_part7;

/**
 * Created by zhanghaolei on 2018/11/29.
 */
public class ProductDemo implements Runnable{

    private ShareDemo shareDemo = null;

    public ProductDemo(ShareDemo shareDemo) {
        this.shareDemo = shareDemo;
    }

    public void run() {

        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                shareDemo.pushProduct("张三","男");
            }else{
                shareDemo.pushProduct("李四","女");
            }
        }
    }
}
