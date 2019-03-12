package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenericDao {
    private final String USERNAME = "root";
    private final String PASS = "Giannis1986!@";
    private final String URL = "jdbc:mysql://localhost:3306/privateschool";
    private Connection conn;
    
    private Connection getConnection(){
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASS);
            System.out.println("Connection successfully established.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    
    private void closeConnection(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(GenericDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
