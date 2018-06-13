package training.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {

    private final String URL = "jdbc:mysql://localhost:3306/mydbtest?autoReconnect=true&useSSL=false";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";
    private Connection connection;


    public DBWorker(){


        try {
            //Driver driver = new FabricMySQLDriver();
            //DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        }catch (SQLException e){

            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        return connection;
    }
}
