package mFirstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxProfile;

public class FirstSeleniumChrome {

    public static void main(String[] args) {
//    	System.setProperty("webdriver.gecko.driver", "C:\test_automation\drivers\geckodriver.exe");

    	String chromeProfile = "/Users/jnavarro/Library/Application Support/Google/Chrome/automationGuy";
    	ChromeOptions opts = new ChromeOptions();
    	//Desactiva las notificaciones del navegador
    	opts.addArguments("--disable-notifications");
    	//Abre el navegador maximizado
    	opts.addArguments("--start-maximized");
    	//Inicializa el driver y se abre el navegador
        WebDriver driver = new ChromeDriver(opts);


        String expectedTitle = "Welcome: Mercury Tours";
        driver.get("http://google.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
        driver.quit();
    }

	private static FirefoxProfile getProfile(String profileName) {
		return new ProfilesIni().getProfile(profileName);
	}
}

