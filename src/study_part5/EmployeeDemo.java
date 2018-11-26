package study_part5;

/**∑
 * Created by biz on 2018/7/17.
 *
 * 枚举是一种特殊的类，就是固定的多个常量对象的集合。底层没有无参构造器，是调用父类Enum类的构造器
 * 关键字为enum
 */

enum weekday{     // 等价于 final class weekday extends Enum

    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    weekday(){};
}

//class weekday {
//    private weekday(){};
//    public static final weekday MONDAY = new weekday();
//    public static final weekday TUESDAY = new weekday();
//    public static final weekday WEDNESDAY = new weekday();
//    public static final weekday THURSDAY = new weekday();
//    public static final weekday FRIDAY = new weekday();
//    public static final weekday SATURDAY = new weekday();
//    public static final weekday SUNDAY = new weekday();
//
//}

class employee {

    private weekday day;

    public weekday getDay() {
        return day;
    }

    public void setDay(weekday day) {
        this.day = day;
    }
}


public class EmployeeDemo {
    public static void main(String[] args) {
        employee wd = new employee();
        wd.setDay(weekday.SATURDAY);

        if (wd.getDay() == weekday.SATURDAY || wd.getDay() == weekday.SUNDAY) {
            System.out.println("今天是周末");
        } else {
            System.out.println("今天是工作日");
        }
        //返回枚举的名称
        System.out.println(weekday.SUNDAY.name());
        //返回枚举的序号
        System.out.println(weekday.SUNDAY.ordinal());
        //返回枚举的名称
        System.out.println(weekday.SUNDAY.toString());
        //返回当前枚举类型的所有常量，存放到一个数组里面
        weekday[] wds = weekday.values();
        for (weekday ele:wds
             ) {
            System.out.println(ele.name());
        }
        //返回指定名称enumtype的枚举常量。该名称必须用于声明在此类型的枚举常量的标识符完全匹配。
        weekday wd1 = weekday.valueOf("SUNDAY");
        System.out.println(wd1.name());
    }
}
