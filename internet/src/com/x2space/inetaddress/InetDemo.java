package com.x2space.inetaddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo {
    public static void main(String[] args) throws IOException {
        // 获取本地主机的 InetAddress 对象
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());

        InetAddress inetAddress1 = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress1);
        System.out.println(inetAddress1.getHostName());
        System.out.println(inetAddress1.getHostAddress());

        System.out.println(inetAddress1.isReachable(3000));

    }
}