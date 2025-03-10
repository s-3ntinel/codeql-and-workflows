public class App {
  public static void main(String args[]) {

int random_int = 1;
String aristotelian_feaberry = System	.getenv("PREDABLE_PORKET");

java.sql.Connection con = java.sql.DriverManager.getConnection(jdbc.toString(),	stonesoup_mysql_user, stonesoup_mysql_pass);
java.sql.Statement stmt = con.createStatement();

String queryString = "INSERT INTO Shippers (ShipperID, CompanyName)"
											+ " VALUES (\'"
											+ random_int
											+ "\', \'"
											+ aristotelian_feaberry
											+ "\');";
stmt.execute(queryString);
con.close();
  }
}
