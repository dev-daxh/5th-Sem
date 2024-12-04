import java.util.*;
import java.sql.*;
public class insertMultiple {
    public static void main(String[] args)throws Exception {
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "root", "root@123");
        System.out.println("Connection done ");

        try (Statement st = con.createStatement()){
            Scanner sc = new Scanner(System.in);
            String name,dep;
            int id,age;
            PreparedStatement pst = con.prepareStatement("insert into stu_info(id,name,age,dep) values (?,?,?,?)");
            int stop=0;
            do{
                System.out.println("id: ");
                id = sc.nextInt();
                System.out.println("name: ");
                name = sc.next();
                System.out.println("age: ");
                age = sc.nextInt();
                System.out.println("dep: ");
                dep = sc.next();

                pst.setInt(1,id);
                pst.setString(2, name);
                pst.setInt(3, age);
                pst.setString(4, dep);

                int i = pst.executeUpdate();
                System.out.println(i+ "records inserted!! ");

                System.out.println("want to contiue: 0-yes,1-no");
                stop = sc.nextInt();
            }
            while(stop==0);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
