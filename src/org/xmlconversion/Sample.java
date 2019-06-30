package org.xmlconversion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\93ksr\\eclipse-workspace\\Bala\\Selenium\\driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement fname = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		fname.sendKeys(Conversion.toConvertToJavaProject().get(979).getFname());
		WebElement lname = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		lname.sendKeys(Conversion.toConvertToJavaProject().get(979).getLname());
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys(Conversion.toConvertToJavaProject().get(979).getAddress());
		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.sendKeys(Conversion.toConvertToJavaProject().get(979).getEmail());
		WebElement pass = driver.findElement(By.xpath("//input[@ng-model='Password']"));
		pass.sendKeys(Conversion.toConvertToJavaProject().get(979).getPassword());
		WebElement conpass = driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
		conpass.sendKeys(Conversion.toConvertToJavaProject().get(979).getConfirmPassword());
		driver.close();
		
	}
}
