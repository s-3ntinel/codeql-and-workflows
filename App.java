import java.io.*;

public class App {
public void met(String cmd) {

Runtime rt = Runtime.getRuntime();                                                                                                                                                                    
try {                                                                                                                                                                                                            
ASD asdf = new ASD();
             Process exec = rt.exec("cmd.exe /C latlon2utm.exe " + cmd);                                                                                                                                  
 } catch (IOException e) {                                                                                                                                                                                         
 }                                                                                                                                                                                                                 
         }             
}
