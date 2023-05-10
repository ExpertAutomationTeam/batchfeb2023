package com.test.util;

import com.test.target.Base;
import org.testng.annotations.Test;

import java.sql.*;

public class Db extends Base {

    @Test
    public void dbConnection() throws SQLException {

        Connection connection = DriverManager.getConnection(readConfig.getdbURL(), readConfig.getdbUser(), readConfig.getdbpass());
        Statement statement = connection.createStatement();
        String query="select * from Customers";
      //  ResultSet rs = statement.executeQuery(query);
        ResultSet rs= statement.executeQuery(query);
        while (rs.next()){

            Log.info(rs.getString("CustomerName"));
            Log.info(rs.getString(3));
        }

    }
}
