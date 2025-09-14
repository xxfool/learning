package com.x2space.inetaddress;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientDemo {
    public static void main(String[] args) throws Exception {

        System.out.println("客户端启动...");

        // 创建一个客户端TCPSocket对象
        Socket socket = new Socket("127.0.0.1", 10086);

        // 从socket中获取输出流
        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入：");
            String msg = sc.nextLine();
            if ("886".equals(msg)) {
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
