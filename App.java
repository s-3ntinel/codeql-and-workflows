public class App {
	public static void main(String args[]) {
		java.sql.Connection con = java.sql.DriverManager.getConnection(
			jdbc.toString(),
			mysql_user,
			mysql_password
		);

		//java.sql.Statement stmt = con.createStatement();
		//String query = "SELECT * FROM users WHERE username = '" + input_username + "' AND password = '" + input_password + "'";
		//stmt.execute(query);
	}
}
