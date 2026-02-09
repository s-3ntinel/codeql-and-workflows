package com.mycompany.app;

public class App {
    public static void main(String[] args) {
		java.sql.Connection con = java.sql.DriverManager.getConnection(
			jdbc.toString(),
			mysql_user,
			mysql_password
		);

        String input_username = "username";
        String input_password = "password";

		//java.sql.Statement stmt = con.createStatement();
        //String query = "SELECT * FROM users WHERE username = '" + input_username + "' AND password = '" + input_password + "'";
		//stmt.execute(query);

        PreparedStatement myStmt; 
        myStmt = con.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");

        myStmt.setString(1, input_username);
        myStmt.setString(2, input_password); 

        ResultSet myRs = myStmt.executeQuery();
	}
}
