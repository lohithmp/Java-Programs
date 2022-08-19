package com.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
here Creating Josh table and  JavaFresher table into the database
 */
public class CreateTable {
    public static void main(String[] args) {
        //url for connecting with postgresql database.
        final String url = "jdbc:postgresql://localhost:5432/Josh";
        //UserName for postgresql.
        final String user = "postgres";
        //password for postgresql.
        final String password = "1234";
         /*
            Here Create Josh table  into the database.
         */
        String query="CREATE TABLE Josh(\n" +
                "   ID INT PRIMARY KEY     NOT NULL,\n" +
                "   NAME           TEXT    NOT NULL,\n" +
                "   AGE            INT     NOT NULL,\n" +
                "   ADDRESS        CHAR(50),\n" +
                "   SALARY         REAL\n" +
                ");";
         /*
            Here Create JavaFresher table  into the database.
         */
        String query1="CREATE TABLE JavaFresher(\n" +
                "   USERID INT PRIMARY KEY     NOT NULL,\n" +
                "   NAME           TEXT    NOT NULL,\n" +
                "   AGE            INT     NOT NULL,\n" +
                "   ADDRESS        CHAR(50),\n" +
                "   SALARY         REAL\n" +
                ");";
        Connection connection =null;
        Statement statement=null;
        try {
            //Establishing Connection to the database Using .getConnection().
            connection = DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();
            statement.execute(query);
            statement.execute(query1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Closing the connection & Statement.
        finally {
            if(statement!=null&&connection!=null){
                try {
                    statement.close();
                    connection.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Created successfully");
            }
        }
    }
}
