package com.x2space.inetaddress;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServiceReader2 extends Thread{
    private Socket socket;
    public ServiceReader2(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type: text/html; charset=UTF-8");
            ps.println();
            ps.println("<html>");
            ps.println("<head><title>欢迎</title></head>");
            ps.println("<body>");
            ps.println("<h1>欢迎</h1>");
            ps.println("</body>");
            ps.println("</html>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("客服端" + socket.getInetAddress() + ":" + socket.getPort() + " 断开连接");
        }
    }
}
