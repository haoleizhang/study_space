package study_part10;

import java.net.*;

/**
 * @program: Maventest
 * @description: 模拟UDP协议的发送端
 * @author: 作者名称
 * @date: 2020-01-15 11:42
 **/
public class SendDemo {

    public static void main(String[] args) throws Exception {

        String sendmsg = "这是要发送的数据";

        //定义发端对象
        DatagramSocket datagramSocket = new DatagramSocket(10010);
        //定义要发送的数据及要发送的地址
        DatagramPacket dp = new DatagramPacket(sendmsg.getBytes(),
            sendmsg.getBytes().length,
            InetAddress.getLocalHost(),
            10086);
        //发送数据
        datagramSocket.send(dp);
        //关闭资源
        datagramSocket.close();

    }
}
