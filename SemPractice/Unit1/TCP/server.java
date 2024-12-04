package SemPractice.Unit1.TCP;
import java.net.*;
import java.util.*;
import java.io.*;
public class server {
    public static void main(String[] args) throws Exception{
        boolean working = true;
        System.out.println("Server started working !!");
        ServerSocket ss = new ServerSocket(1316);

        while (working) {
            try {
                Socket sc = ss.accept();
                System.out.println("Client Connected :"+sc.getInetAddress().getHostAddress());

                InputStream is = sc.getInputStream();
                OutputStream os = sc.getOutputStream();
                Scanner scan = new Scanner(is);
                PrintWriter pw = new PrintWriter(os,true);

                String req = scan.nextLine();
                System.out.println("req. received : "+req);

                String resp = "Hello Client"+sc.getLocalAddress().getHostName();
                pw.println(resp);

            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        
    }
}
