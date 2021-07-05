package Page;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Metodos {
	WebDriver driver;

	public void abrirSite(String site) {
		System.setProperty("webdriver.chrome.driver", "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void preencherData(String mesDiaAno, By elemento) {
		driver.findElement(elemento).sendKeys(mesDiaAno);
	}

	public void fecharNavegador() {
		driver.quit();

	}

	public void checkBox(By elemento) {
		driver.findElement(elemento).click();

	}

	public void escrever(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void combo(By elemento, String opcao) {
		WebElement element = driver.findElement(elemento);
		Select combo = new Select(element);
		combo.selectByVisibleText(opcao);

	}

	public void validarMensagem(String texto, By elemento) {
		String txt = driver.findElement(elemento).getText();
		assertEquals(texto, txt);

	}
	public void screenShot(String nome) throws IOException {
		
		TakesScreenshot screenShot = ((TakesScreenshot)driver);
		File screenFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(screenFile, destFile);
		
		
		
	}

	public void espera() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
