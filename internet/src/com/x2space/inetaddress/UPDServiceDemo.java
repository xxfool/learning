package com.x2space.inetaddress;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UPDServiceDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8080);
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        while (true) {
            socket.receive(packet);
            System.out.println(packet.getAddress().getHostAddress() + ":" + packet.getPort());
            System.out.println("          " + new String(packet.getData(), 0, packet.getLength()));
        }
    }
}
