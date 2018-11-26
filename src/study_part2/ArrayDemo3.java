package study_part2;

/**
 * Created by biz on 2018/6/18.
 *
 * 查找数组内元素第一次\最后一次出现的位标
 */
public class ArrayDemo3 {

    public static  int[] nums = new int[]{19,49,59,25,52,355,49,23,52,49};

    //查找数组内元素第一次出现的位标,没有该元素的话返回-1
    static int beginIndex(int[] demo,int key){

        for (int i=0;i<demo.length;i++){
            if(demo[i] == key){
                return i;
            }

        }

        return -1;
    }
    //查找数组内元素最后一次出现的位标,没有该元素的话返回-1
    static int endIndex(int[] demo,int key){

        for (int i=demo.length-1;i>=0;i--){
            if(demo[i] == key){
                return i;
            }

        }

        return -1;
    }


    public static void main(String[] args) {

        System.out.println(ArrayDemo3.beginIndex(nums,521));

        System.out.println(ArrayDemo3.endIndex(nums,522));
    }
}
