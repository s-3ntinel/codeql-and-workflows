package com.mycompany.app;

import java.util.Random;

public class Properties implements UncaughtExceptionHandler {
	public static final String NEWPASSWORD = "Prime@" + new Random().nextInt(1000);
}
