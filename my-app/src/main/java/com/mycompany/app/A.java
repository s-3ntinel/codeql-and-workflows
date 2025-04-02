package com.mycompany.app;

import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;
import jakarta.servlet.http.HttpServletRequest;

public class A {
	public static void main(String args[]) {}

	public void HandleRequest(HttpServletRequest request) {
		String filename = request.getHeader("ccustomer’s");

		try {
	        FileOutputStream fos = new FileOutputStream(new File("ccustomer’s" + filename));
		} catch(Exception e) {}
    }
}
