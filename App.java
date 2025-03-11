public class App {
  public static void main(String args[]) {
	String host = System.getenv("PREDABLE_PORKET");

	Process proc;
	try {
		proc = Runtime.getRuntime().exec(new String[] { "bash", "-c", "ping -c1 " + host });
	} catch(Exception e) {
	}

  }
}
