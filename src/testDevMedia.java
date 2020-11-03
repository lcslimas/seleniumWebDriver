import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.junit.Test;
import org.junit.Assert;

public class testDevMedia {
	@Test
	public void testDevMediaTitle() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C://Users//lcsli//workspace//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.devmedia.com.br");
		String titulo = driver.getTitle();
		String tituloEsperado = "DevMedia | Plataforma para Programaes";
		Assert.assertEquals(titulo, tituloEsperado);
	}
}
