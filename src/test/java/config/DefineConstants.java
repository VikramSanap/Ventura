package config;

public class DefineConstants {
	// Test data file Path
	public static final String Path_TestData = "";
	

	public static final String PROJECT_PATH = System.getProperty("user.dir");

	public static final String PROJECT_OS = System.getProperty("os.name");
	
	public static final String browser = "chrome";

	public static final String TestData_Folder = "Test_Data";
	public static final String Ventura_TestData_Folder = "Ventura";


	public static final String FirefoxDriver = "C:\\Users\\User\\eclipse-workspace\\JMFL\\Browser\\geckodriver.exe";
	public static final String ChromeDriver = "C:\\Users\\User\\eclipse-workspace\\JMFL\\Browser\\chromedriver.exe";
	public static final String IEDriver = "C:\\Users\\User\\eclipse-workspace\\JMFL\\Browser\\IEDriverServer.exe";



	public static final String Search_Item_Step = TestData_Folder + "//" + Ventura_TestData_Folder + "//"+ "Search_Item.json";
	
}