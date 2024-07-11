package org.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.retotecnico.interactions.CambiarVentana;

import static org.retotecnico.userinterface.Reporte.BTN_DESCARGAR_REPORTE;

public class IrReporteSeleccionado implements Task {
    public static IrReporteSeleccionado descargarReporte() {
        return Tasks.instrumented(IrReporteSeleccionado.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DESCARGAR_REPORTE),
                CambiarVentana.setWindow()
        );
    }
}
