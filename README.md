# Java-Jdbc
Java jdbc conncetion using postgresql

 how to connect jdbc
    1.import the package  - java.sql.*;
    2.load and register the driver - download driver google && Class.forName("org.postgresql.Driver");
    3.Establish a connection -  String url = "jdbc:postgresql://localhost:5432/test";
    4.create a  - Statement st = con.createStatement();
    5.Execute the statement / Sql Query -  String sql = "Select * from employee where id = 1";
     three types execute query
     1.executeQuery();   - DQL select ( return type string )
     2.executeUpdate();  - DML , DDL  ( return type integer )
     3.execute(); - not use mostly
    6.process the result - ResultSet rs = st.executeQuery(sql);
    7.close the connection
     */
}
