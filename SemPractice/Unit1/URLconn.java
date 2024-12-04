import java.net.*;
public class URLconn {
    public static void main(String[] args) throws Exception {
        
        URL url = new URL("http://www.google.com");
        System.out.println(url.getContent());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getDefaultPort());


        HttpURLConnection huc = (HttpURLConnection) url.openConnection();
        for(int i=0;i<=8;i++){
            System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
        }
        huc.disconnect();
    }
}
