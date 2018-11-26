package study_part5;

/**
 * Created by biz on 2018/7/15.
 */

interface IUSB {

    void swapData();
}


class mousedemo implements IUSB {
    public void swapData() {
        System.out.println("鼠标在移动");
    }
}

class printdemo implements IUSB {
    public void swapData() {
        System.out.println("打印资料");
    }
}

class MontherBoard {

    private static IUSB[] is = new IUSB[6];

    private static int count = 0;

    public void pluginIn(IUSB ib) {

        if (count == is.length) {
            return;
        }
        is[count] = ib;
        count++;

    }

    public static void doWork() {

        for (IUSB demo : is
                ) {
            if (demo != null) {
                demo.swapData();
            }
        }
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {

//        mousedemo md = new mousedemo();
//        new MontherBoard().pluginIn(md);
        MontherBoard mb = new MontherBoard();
        mb.pluginIn(new mousedemo());
        mb.pluginIn(new printdemo());
        mb.pluginIn(new printdemo());
        mb.pluginIn(new printdemo());
        mb.pluginIn(new printdemo());
        mb.pluginIn(new IUSB() {
            @Override
            public void swapData() {
                System.out.println("匿名内部类");
            }
        });
        MontherBoard.doWork();

    }
}
