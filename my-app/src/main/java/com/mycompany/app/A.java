package com.mycompany.app;

import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;
import javax.servlet.http.HttpServletRequest;

public class A {
	public void HandleRequest(HttpServletRequest request) {
		String filename = request.getHeader("X-File-Name");

		try {
	        FileOutputStream fos = new FileOutputStream(new File(filename));
		} catch(Exception e) {}
    }
}
