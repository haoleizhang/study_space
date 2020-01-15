package study_part10;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @program: Maventest
 * @description: 模拟UDP协议的接收端
 * @author: 作者名称
 * @date: 2020-01-15 11:42
 **/
public class ReviceDemo {

    public static void main(String[] args) throws Exception {

        DatagramSocket datagramSocket = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes, 1024);

        datagramSocket.receive(dp);
        //打印结束的数据
        String msg = new String(dp.getData(),0,dp.getLength());
        System.out.println(msg);

        //关闭资源
        datagramSocket.close();

    }
}
