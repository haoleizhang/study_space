package study_part7;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * Created by biz on 2018/12/2.
 * 备注：
 */


public class JsonReadTest {

    public static Map<Double, LabelTest> mapdata = new HashMap<>();
    public static List<Double> maxlist = new ArrayList<Double>();



    /**
     * 遍历map,并把key(probability)存进list，方便后面做对比
     */
    public void testentryset() {

        Set<Map.Entry<Double, LabelTest>> entries = mapdata.entrySet();
        for (Map.Entry<Double, LabelTest> entry : entries
                ) {
            System.out.println(entry.getKey());
            maxlist.add(entry.getKey());
        }


    }

    /**
     * 获取最小的probability
     * @return key(probability)
     */
    public double getProbility() {

        double max = 0.0;

        for (int length = 0; length < maxlist.size(); length++) {

            if (maxlist.get(length) < maxlist.get(0)) {
                max = maxlist.get(length);
            }
        }
        return max;
    }


    public static void main(String[] args) {

        //创建JSON解析器
        JsonParser parser = new JsonParser();

        try {
            //获取JSON文件
            JsonObject object = (JsonObject) parser.parse(
                    new FileReader("/Users/biz/Maventest/src/main/java/study_part7/test.json"));

            //获取第一层data,返回数据
            JsonArray data1 = object.get("data").getAsJsonArray();
            //遍历第一层data
            for (int j = 0; j < data1.size(); j++) {
                //获取第二层data,返回数组
                JsonObject a = data1.get(j).getAsJsonObject();
                JsonArray data2 = a.get("data").getAsJsonArray();
                //遍历第二层data，把数据存到map中，key为maxpro，value为第二层data对象
                for (int i = 0; i < data2.size(); i++) {
                    JsonObject temp = data2.get(i).getAsJsonObject();
                    mapdata.put(temp.get("probability").getAsDouble(),
                            new LabelTest(temp.get("top").getAsInt(),
                                    temp.get("left").getAsInt(),
                                    temp.get("width").getAsInt(),
                                    temp.get("height").getAsInt()
                            ));
                }
            }


            JsonReadTest test = new JsonReadTest();
            //获取probability存到list中
            test.testentryset();
//            System.out.println(maxlist.size());
            //获取最小的probability
            double maxpro = test.getProbility();
//            System.out.println(test.getProbility());
            //获取data对象内属性值
            int a = mapdata.get(maxpro).getTop();
            int b = mapdata.get(maxpro).getLeft();
            int c = mapdata.get(maxpro).getWidth();
            int d = mapdata.get(maxpro).getHeight();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
