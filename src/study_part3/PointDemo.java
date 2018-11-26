package study_part3;

/**
 * Created by biz on 2018/7/1.
 * 判断点和圆的关系（在圆内，在圆上，在圆外）
 */


class point{
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double x;

    private double y;

    point(){

    }
    point(double x,double y){

        this.x = x;
        this.y = y;
    }


}

class circle{
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    private double r;

    int judeg(point point){

        double p = Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY());

        if (r > p){
            return 0;//在圆内
        }else if (r == p){
            return 1;//在圆上
        }else
        {
            return -1;//在圆外
        }
    }

}

public class PointDemo {

    public static void main(String[] args){

        point p1 = new point();
        p1.setX(3);
        p1.setY(4);

        circle c = new circle();
        c.setR(5);

        System.out.println(c.judeg(p1));

    }
}
