import java.net.*;

public class GetRemoteHostIP {
    public static void main(String[] args) {
        try {
            // Specify the remote host (e.g., a website or IP address)
            String host = "http://www.tutorialspoint.com/";

            // Get InetAddress object by resolving the host name
            InetAddress inetAddress = InetAddress.getByName(host);

            // Retrieve the IP address associated with the host
            String ipAddress = inetAddress.getHostAddress();

            // Print the IP address
            System.out.println("IP Address of " + host + ": " + ipAddress);
        } catch (UnknownHostException e) {
            // Handle the case when the host cannot be resolved
            System.out.println("Host not found: " + e.getMessage());
        }
    }
}
