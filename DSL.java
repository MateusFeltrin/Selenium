package bancojava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
	private WebDriver driver;
	
	public DSL(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void escrever(String id_campo, String dados){
		driver.findElement(By.id(id_campo)).sendKeys(dados);
	}
	
	public String obtervalorcampo(String id_campo) {
		
		
		 return driver.findElement(By.id(id_campo)).getAttribute("value");
	}
	
	public void clicarsexo(String sexo) {
		driver.findElement(By.id(sexo)).click();
	}
	
	public boolean validarsexo(String sexo) {
		
		return driver.findElement(By.id(sexo)).isSelected();
	}
	
	public void clicarcomida(String comida) {
		driver.findElement(By.id (comida)).click();
	}
	
	public void comboescolaridade(int escolaridade) {
		WebElement Element  = driver.findElement(By.id("elementosForm:escolaridade"));
		 Select combo = new Select(Element);
		 combo.selectByIndex(escolaridade);
	}
	
	public void comboesesporte(String esporte) {
		WebElement Esporteweb = driver.findElement(By.id("elementosForm:esportes"));
		 Select comboesporte = new Select(Esporteweb);
		 comboesporte.selectByVisibleText(esporte);
	}
	
	public void sugestoes( String Sugestoes) {
		 driver.findElement(By.id("elementosForm:sugestoes")).sendKeys(Sugestoes);
	}
	
	public void Botao(String Botao ) {
		driver.findElement(By.id(Botao)).click();
	}
	
	
}
