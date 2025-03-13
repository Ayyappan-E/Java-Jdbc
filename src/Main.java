import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
// Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/test";
        String username = "postgres";
        String password = "6373";

        String query = "select * from employee";
        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        con.close();
        }
    }
