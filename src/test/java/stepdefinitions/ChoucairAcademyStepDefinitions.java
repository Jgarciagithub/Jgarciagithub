package stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy choucair$")
    public void thanBrandonWantstoLearnAutomationAttheAcademyChoucarir() {
        OnStage.theActorCalled( "Brandon");
    }

    @When("^he search for the course Recursos Automatizacion Bancolombia on the choucair academy plataform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombia(){
    }

    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(){
    }
}
