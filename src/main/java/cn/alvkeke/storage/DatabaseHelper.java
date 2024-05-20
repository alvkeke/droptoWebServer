package cn.alvkeke.storage;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DatabaseHelper {


    public static final String databaseFileName = "data.sqlite3";
    public static final String dbURL = "jdbc:sqlite:" + databaseFileName;

    public static void createDatabase() throws Exception{

        Connection conn = DriverManager.getConnection(dbURL);
        if (conn == null)
            return;
        DatabaseMetaData metaData = conn.getMetaData();
        System.out.println("The driver name is " + metaData.getDriverName());
        System.out.println("A new database has been created: " + metaData);
        conn.close();
    }

}
