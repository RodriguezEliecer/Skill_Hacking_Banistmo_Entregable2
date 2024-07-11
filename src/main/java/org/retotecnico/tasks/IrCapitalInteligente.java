package org.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.retotecnico.interactions.CambiarVentana;

import static org.retotecnico.userinterface.ActualidadEconomica.*;


public class IrCapitalInteligente implements Task {
    public static IrCapitalInteligente ingresarActualidadEconomica() {
        return Tasks.instrumented(IrCapitalInteligente.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ACTUALIDAD_ECONOMICA),
                Click.on(BTN_REPORTE),
                CambiarVentana.setWindow()
        );
    }
}
