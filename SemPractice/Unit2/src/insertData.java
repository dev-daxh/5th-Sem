import java.sql.*;
import java.util.*;
public class insertData {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "root", "root@123");
        System.out.println("done");

        try {
            Statement st = con.createStatement();
            //ResultSet rs = st.executeQuery("create table stu_info(enroll int,name varchar(255),age int , dep varchar(20))");
            Scanner sc = new Scanner(System.in);
            int id,age;
            String name,dep;
            System.out.println("enter info.\nid: ");
            id = sc.nextInt();
            System.out.print("name: ");
            name = sc.next();
            System.out.print("age :");
            age = sc.nextInt();
            System.out.print("dep: ");
            dep = sc.next();
            String query = String.format("insert into stu_info(id,name,age,dep) values (%d,'%s',%d,'%s')",id,name,age,dep);
            System.out.println(query);
            st.executeUpdate(query);
            System.out.println("record insert !!");

            ResultSet rs = st.executeQuery("select * from stu_info;");

            while(rs.next()){
                id = rs.getInt("id");
                name = rs.getString("name");
                age = rs.getInt("age");
                dep = rs.getString("dep");

                System.out.println("id: "+id+" name: "+name+" age: "+age+" dep: "+dep);

            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
