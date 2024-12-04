package SemPractice.Unit1.UDP;
import java.net.*;
import java.io.*;
import java.util.*;

public class client {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();

        String req = "Hello Server";
        DatagramPacket dp = new DatagramPacket(req.getBytes(), req.length(),InetAddress.getLocalHost(),1316);
        ds.send(dp);

        byte [] buff = new byte[64];
        DatagramPacket dpr = new DatagramPacket(buff, buff.length);
        ds.receive(dpr);
        String resp = new String(dpr.getData());
        System.out.println("response : "+resp);

        ds.close();
    }    
}
