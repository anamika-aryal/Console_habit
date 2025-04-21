package Console_habit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteHabit {

    public int delete(String deleteHabit) {
        int i=0;
        try{
            final String uname="root";
        final String pwd="";
        final String url= "jdbc:mysql://localhost:3306/Habit";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn= DriverManager.getConnection(url, uname, pwd);

        PreparedStatement st= cn.prepareStatement("Delete from habits where name=?");
        
        st.setString(1, deleteHabit);
        
        i= st.executeUpdate();
         
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
              return i;
}
}
