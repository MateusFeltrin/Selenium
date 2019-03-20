package bancojava;


import org.openqa.selenium.WebDriver;


public class PageCampoTreinamento {
private DSL dsl;

 public PageCampoTreinamento(WebDriver driver) {
	// TODO Auto-generated constructor stub
	dsl  = new DSL (driver);
 }

	public void SetNome(String nome) {
		dsl.escrever("elementosForm:nome", nome);
		
	}
	
	public void SetSobrenome ( String Sobrenome) {
		dsl.escrever("elementosForm:sobrenome", Sobrenome);
	}

	
	public void SetSexoMasculino() {
		dsl.clicarsexo("elementosForm:sexo:0");
	}
	
	public void SetSexoFeminino() {
		dsl.clicarsexo("elementosForm:sexo:1");
	}
	
	public void SetcomidaCarne() {
		dsl.clicarcomida("elementosForm:comidaFavorita:0");
	}
	
	public void Setcomidafrango() {
		dsl.clicarcomida("elementosForm:comidaFavorita:1");
	}
	
	public void SetcomidaPizza() {
		dsl.clicarcomida("elementosForm:comidaFavorita:2");
	}
	
	public void SetcomidaVegetariano() {
		dsl.clicarcomida("elementosForm:comidaFavorita:3");
	}
	
	public void SetEscolaridadeSuperior() {
		dsl.comboescolaridade(4);
	}
	
	public void SetEscolaridadePrimeiroImcompleto() {
		dsl.comboescolaridade(0);
	}
	
		
	public void SetEscolaridadeSegundoImcompleto() {
		dsl.comboescolaridade(2);
	}
	
	public void SetEscolaridadePrimeiroCompleto() {
		dsl.comboescolaridade(1);
	}
	
	public void SetEscolaridadeSegundocompleto() {
		dsl.comboescolaridade(3);
	}
	
	public void SetEscolaridadeEspecialização() {
		dsl.comboescolaridade(5);
	}
	
	public void SetEscolaridadeMestre() {
		dsl.comboescolaridade(6);
	}
	public void SetEscolaridadeDoutor() {
		dsl.comboescolaridade(7);
	}
	
	public void SetesporteNatacao() {
		dsl.comboesesporte("Natacao");
	}
	
	public void SetesporteFutebol() {
		dsl.comboesesporte("Futebol");
	}
	
	public void SetSugestoes(String Dados) {
		dsl.sugestoes(Dados);
	}
	
	public void Botao_cadastrar() {
		dsl.Botao("elementosForm:cadastrar");
	}
	
	public void Botao_PopUp() {
		dsl.Botao("buttonPopUpEasy");
	}
	
	
}