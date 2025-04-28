package com.mycompany.app;

public class App {
	public static void main(String[] args) {
		asdf();
	}

	public static void asdf() {
		java.sql.Connection con = java.sql.DriverManager.getConnection(
			jdbc.toString(),
			mysql_user,
			mysql_password
		);

		java.sql.Statement stmt = con.createStatement();
		stmt.execute(Properties.query) throws Something;
	}
}
