package Week3.Day2;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.ajio.com/");
				// type as "bags" and press enter
				driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//label[@for='Men']")).click();
				
				//Under "Category" click "Fashion Bags"
				driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
				Thread.sleep(2000);
				// Print the items Found.
				String totalItems = driver.findElement(By.className("length")).getText();
				System.out.println("Total number of items : " + totalItems);
		        //Get the list of brand of the products
				System.out.println(" List of Brands");
				List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
				System.out.println(" Size :" + bagBrandList.size());

				for (WebElement webElement : bagBrandList) {
					String text = webElement.getText();
					System.out.println(text);
				}
				//list of names of the bags and print it
				List<WebElement> bagNameList = driver.findElements(By.className("name"));
				System.out.println(" Size :" + bagNameList.size());
				System.out.println(" Names of the Bags");
				for (WebElement webElement : bagNameList) {
					String text = webElement.getText();
					System.out.println(text);
				}
				
				

			}

		}



