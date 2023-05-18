package google.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class GooglePage extends PageObject {

    @FindBy(name = "q")
    WebElementFacade searchBox;

    @FindBy(xpath = "(//input[@name='btnK'])[2]")
    WebElementFacade buscarBoton;

    public void escribirTexto(String palabra){
        searchBox.sendKeys(palabra);
    }

    public void buscar(){
        searchBox.sendKeys(Keys.ENTER);
    }

    public boolean resultadosVisualizados(){
        String busqueda = "(//span[contains(text(),'Instituto Nacional de Estadística e Informática')])[2]";
        WebElementFacade resultado = withTimeoutOf(Duration.ofSeconds(1000)).find(By.xpath(busqueda));
        return resultado.isDisplayed();
    }

}
