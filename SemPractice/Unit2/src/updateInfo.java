import java.sql.*;
import java.net.*;

public class updateInfo {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java","root","root@123");
        System.out.println("done");
        try (Statement st = con.createStatement()){
            int rs = st.executeUpdate("update stu_info set age=18 where id=17");
            System.out.println("updated : "+rs+ " statements!!");

            ResultSet resultSet = st.executeQuery("select * from stu_info where id=17");

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int id = resultSet.getInt("id");
                int age = resultSet.getInt("age");
                String dep = resultSet.getString("dep");
                
                System.out.println("id: "+id+" name: "+name+" age: "+age+" dep: "+dep);
            }


            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}