package study_part4;

/**
 * Created by biz on 2018/7/11.
 * 抽象类不能实例化
 */
//图形抽象类
abstract class AbstractGraphics{

    abstract public double calcarea();

}


//矩形
class rectangular extends AbstractGraphics{
    private Integer h;
    private Integer w;

    rectangular(Integer h,Integer w){
        this.h = h;
        this.w = w;
    }

    public double calcarea(){
        double result = h.doubleValue() * w.doubleValue();

        return result;
    }
}

//三角形
class triangle{
    private int a;
    private int b;
    private int c;

    triangle(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcarea(){

        //先算出半周长
        double perimeter = (a + b + c) / 2;
        double result = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return result;
    }
}



//圆形
class circular{

    private int r;

    circular(int r){
        this.r = r;
    }

    public double calcarea(){

        double result = r * r * 3.14;
        return result;
    }

}



public class AbstractDemo {

    public static void main(String[] args){

        //圆的面积
        System.out.println(new circular(2).calcarea());
        //矩形的面积
        System.out.println(new rectangular(4,5).calcarea());
        //三角形的面积
        System.out.println(new triangle(3,4,5).calcarea());
    }
}
