package study_part7;

/**
 * Created by biz on 2018/12/2.
 * 备注：
 */


public class LabelTest {

    LabelTest(int top,int left,int width,int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public int getTop() {
        return top;
    }

    public LabelTest setTop(int top) {
        this.top = top;
        return this;
    }

    public int getLeft() {
        return left;
    }

    public LabelTest setLeft(int left) {
        this.left = left;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public LabelTest setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public LabelTest setHeight(int height) {
        this.height = height;
        return this;
    }

    public int top;

    public int left;

    public int width;

    public int height;


}
