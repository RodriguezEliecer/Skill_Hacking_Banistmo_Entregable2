package org.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.retotecnico.interactions.CambiarVentana;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.retotecnico.userinterface.Reporte.*;


public class IrReporteSeleccionado implements Task {
    public static IrReporteSeleccionado descargarReporte() {
        return Tasks.instrumented(IrReporteSeleccionado.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_VISUAL, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_VISUAL),
                WaitUntil.the(SELECCIONAR_REPORTE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SELECCIONAR_REPORTE),
                WaitUntil.the(BTN_DESCARGAR_REPORTE, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_DESCARGAR_REPORTE),
                CambiarVentana.setWindow()
        );
    }
}
