
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class exercicio {
   
    @Test
    public void chromeTest(){
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://the-internet.herokuapp.com/login ");

        navegador.findElement(By.id("username")).sendKeys("tomsmith");
        navegador.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        navegador.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click();

        assertTrue(navegador.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));

        
        navegador.quit();
    }

}
