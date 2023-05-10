package com.test.util;

import com.test.target.Base;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Db2 extends Base {

    static Connection connection2=null;

    @Test
    public void executeTest() throws SQLException {
        connection2 = DriverManager.getConnection(readConfig.getdbURL(), readConfig.getdbUser(), readConfig.getdbpass());
        List<String> data2=Db2.getQuery("select * from Customers");
        for (int i=0; i<data2.size();i++){
           String field= data2.get(i);
           Log.info(field);
        }



    }



    public static List<String> getQuery(String query) throws SQLException {

        List<String> data= new ArrayList<String>();
        Statement statement = connection2.createStatement();
        //  ResultSet rs = statement.executeQuery(query);
        ResultSet rs= statement.executeQuery(query);
        while (rs.next()){
            data.add(rs.getString(2));
        }

        return data;

    }


}
