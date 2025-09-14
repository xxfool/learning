package com.x2space.inetaddress;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServiceDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");

        // 创建一个服务端对象
        ServerSocket ss = new ServerSocket(10086);

        while (true) {
            Socket socket = ss.accept();
            System.out.println("客户端" + socket.getInetAddress() + ":" + socket.getPort() + "上线了");
            new ServiceReader(socket).start();
        }
    }
}
