import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Optional;

public class InicialJUnit {
    @Test
    public void OpenWeb(){
        Assertions.assertTrue(true);
        System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\pedro.candido\\Desktop\\PEDRO\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://walkdog.vercel.app/");
    }

    public void VerificarSubTitulo(){

        driver.findElement(By.xpath("//*[@id=\"page-home\"]/div[1]/main/a"));
    }
}
