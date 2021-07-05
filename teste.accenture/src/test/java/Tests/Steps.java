package Tests;

import java.io.IOException;

import Elementos.ElementosWeb;
import Page.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos metodo = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu acessar o site {string}")
	public void que_eu_acessar_o_site(String site) {
		metodo.abrirSite(site);
		metodo.clicar(el.getAuto());
	}

	@When("eu preencher os formularios")
	public void eu_preencher_os_formularios() {
		// Métodos da aba Enter Vehicle Data

		metodo.combo(el.getMarca(), "Honda");
		metodo.escrever("150", el.getPotenciaMotor());
		metodo.preencherData("04/23/2018", el.getDataDeFab());
		metodo.combo(el.getQuantassentos(), "4");
		metodo.combo(el.getTipCombustivel(), "Gas");
		metodo.escrever("80000", el.getValorTab());
		metodo.escrever("BTB1234", el.getPlaca());
		metodo.escrever("18000", el.getKmRodados());
		metodo.clicar(el.getNext1());

		// Métodos da aba Enter Insurant Data

		metodo.escrever("Nome", el.getNome());
		metodo.escrever("Teste", el.getSobreNome());
		metodo.preencherData("02/09/1962", el.getDataNasc());
		metodo.clicar(el.getGenero());
		metodo.escrever("Rua Pica Pau,2", el.getEndereco());
		metodo.combo(el.getNascionalidade(), "Brazil");
		metodo.escrever("12345678", el.getCodPost());
		metodo.escrever("Osasco", el.getCidade());
		metodo.combo(el.getProf(), "Public Official");
		metodo.checkBox(el.getHobbies());
		metodo.escrever("www.teste.com.br", el.getWebsite());
		metodo.clicar(el.getNext2());

		// Métodos da aba Enter Product Data

		metodo.preencherData("09/24/2021", el.getDataInicio());
		metodo.combo(el.getValorSeguro(), "25.000.000,00");
		metodo.combo(el.getClassMer(), "Super Bonus");
		metodo.combo(el.getSegDanos(), "Full Coverage");
		metodo.checkBox(el.getProdOpcional());
		metodo.combo(el.getCarCortesia(), "Yes");
		metodo.clicar(el.getNext3());

		// Métodos da aba Select Price Option

		metodo.clicar(el.getSeleOpcao());
		metodo.clicar(el.getNext4());

		// Métodos da aba Send Quote

		metodo.escrever("name@name.com", el.getEmail());
		metodo.escrever("11912873490", el.getTel());
		metodo.escrever("NomeTeste", el.getNomeUser());
		metodo.escrever("Aa1234", el.getSenha());
		metodo.escrever("Aa1234", el.getConfSenha());
		metodo.escrever("Sucesso", el.getComent());
		metodo.clicar(el.getSend());

	}

	@Then("validarei as informacoes")
	public void validarei_as_informacoes() throws IOException {
	
		// Validar as Informações
		metodo.screenShot("validação-teste");
		metodo.validarMensagem("Sending e-mail success!", el.getValidacao());
		metodo.clicar(el.getBotaoOk());
		metodo.fecharNavegador();

	}

}
