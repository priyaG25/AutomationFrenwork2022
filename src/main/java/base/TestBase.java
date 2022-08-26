package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static  WebDriver driver;
public static Properties prop;

public void init() {
	prop=new Properties();
	try {
		FileInputStream file=new FileInputStream("C:\\Users\\Priya\\eclipse-workspace2\\AutomationFrenwork2022\\src\\main\\java\\config\\configuration.properties");
	prop.load(file);
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("configuration file is missing");
	}
	
	//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	String browzer=prop.getProperty("browzer");
	if(browzer.contains("chrome")) {
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	}
	else if(browzer.contains("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else if(browzer.contains("edge")) {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
	}
    driver.manage().window().maximize();
    driver.get(prop.getProperty("url"));
}
}
