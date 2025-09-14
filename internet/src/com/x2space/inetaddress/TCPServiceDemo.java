package com.x2space.inetaddress;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServiceDemo {
    public static void main(String[] args) throws Exception {

        System.out.println("服务端启动");

        // 创建一个服务端对象
        Socket socket = new ServerSocket(10086).accept();
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        while (true) {
            String msg = dis.readUTF();
            if ("886".equals(msg)) {
                dis.close();
                socket.close();
                break;
            }
            System.out.println(socket.getInetAddress() + ":" + socket.getPort() + " 输入了：" + msg);
        }
    }
}
