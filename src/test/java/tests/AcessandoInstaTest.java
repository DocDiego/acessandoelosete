package tests;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcessandoInstaTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.elo7.com.br/");
		WebElement pesquisa = driver.findElement(By.id("search-query"));
		pesquisa.sendKeys("caneca de chopp");
		WebElement button1 = driver.findElement(By.className("btn-search"));
		button1.click();
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.id("login-link"));
		login.click();
		Thread.sleep(3000);
		WebElement log = driver.findElement(By.className("input-lg"));
		log.sendKeys("diegodocdesigner@gmail.com");
		WebElement senha = driver.findElement(By.name("password"));
		senha.sendKeys("d0cd3signer77");
		WebElement clicks = driver.findElement(By.name("password"));
		clicks.sendKeys(Keys.ENTER);
		Thread.sleep(5000)	;
		
	}

}
