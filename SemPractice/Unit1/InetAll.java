package SemPractice.Unit1;
import java.net.*;
public class InetAll {
    public static void main(String[] args)throws Exception{

        InetAddress localAddress = InetAddress.getLocalHost();
        System.out.println(localAddress);
        
        InetAddress getbyname = InetAddress.getByName("www.google.com");
        System.out.println(getbyname);

        InetAddress getall [] = InetAddress.getAllByName("www.google.com");
        for(InetAddress x:getall){
            System.out.println(x+"/n");
        }
    }
}
