import java.net.*;
import java.io.*;
public class contentRead {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://www.google.com");
        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();
        int c;
        while((c=is.read())!=-1){
            System.out.print((char) c);
        }
        
    }
}
