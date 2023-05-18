package google.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import google.pages.GooglePage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class googleSteps {

    @Steps(shared = true)
    GooglePage googlePage;

    @Given("^el usuario ingresa a google$")
    public void userNavigatesTo(){
        googlePage.setDefaultBaseUrl("https://www.google.com/");
        googlePage.open();
        Serenity.takeScreenshot();
    }

    @When("^escribe la palabra (.*)$")
    public void userTypesWord(String palabra){
        googlePage.escribirTexto(palabra);
        Serenity.takeScreenshot();
    }

    @And("^da click en el boton buscar$")
    public void userClickButton(){
        googlePage.buscar();
        Serenity.takeScreenshot();
    }

    @Then("^google mostrara una serie de resultados$")
    public void googleShowsResults(){
        Assert.assertTrue(googlePage.resultadosVisualizados());
        Serenity.takeScreenshot();
    }

}
