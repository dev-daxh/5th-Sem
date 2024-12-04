import java.net.*;
public class URLDemo {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.atozmarathi.com");

        System.out.println("Protocol :"+url.getProtocol());
        System.out.println("Host Name :"+url.getHost());
        System.out.println("Port "+url.getPort());
        System.out.println("File: "+url.getPath());
        System.out.println("Default port: "+url.getDefaultPort());

        HttpURLConnection huc = (HttpURLConnection)url.openConnection();
        for(int i=1;i<=8;i++){
            System.out.println(huc.getHeaderFieldKey(i)+"= "+huc.getHeaderField(i));

        }
        System.out.println(huc.getResponseCode());
        System.out.println(huc.getResponseMessage());
        huc.disconnect();
    }
}