
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assumptions.*;



public class SeleniumTests {
    WebDriver driver;


    /*@Test
    public void checkLogo() {

        System.out.println("Testing logo:");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://distedu.ukma.edu.ua/login/forgot_password.php");
        driver.get("https://distedu.ukma.edu.ua/login/index.php");
        boolean element_present=false;
        try
        {
            driver.findElement(By.className("rui-loginpage-intro-logo  "));
            element_present=true;
        }catch (NoSuchElementException e)
        {
            element_present=false;
        }
        if(!element_present) driver.quit();
        Assumptions.assumeTrue(element_present);
        Assertions.assertTrue(driver.findElement(By.className("rui-loginpage-intro-logo  ")).isDisplayed());
        System.out.println("    Logo in login box is displayed");
        driver.quit();
    }

    @Test
    public void checkButton() {
        System.out.println("Testing login button:");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://distedu.ukma.edu.ua/login/index.php");
        boolean btn_found = false;
        try {
            driver.findElement(By.id("loginbtn"));
            btn_found = true;
            System.out.println("    Button not found");
        } catch (NoSuchElementException e) {
            btn_found = false;
        }
        if (!btn_found)
            driver.quit();
        Assumptions.assumeTrue(btn_found);
        System.out.println("    Button found");
        driver.findElement(By.id("loginbtn")).click();
        System.out.println("    Button clicked");
        boolean find_alert = false;
        try {
            driver.findElement(By.id("loginerrormessage"));
            find_alert = true;
        } catch (NoSuchElementException e)
        {
            find_alert=false;
            System.out.println("    Alert for incorrect login not found");
        }
        Assertions.assertTrue(find_alert);
        System.out.println("    Alert for incorrect login found");
        driver.quit();
    }

    @Test
    public void checkSupportURL()
    {
        System.out.println("    Testing support url:");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://distedu.ukma.edu.ua/login/index.php");
        assumeThatCode(()->driver.findElement(By.linkText("Служба підтримки"))).doesNotThrowAnyException();
        System.out.println("    Support url found");
        driver.findElement(By.linkText("Служба підтримки")).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        assumeThat(tabs.size()).isEqualTo(2);
        driver.switchTo().window(tabs.get(1));
        assertThat(driver.getCurrentUrl()).startsWith("https://").contains("support").contains("ukma.edu.ua");
        driver.quit();

    }*/
}
