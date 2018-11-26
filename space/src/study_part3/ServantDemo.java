package study_part3;

/**
 * Created by biz on 2018/6/25.
 * 构造器（Construtor）
 * 构造器的作用：
 *      创建对象，必须要和new一起使用
 *      完成对象的初始化
 *
 * 构造器的特点：
 *      1、构造器的名称要和当前所在的类的名称相同
 *      2、在构造器中，不需要使用return语句
 *      3、禁止定义返回类型，千万不要使用void作为返回类型
 *
 * 编译器创建的默认构造器的特点
 *      1、符合构造器的特点
 *      2、无参数的
 *      3、无方法体的
 *      4、如果类A没有使用public修饰，则编译器创建的构造器也没有public修饰，反之则有public
 *
 *
 */
public class ServantDemo {

    public static void main(String[] args) {

        Servant s1 = new Servant();
        s1.name = "张三";
        s1.isfee = true;


        Servant s2 = new Servant();
        s2.name = "李四";


        Servant s3 = new Servant();
        s3.name = "小明";
        s3.isfee = false;


        Servant s4 = new Servant();
        s4.name = "Lucy";
        s4.isfee = true;

        //把Servant对象放到数组里面
        //如果此时遍历输出数据sarr内元素的话，输出的是Servant对象在堆中的内存地址
        Servant[] sarr = new Servant[]{s1, s2, s3, s4};

        //遍历数据内的元素
        for (Servant sys :
                sarr) {

            if (sys.isfee) {

                System.out.println("已经交学费的学生有: " + sys.name);
            }

            if (!sys.isfee) {

                System.out.println("未交学费的学生有: " + sys.name);
            }
        }

        //对未交学费的学生做交学费处理

        for (int i = 0; i < sarr.length; i++) {

            if (!sarr[i].isfee) {
                sarr[i].commitfee();
            }

        }

        //缴费后遍历数据内元素

        System.out.println("--------------------");

        for (Servant sys :
                sarr) {

            if (sys.isfee) {

                System.out.println("已经交学费的学生有: " + sys.name);
            }

            if (!sys.isfee) {
                System.out.println("未交学费的学生有: " + sys.name);
            }
        }
    }


}
