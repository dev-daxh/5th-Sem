package SemPractice.Unit1.TCP;
import java.net.*;
import java.io.*;
import java.util.*;
public class client {
    public static void main(String[] args) throws Exception {

        Socket sc = new Socket(InetAddress.getLocalHost(),1316);

        InputStream is = sc.getInputStream();
        OutputStream os = sc.getOutputStream();
        Scanner scan = new Scanner(is);
        PrintWriter pw = new PrintWriter(os,true);

        String req = "Hello";
        pw.println(req);
        System.out.println("request send");
        
        String resp = scan.nextLine();
        System.out.println("Response from server: "+resp);

        sc.close();
        scan.close();
    }
}
