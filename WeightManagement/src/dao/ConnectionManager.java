package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String USER = "postgres";
    private final static String PASSWORD = "renshu";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
    	Class.forName("org.postgresql.Driver");
    	return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
