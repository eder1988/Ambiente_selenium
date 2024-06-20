import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfter {

    private WebDriver navegador;

    @BeforeTest
    public void setUp (){
        navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/login");
    }

    @Test
    public void chromeTest(){
     //   WebDriver navegador = new ChromeDriver();
     //   navegador.get("https://automationexercise.com/login");

        //para abrir o codigo do navegador
        //dentro do navegador botao direito e inspecionar 
        //aperta os 3 pontinhos para colocar a inspeção para baixo
        //Criar formulario
        WebElement loginParaCriarUsuario = navegador.findElement(By.className("signup-form"));
        // preenchr campo name
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("Curso");

       // navegador.findElement(By.name("name")).sendKeys("Curso");

        // preencher campo email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("eder@kkk.com");
        //navegador.findElement(By.name("email")).sendKeys("eder.araujo@hotmail.com");

        //clicar no botao singup
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

        //navegador.quit();
    }

    @AfterTest
    public void tearDown(){
        navegador.quit();
    }
}
