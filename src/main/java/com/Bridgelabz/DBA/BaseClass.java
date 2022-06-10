package com.Bridgelabz.DBA;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
*Base Class Connection with DataBase
*
*/
public class BaseClass {
    public static Connection con;
    @BeforeTest
    public Connection setUp() throws SQLException {
        //Created params
        String dburl ="jdbc:mysql://localhost:3306/upload";
        String UserName="root";
        String Password="Sanvir08$$";
        //Creating connection object for MYSQL db
        Connection con = DriverManager.getConnection(dburl,UserName,Password);
        return con;
    }
    @AfterTest
    public void tearDown() throws SQLException {
        con.close();
    }
}