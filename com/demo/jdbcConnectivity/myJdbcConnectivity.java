package com.demo.jdbcConnectivity;
import java.sql.*;
public class myJdbcConnectivity {
    public static void main(String[] args) throws SQLException {

//        Select query from the table...
        String query= "select * from employeedetail";

//        Establish the connection
        Connection connection= DriverManager.getConnection
                               ("jdbc:mysql://localhost:3306/employee?user=root&password=root");

//        Prepare a statement and execute the query
        PreparedStatement prepareStatement = connection.prepareStatement(query);
        ResultSet resultSet = prepareStatement.executeQuery(query);

//        Get the table data
        while(resultSet.next()){
            System.out.println("empcode = "+resultSet.getInt(1)
                    +" , "+"empname = "+resultSet.getNString(2)
                    +" , "+"empage = "+resultSet.getInt(3)
                    +" , "+"esalary = "+resultSet.getInt(4));
        }
    }
}
