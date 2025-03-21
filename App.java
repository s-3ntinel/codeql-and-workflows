import java.io.*;

public class App {
public static String get() {
	return "string";
}

public static void met(String cmd) {

Runtime rt = Runtime.getRuntime();                                                                                                                                                                    
try {                                                                                                                                                                                                            
             Process exec = rt.exec("cmd.exe /C atlon2utm.exe " + get());                                                                                                                                  
 } catch (IOException e) {                                                                                                                                                                                         
 }                                                                                                                                                                                                                 
         }             

public static void main(String args[]) {
  met("asdf");
}
}
