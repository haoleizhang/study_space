package study_part10;



import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: Maventest
 * @description: 模拟Http客服端发送请求
 * @author: 作者名称
 * @date: 2020-01-15 10:23
 **/
public class ClientDemo {

    public static void main(String[] args) throws Exception {

        //创建客服端并指明要连接的服务端对象
        Socket client = new Socket("localhost",8888);

        //获取客服端的输入流对象
        InputStream inputStream = client.getInputStream();

        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()){
            String msg = scanner.nextLine();
            System.out.println(msg);
        }

        inputStream.close();
        client.close();
    }
}
