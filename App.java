class App {
    public static void main(String[] args) {
        // BAD: user input might include special characters such as ampersands
		M m = new M();
		m.met(args[1]);
}
}
