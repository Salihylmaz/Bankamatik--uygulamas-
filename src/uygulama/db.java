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
public class db {
    static Connection myConn;
	static Statement myState;
	static ResultSet myRs;
	static ResultSet yap() {
		try {
			myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/baglanti","root","145304");
			myState=myConn.createStatement();
			myRs = myState.executeQuery("SELECT * FROM employee");
			return myRs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myRs;
	}
	static void ekle(String sql_sorgu) throws SQLException {
		myState.executeUpdate(sql_sorgu);
	}
	static void update(String sql_sorgu) throws SQLException {
		myState.executeUpdate(sql_sorgu);
	}
	static ResultSet bul(String sql) throws SQLException {
		ResultSet myRs=null;
		myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/baglanti","root","145304");
		myState=myConn.createStatement();
		myRs = myState.executeQuery(sql);
		return myRs;
	}

}
