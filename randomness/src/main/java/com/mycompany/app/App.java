package com.mycompany.app;

import com.mycompany.app.Properties;

public class App {
    public static void main(String[] args) {
		java.sql.Connection con = java.sql.DriverManager.getConnection(                                                                                                                                                                                                                                                                   
			jdbc.toString()
			mysql_user
			mysql_password
		);

		java.sql.Statement stmt = con.createStatement();
		stmt.execute(Properties.query);
    }
}
