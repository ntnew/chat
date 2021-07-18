package repository;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {

//STEP 1. Import required packages


    //  Database credentials
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/vertex"
    static final String USER = "username";
    static final String PASS = "password";

    private static Db self;

    public static Db getInstance() {
        return self == null ? new Db() : self;
    }

    private Db() {
    }

    private void create() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaDB", "postgres", "saw123");
        Statement stmt = connection.createStatement();
        //stmt.execute();
    }


}
