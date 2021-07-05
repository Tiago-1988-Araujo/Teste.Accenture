package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		// Caminho das Features
		features = "./src/test/resources/bdd.feature",
		// caminho dos staps
		glue = "Tests",
		// tag para indicar qual teste deverÃ¡ ser executado
		tags = "@executa",
		// pretty deixa o console igual a execução cucumber
		plugin = { "pretty", "html:target/report.html" },
		// nÃ£o executar o teste, validar se foi incluso algum novo bdd,
		// FALSE
		dryRun = false, 
		
		monochrome = true

)

public class Executa {

}
