package Elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	//***************************Elementos aba Enter Vehicle Data*******************************//

	private By auto = By.id("nav_automobile");
	private By marca = By.id("make");
	private By potenciaMotor = By.id("engineperformance");
	private By dataDeFab = By.id("dateofmanufacture");
	private By quantassentos = By.id("numberofseats");
	private By tipCombustivel = By.id("fuel");
	private By valorTab = By.id("listprice");
	private By placa = By.id("licenseplatenumber");
	private By kmRodados = By.id("annualmileage");	
	private By next1 = By.id("nextenterinsurantdata");
	
	// ***************************Elementos aba Enter Insurant Data*****************************//

	private By nome = By.id("firstname");
	private By sobreNome = By.id("lastname");
	private By dataNasc = By.id("birthdate");
	private By genero = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	private By endereco = By.id("streetaddress");
	private By nascionalidade = By.id("country");
	private By codPost = By.id("zipcode");
	private By cidade = By.id("city");
	private By prof = By.id("occupation");
	private By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
	private By website = By.id("website");
	private By next2 = By.id("nextenterproductdata");
	
	//*************************** Elementos aba Enter Product Data********************************//

	private By dataInicio = By.id("startdate");
	private By valorSeguro = By.id("insurancesum");
	private By classMer = By.id("meritrating");
	private By segDanos = By.id("damageinsurance");
	private By prodOpcional = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	private By carCortesia = By.id("courtesycar");
	private By next3 = By.id("nextselectpriceoption");
	private By seleOpcao = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
	private By next4 = By.id("nextsendquote");
	
	// ****************************Elementos aba Select Price Option*********************************//

	private By email = By.id("email");
	private By tel = By.id("phone");
	private By nomeUser = By.id("username");
	private By senha = By.id("password");
	private By confSenha = By.id("confirmpassword");
	private By coment = By.id("Comments");
	private By send = By.id("sendemail");
	
	//****************************** Elementos para Validação****************************************//
	
	private By validacao = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
	private By botaoOk = By.xpath("/html/body/div[4]/div[7]/div/button");
	
	
	// *******************************Métodos Públicos dos Elementos********************************//
	public By getEmail() {
		return email;
	}

	public By getNomeUser() {
		return nomeUser;
	}

	public By getSenha() {
		return senha;
	}

	public By getConfSenha() {
		return confSenha;
	}

	public By getComent() {
		return coment;
	}

	public By getSend() {
		return send;
	}

	public By getSeleOpcao() {
		return seleOpcao;
	}

	public By getNext4() {
		return next4;
	}

	public By getDataInicio() {
		return dataInicio;
	}

	public By getValorSeguro() {
		return valorSeguro;
	}

	public By getClassMer() {
		return classMer;
	}

	public By getSegDanos() {
		return segDanos;
	}

	public By getProdOpcional() {
		return prodOpcional;
	}

	public By getCarCortesia() {
		return carCortesia;
	}

	public By getNext3() {
		return next3;
	}

	public By getAuto() {
		return auto;
	}

	public By getMarca() {
		return marca;
	}

	public By getPotenciaMotor() {
		return potenciaMotor;
	}

	public By getDataDeFab() {
		return dataDeFab;
	}

	public By getQuantassentos() {
		return quantassentos;
	}

	public By getTipCombustivel() {
		return tipCombustivel;
	}

	public By getValorTab() {
		return valorTab;
	}

	public By getPlaca() {
		return placa;
	}

	public By getKmRodados() {
		return kmRodados;
	}

	public By getNext1() {
		return next1;
	}

	public By getNome() {
		return nome;
	}

	public By getSobreNome() {
		return sobreNome;
	}

	public By getDataNasc() {
		return dataNasc;
	}

	public By getGenero() {
		return genero;
	}

	public By getEndereco() {
		return endereco;
	}

	public By getCodPost() {
		return codPost;
	}

	public By getCidade() {
		return cidade;
	}

	public By getProf() {
		return prof;
	}

	public By getHobbies() {
		return hobbies;
	}

	public By getWebsite() {
		return website;
	}

	public By getNext2() {
		return next2;
	}

	public By getNascionalidade() {
		return nascionalidade;
	}

	public By getTel() {
		return tel;
	}

	public By getValidacao() {
		return validacao;
	}

	public By getBotaoOk() {
		return botaoOk;
	}

}
