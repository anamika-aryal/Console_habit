package Console_habit;
import java.sql.*;

public class AddHabit {
    public void insert(String habit, String status, int streak) {
        try{
            
        final String uname="root";
        final String pwd="";
        final String url= "jdbc:mysql://localhost:3306/Habit";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn= DriverManager.getConnection(url, uname, pwd);

        PreparedStatement st= cn.prepareStatement("Insert into habits value(?,?,?)");

        st.setString(1, habit);
        st.setString(2, status);
        st.setInt(3, streak);
        
        int i= st.executeUpdate();
        
        System.out.println(i);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
