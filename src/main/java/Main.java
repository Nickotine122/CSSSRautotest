import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Main {
    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://csssr.github.io/qa-engineer/");

        driver.findElement(By.xpath("/html/body/div[1]/section[2]/section/div[2]/a")).click();

        driver.findElement(By.xpath("/html/body/div[1]/section[3]/div[2]/aside/ul/li[4]/label/a")).click();

        if(driver.getTitle().contains("ShareX"))
            System.out.println("Success");
        else
            System.out.println("Failure");

    }
}
