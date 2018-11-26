package study_part5;

import java.awt.*;

/**
 * Created by biz on 2018/7/22.
 */
public class GUIDemo {
    public static void main(String[] args){

        Frame f = new Frame("GUi界面");

        //创建一个文本框
        TextField textField = new TextField(30);
        //把文本框存放在窗口f的北部
        f.add(textField,BorderLayout.NORTH);
        //创建一个按钮
        Button btn = new Button("提交");




    }
}
