import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cadastro {

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
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("vegeta");

       // navegador.findElement(By.name("name")).sendKeys("Curso");

        // preencher campo email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("vegeta@capsulecorporation.com");
        //navegador.findElement(By.name("email")).sendKeys("eder.araujo@hotmail.com");

        //clicar no botao singup
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

        WebElement cadastro = navegador.findElement((By.id("form")));

        //title Mr(x) Mrs()
        cadastro.findElement(By.id("id_gender2")).click();
        //Password senha
        cadastro.findElement(By.id("password")).sendKeys("12345");
        //data nascimento
        cadastro.findElement(By.id("days")).sendKeys("19");
        cadastro.findElement(By.id("months")).sendKeys("January");
        cadastro.findElement(By.id("years")).sendKeys("1989");
        //caixas de marcar
        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[6]/label")).click();
        //primeiro nome
        cadastro.findElement(By.id("first_name")).sendKeys("Vegeta");
        cadastro.findElement(By.id("last_name")).sendKeys("sayajin");
        //empresa
        cadastro.findElement(By.id("company")).sendKeys("Capsule Corporation");
// endereço 1 e 2
cadastro.findElement(By.id("address1")).sendKeys("Ilha do mestre kami, 01");
cadastro.findElement(By.id("address2")).sendKeys("Freeza destruiu");
//país
cadastro.findElement(By.id("country")).sendKeys("India");
cadastro.findElement(By.id("state")).sendKeys("Templo Kamisama");
cadastro.findElement(By.id("city")).sendKeys("Cidade da Bulma");
cadastro.findElement(By.id("zipcode")).sendKeys("1234567");
cadastro.findElement(By.id("mobile_number")).sendKeys("998854472");
cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();


        //navegador.quit();
    }

    //@AfterTest
    //public void tearDown(){
      //  navegador.quit();
    //}
}

