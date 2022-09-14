package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc {
	public static void main(String[] args) throws SQLException {
        Connection con = null;



       try {
            // connect to database
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "Muthu@12345");



           System.out.println(" dataBASE conneted ");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select *from books");
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }



       } catch (Exception e) {



           e.printStackTrace();
        } finally {
            con.close();
        }
    }



}

