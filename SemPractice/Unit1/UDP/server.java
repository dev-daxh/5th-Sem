package SemPractice.Unit1.UDP;
import java.net.*;
import java.io.*;
import java.util.*;
public class server {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(1316);

        byte [] buff = new byte[64];
        DatagramPacket dp = new DatagramPacket(buff, buff.length);
        ds.receive(dp);
        String req = new String(dp.getData());
        System.out.println("req got : "+req);

        String respString = "Hello Client"+ds.getLocalAddress().getHostAddress();
        DatagramPacket dpr = new DatagramPacket(respString.getBytes(), respString.length(),dp.getAddress(),dp.getPort());
        ds.send(dpr);
        System.out.println("send !!");
    }
}
