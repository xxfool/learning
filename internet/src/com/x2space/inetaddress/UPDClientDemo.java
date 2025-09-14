package com.x2space.inetaddress;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UPDClientDemo {
    public static void main(String[] args) throws Exception {
        // 创建发送端对象
        DatagramSocket socket = new DatagramSocket();
        // 创建数据，并把数据封装到DatagramPacket对象中
        Scanner sc = new Scanner(System.in);
        while (true) {
            String msg = sc.nextLine();
            if ("886".equals(msg)) {
                break;
            }
            DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
                    InetAddress.getLocalHost(), 8080);
            socket.send(packet);
        }
    }
}
