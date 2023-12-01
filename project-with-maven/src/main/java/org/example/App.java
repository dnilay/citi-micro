package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        System.out.println( "Hello World!" );
        DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
        Connection connection=DriverManager.getConnection("jdbc:mariadb://localhost:3306/hr", "root", "root");
        System.out.println(connection);
    }
}
