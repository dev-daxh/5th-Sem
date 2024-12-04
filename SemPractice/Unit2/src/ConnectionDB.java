import java.sql.*;
public class ConnectionDB {
    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "root", "root@123");
        System.out.println("Connection Done");

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("show databases;");
            while (rs.next()) {
                String db = rs.getString(1);
                System.out.println(db);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}
