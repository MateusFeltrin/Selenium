package bancojava;	

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	
	
	public class Inicializar {
		private WebDriver driver;
		private DSL dsl;
		private PageCampoTreinamento action;
	
	@Before
	public void Inicio() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\742648\\Documents\\ChromeDrive\\chromedriver.exe"); // Local do Chrome Driver
		driver = new ChromeDriver(); // Estaciamento do metodo WebDriver
		driver.manage().window().maximize(); // Deixar a Janela Maximizida
		driver.get("file:///C:/Users//742648//Desktop//campo-treinamento//componentes.html");
		dsl = new  DSL(driver);
		action = new PageCampoTreinamento(driver);
	}
	
	@After
	public void fim() {
		//driver.quit();
	}
	
	@Test
	public void InicioTreinamento() {
		//metodo Atual para escrever na campo.
		//dsl.escrever("elementosForm:nome", "Mateus");
		// metodo antigo para escrever no campo 
		//driver.findElement(By.id("elementosForm:nome")).sendKeys("Mateus");
		// Page Objectcs melhor forma de escrever o no campo.
		//##########################################Continuação ###################################################
		//dsl.escrever("elementosForm:sobrenome", "Tavares Feltrin");
		//driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Tavares Feltrin");
		//driver.findElement(By.id("elementosForm:sexo:0")).click();
		//dsl.clicarsexo("elementosForm:sexo:0");
		// Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
		//driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
		// WebElement Element  = driver.findElement(By.id("elementosForm:escolaridade"));
		 //Select combo = new Select(Element);
		 //combo.selectByIndex(4);
		
		
		action.SetNome("Mateus");
		action.SetSobrenome("Tavares Feltrin");
		action.SetSexoMasculino();
		action.SetcomidaCarne();
		action.SetEscolaridadeMestre();
		action.SetesporteNatacao();
		action.SetSugestoes("Aceite Jesus! \nAmor verdadeiro");
		
		Assert.assertEquals("Tavares Feltrin", dsl.obtervalorcampo("elementosForm:sobrenome"));
		Assert.assertEquals("Mateus", dsl.obtervalorcampo("elementosForm:nome"));
		Assert.assertTrue(dsl.validarsexo("elementosForm:sexo:0"));
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
			 
		 driver.findElement(By.id("alert")).click();
		 Alert alerta = driver.switchTo().alert();
		 alerta.accept();
		 
		 driver.findElement(By.id("confirm")).click();
		 Alert alertaconfirma = driver.switchTo().alert();
		 alertaconfirma.accept();
		 alertaconfirma.accept();
		 
		 action.Botao_cadastrar();
		 System.out.println(driver.findElement(By.id("resultado")).getText());
		 
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("frameButton")).click();
		Alert alertaframe = driver.switchTo().alert();
		alertaframe.accept();
		driver.switchTo().defaultContent();
		
		 action.Botao_PopUp();
		 driver.switchTo().window("Popup");
		 driver.close();
		 driver.switchTo().window("");
		 
		
		 
				
}
	@Test
	public void TestVegetariano(){
	action.SetNome("Carnivoro");
	action.SetSobrenome("Futebol");
	action.SetSexoFeminino();
	action.SetcomidaCarne();
	action.SetcomidaVegetariano();
	action.Botao_cadastrar();
	//## Switch para o alerta #############
	Alert alertaconfirma = driver.switchTo().alert();
	alertaconfirma.accept();
	// Fim do switch 
	action.SetcomidaVegetariano();
	action.SetSugestoes("Jesus");
	action.SetEscolaridadeSuperior();
	action.SetesporteFutebol();
	action.Botao_cadastrar();	
	
		
	}
	
	
	
	
	}
