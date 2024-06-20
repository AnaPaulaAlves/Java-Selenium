package tests;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;


public class OpenSiteTest {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro.candido\\Desktop\\PEDRO\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://marcelodebittencourt.com/demopages/demosimplesearch/");

        // VERIFICANDO O TITULO DA PÁGINA
        assertTrue("Title of pag different than expected", driver.getTitle().contentEquals("Demo Simple Search using JavaScript"));
        Thread.sleep(3000);
    }
}
