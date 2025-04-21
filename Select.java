package Console_habit;
import java.sql.*;

public class Select {
    public static void main(String[] args) throws Exception {
        final String uname="root";
        final String pwd="";
        final String url= "jdbc:mysql://localhost:3306/anamika";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn= DriverManager.getConnection(url, uname, pwd);

        Statement st= cn.createStatement();

        String query="Select * from Student";

        ResultSet rs= st.executeQuery(query);

        while(rs.next()){
            System.out.println("Roll: "+rs.getInt(1) +"Name= "+rs.getString(2) +"Mark= "+ rs.getInt(3));
        }
    }
}
