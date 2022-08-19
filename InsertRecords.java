package com.jdbc.crud;
import java.sql.*;
/*
Using class "InsertRecords " to insert, update, delete, read records from database
Inner joins used for read records from database.
 */
public class InsertRecords {
    public static void main(String[] args) {
        //Connection interface to connect to the database.
        Connection connection=null;
        //PreparedStatement interface is used to execute parameterized query.
        PreparedStatement preparedStatement=null;
        //ResultSet interface is used to retrieve the records from database.
        ResultSet resultSet=null;
        //url for connecting with postgresql database.
        String url="jdbc:postgresql://localhost:5432/Josh";
        //UserName for postgresql.
        String user="postgres";
        //password for postgresql.
        String password="1234";
        // Here Insert.Update,Delete the records into the database.
        String query="INSERT INTO josh (ID,NAME,AGE,ADDRESS,SALARY) VALUES (8, 'Shubra', 23, 'WB', 5000.00);";
        String query1="UPDATE josh SET SALARY = 50000 WHERE ID = 7;";
        String query2="DELETE FROM josh WHERE ID = 3; ";
        //Query for Inner join, get only matched records of Josh and JavaFresher table.
        String query3="SELECT ID, NAME, SALARY FROM  josh INNER JOIN JavaFresher ON JavaFresher.USERID=josh.ID;";
        String[] qry= {query,query1,query2,query3};
        try {
            /*
               DriverManager class will attempt to load the driver classes.
               getConnection() method is for connecting with database server from application.
             */
            connection= DriverManager.getConnection(url,user,password);
            /*
                Creates a PreparedStatement object for sending parameterized SQL statements to the database.
                preparedStatement.executeUpdate() method for execute DML queries.
                preparedStatement.executeQuery() method for execute DQL queries.
             */
            for (String array:qry) {
                preparedStatement=connection.prepareStatement(array);

                if(array==query3){
                    resultSet=preparedStatement.executeQuery();
                }
                else {
                    preparedStatement.execute();
                }
            }
            /*
                Displaying the required records using resultSet interface reference.
             */
            while (resultSet.next())
            {
                String name=resultSet.getString("name");
                int id=resultSet.getInt("id");
                int salary=resultSet.getInt("salary");
                System.out.println("Welcome "+name+"\n"+" Employee ID: "+id+"\n"+" Employee Name: "+name+"\n"+" Employee salary: "+salary+"\n");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            /*
                Closing the costly resources within the 'finally' block.
             */
            if(connection!=null&preparedStatement!=null&resultSet!=null){
                try {
                    connection.close();
                    preparedStatement.close();
                    resultSet.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println(" Successfully");
    }
}
/*OUTPUT:
Welcome Karthik
 Employee ID: 2
 Employee Name: Karthik
 Employee salary: 982

Welcome Girish
 Employee ID: 4
 Employee Name: Girish
 Employee salary: 5000

 Successfully

 */