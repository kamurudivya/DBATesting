package com.Bridgelabz.DBA;

import org.testng.annotations.Test;

import java.sql.*;

/*
*Creating Test cases for Database
 */

public class DBTesting {
    @Test
    public static void select() throws SQLException {
        //Created params
        String dburl ="jdbc:mysql://localhost:3306/upload";
        String UserName="root";
        String Password="Sanvir08$$";
        //Connection to drivers
        Connection con = DriverManager.getConnection(dburl,UserName,Password);
        Statement stm =con.createStatement();
        ResultSet rs=stm.executeQuery("Select * from discount1");
        while (rs.next())
        {
            int Id =rs.getInt(1);
            String title=rs.getString(2);
            String expire_date =rs.getString(3);
            String amount =rs.getString(4);
            System.out.println(Id+ "  " +title+ "  "+ expire_date+ " " + amount);
        }

        con.close();
    }
}