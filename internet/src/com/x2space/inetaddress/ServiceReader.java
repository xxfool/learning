package com.x2space.inetaddress;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServiceReader extends Thread{
    private Socket socket;
    public ServiceReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                String msg = dis.readUTF();
                System.out.println(socket.getInetAddress() + ":" + socket.getPort() + " 输入了：" + msg);
            }
        } catch (Exception e) {
            System.out.println("客服端" + socket.getInetAddress() + ":" + socket.getPort() + " 断开连接");
        }
    }
}
