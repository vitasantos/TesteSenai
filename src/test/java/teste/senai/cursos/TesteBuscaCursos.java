package teste.senai.cursos;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteBuscaCursos {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(); //abre o navegador
		driver.manage().window().maximize();
	}
	
	@Test
	public void testeNavegacao() {
		driver.get("https://informatica.sp.senai.br/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("oqEstabuscando")).sendKeys("gest�o"); 
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("gest�o");
		//driver.findElement(By.className("btnBuscaJavaScript")).click();
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}
}
