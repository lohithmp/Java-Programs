import java.sql.*;

/*
Vehicles factory Management
- Create the Data structure of Vehicles with following attributes
	1. Vehicle Number
	2. No of passengers
	3. No of wheels
- Add, delete, Modify vehicles attributes
- Extend the base class to create different type of vehicles
- Store the Vehicles information in DB
 */
public class VehicleFactory1 {
    public static void main(String[] args) {
        //Connection interface to connect to the database.
        Connection connection=null;
        //PreparedStatement interface is used to execute parameterized query.
        PreparedStatement preparedStatement=null;
        //url for connecting with postgresql database.
        String url="jdbc:postgresql://localhost:5432/VehicleFactory";
        //UserName for postgresql.
        String user="postgres";
        //password for postgresql.
        String password="1234";
        // Here Insert.Update,Delete the records into the database.
        String createTable="CREATE TABLE VehicleFactory(\n" +
                "   Vehicle Number INT PRIMARY KEY  NOT NULL,\n" +
                "   No of passengers           INT    NOT NULL,\n" +
                "   No of wheels            INT     NOT NULL,\n" +
                ");";
        String query1="INSERT INTO VehicleFactory (Vehicle Number,No of passengers, No of wheels) VALUES ( 1001,7,4);";
        String query2="INSERT INTO VehicleFactory (Vehicle Number,No of passengers, No of wheels) VALUES ( 1002,5,4);";
        String updQuery="UPDATE VehicleFactory SET No of wheels = 6 WHERE Vehicle Number = 1001;";
        String delQuery="DELETE FROM VehicleFactory WHERE Vehicle Number = 2; ";
        //Query for Inner join, get only matched records of Josh and  table.
        String[] qry= {createTable,query1,query2,updQuery,delQuery};
        try {
            /*
               DriverManager class will attempt to load the driver classes.
               getConnection() method is for connecting with database server from application.
             */
            connection= DriverManager.getConnection(url,user,password);
            /*
                Creates a PreparedStatement object for sending parameterized SQL statements to the database.
                preparedStatement.executeUpdate() method for execute DML queries.
             */
            System.out.println("connected");
            for (String array:qry) {
                preparedStatement=connection.prepareStatement(array);
                if(array==createTable){
                    preparedStatement.execute();
                    System.out.println("created table");
                }
                else{
                    preparedStatement.executeUpdate();
                    System.out.println("execute query");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            /*
                Closing the costly resources within the 'finally' block.
             */
            if(connection!=null&preparedStatement!=null){
                try {
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println(" Successfully");
    }
}
