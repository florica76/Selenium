package curs1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void testSelenium(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.ro");
    }

}
