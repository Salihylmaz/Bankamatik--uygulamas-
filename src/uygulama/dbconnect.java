/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uygulama;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author yilma
 */
public class dbconnect {
    
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                // MySQL veritabanı bağlantı bilgileri
                String url = "jdbc:mysql://localhost:3306/baglanti";
                String user = "root";
                String password = "145304";

                // JDBC sürücüsünü yükle
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Veritabanına bağlan
                connection = DriverManager.getConnection(url, user, password);

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
    
}
