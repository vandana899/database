package mysql_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;
public class class1 {
    @Test
    public void tc1() throws SQLException {
        String host="localhost";
        String port="3306";
        Connection con=DriverManager.getConnection("jdbc:mysql://"+host+";"+port+"/Employeeinfo", "root", "Santosh@3155");
        Statement s=con.createStatement();
        ResultSet set= s.executeQuery("select * from Employeeinfo where count='1'");
        while(set.next()) {
            System.out.println(set.getString("name"));
            System.out.println(set.getString("password"));
        }
        
        
    }
}