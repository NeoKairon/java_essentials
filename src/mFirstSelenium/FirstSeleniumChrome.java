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

        //Al string expectedTitle se le asigna el titulo a buscar
        String expectedTitle = "Google";
        //Navega hacia la página que Google
        driver.get("http://google.com");
        //Se trae el título del sitio y se asigna a la variable de ActualTitle
        String actualTitle = driver.getTitle();
        //Se compara si expected es igual a actual para pasar o fallar el caso de prueba
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        //Siempre hay que terminar el driver que se esta usando (matarlo)
        driver.close();
        //Cierra el navegador
        driver.quit();
    }

	
	}


