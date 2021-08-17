package runners;

import cucumber.api.SnippetType;
//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/academyChoucair.feature",//demo.feature",
                 tags="@Regresion",
                  glue="co.com.choucair.certification.proyectobase.stepdefinitions",
                    snippets= SnippetType.CAMELCASE)

public class RunnerTags {
}
