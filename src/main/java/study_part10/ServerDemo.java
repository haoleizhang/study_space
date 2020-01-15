package study_part10;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: Maventest
 * @description: 模拟http服务端接受处理请求，TCP协议
 * @author: 作者名称
 * @date: 2020-01-15 09:47
 **/
public class ServerDemo  {
    public static void main(String[] args) throws Exception {

        //创建服务端并指明端口号
        ServerSocket serverSocket = new ServerSocket(8888);

        System.out.println("服务端准备接受数据");

        //接受服务端对象
        Socket socket = serverSocket.accept();
        //打印客户端的请求地址
        System.out.println("连接过来的客户端" + socket.getInetAddress());

        PrintStream printStream = new PrintStream(socket.getOutputStream());

        printStream.print("这个是服务端返回的数据");

        socket.close();
        serverSocket.close();

    }
}
