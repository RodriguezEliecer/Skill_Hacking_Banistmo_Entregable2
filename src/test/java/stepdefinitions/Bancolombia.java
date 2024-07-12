package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.retotecnico.questions.ValidarPDF;
import org.retotecnico.tasks.IngresarBancolombia;
import org.retotecnico.tasks.IngresarMenu;
import org.retotecnico.tasks.IrCapitalInteligente;
import org.retotecnico.tasks.IrReporteSeleccionado;

public class Bancolombia {
    @Before
    public void accederEscenarios(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("ingreso a la pagina de bancolombia en el menu corportativo opcion capital inteligente")
    public void ingresoALaPaginaDeBancolombiaEnElMenuCorportativoOpcionCapitalInteligente() {
        OnStage.theActorCalled("actor").wasAbleTo(
                IngresarBancolombia.urlBancolombia(),
                IngresarMenu.capitalInteligente()
        );

    }
    @Cuando("selecciono el apartado actualidad economica y selecciono el reporte a descargar")
    public void seleccionoElApartadoActualidadEconomicaYSeleccionoElReporteADescargar() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IrCapitalInteligente.ingresarActualidadEconomica(),
                IrReporteSeleccionado.descargarReporte()
        );
    }
    @Entonces("descargo el reporte y valido que sea el correcto")
    public void descargoElReporteYValidoQueSeaElCorrecto() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPDF.toThe()));
    }
}
