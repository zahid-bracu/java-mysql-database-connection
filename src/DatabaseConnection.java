
import java.sql.DriverManager;
import java.sql.*;
public class DatabaseConnection {
    
    private static Connection con=null;
     
    public static Connection getConnection()
    {
        try
        {
             
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_registration?useTimezone=true&serverTimezone=UTC","root","");
        }
        catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
        return con;
    }
    //public static void main(String [] args)
}
