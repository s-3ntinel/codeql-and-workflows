public class App {
        public static String killDriver(DriverType driverType) {                                                                                      
                String driverPath = null;                                                                                                           
                switch (driverType) {                                                                                                                                                                                                                                                                    
                case FIREFOX:                                                                                                                       
                        driverPath = DataManager.getFirefoxDriverPath();                                                                            
                        break;                                                                                                                      
                case CHROME:                                                                                                                        
                        driverPath = DataManager.getChromeDriverPath();                                                                             
                        break;                                                                                                                      
                case ELECTRON:                                                                                                                      
                        driverPath = DataManager.getElectronDriverPath();                                                                           
                        break;                                                                                                                      
                case IE:                                                                                                                            
                        driverPath = DataManager.getIeDriverPath();
                        break;
                case EDGE:
                        driverPath = DataManager.getEdgeDriverPath();
                        break;
                case HEADLESS:
                        driverPath = DataManager.getChromeDriverPath();
                        break;
                default:
                        log.Error("No driver found for the given driver type:" + driverType);
                        break;
                }
                String[] driverPathSplit = driverPath.split("/");
                String driverExe = driverPathSplit[driverPathSplit.length - 1];
                String command = "taskkill /F /IM " + driverExe;

try {
                        Runtime.getRuntime().exec(command);
                } catch (IOException e) {
                }
        }
}
