package JAVA_Selenium;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.opencsv.CSVWriter;

public class DataCollection {

		public static void main(String[] args) throws InterruptedException, IOException {
			String name = "webdriver.gecko.driver";
			String path = "C:/Users/kyungmyung/Downloads/geckodriver_2.exe";
			
			System.setProperty(name,path);
			
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("http://www.google.com");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Business");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
			try {
			 driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/div/div/div[1]/div/div/div[1]/div/div/div[1]/a[3]")).click();	
			 Thread.sleep(5000);
			} catch(Exception e) {
			  System.out.println("Click Error");
			}
			
			
			String title;
			String source;
			
			File file = new File("C:/Users/kyungmyung/Desktop/test.csv");
			FileWriter output = new FileWriter(file);
			CSVWriter writer = new CSVWriter(output);
			
			
			for(int k=3; k<=11; k++) {
				// k=4
			for(int i=1; i<=9; i++) {
				try {
				title = driver.findElement(By.xpath("/html/body/div[5]/div/div[11]/div/div[2]/div[2]/div/div/div/div/div["+Integer.toString(i)+"]/div/div/a/div/div[2]/div[2]")).getText();
				String[] result = {title};
				writer.writeNext(result);
				
				} catch(Exception e) {
					System.out.println("No title");
				}
				
		
				
			}
			try {
			driver.findElement(By.xpath("/html/body/div[5]/div/div[11]/div/div[4]/div/div[3]/table/tbody/tr/td["+Integer.toString(k)+"]/a")).click();
			Thread.sleep(5000);
			
			} catch(Exception e) {
				System.out.println("Page Click Error");
			}
			
			}
			
			
			writer.close();
			
			
			///html/body/div[5]/div/div[11]/div/div[4]/div/div[3]/table/tbody/tr/td[3]/a
			///html/body/div[5]/div/div[11]/div/div[4]/div/div[3]/table/tbody/tr/td[11]/a
		

		}

	}


