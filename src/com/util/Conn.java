package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by WWWW on 2017/5/28.
 */
public class Conn {
	public static final String DBDriver="com.mysql.jdbc.Driver";
	public static final String url="jdbc:mysql://localhost:3306/kd?useUnicode=true&characterEncoding=UTF-8";
	public static final String username="root";
	public static final String password="123456";

	public static Connection getConn() throws SQLException, ClassNotFoundException{
		Class.forName(DBDriver);
		Connection conn = DriverManager.getConnection(url,username,password);
		if(conn!=null){
			System.out.println("连接成功！！");
		}
		return conn;
	}
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		Connection conn = Conn.getConn();
	}
}
