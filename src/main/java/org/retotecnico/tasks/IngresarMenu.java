package org.retotecnico.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.retotecnico.interactions.CambiarVentana;

import static org.retotecnico.userinterface.MenuCapitalInteligente.*;

public class IngresarMenu implements Task {
    public static IngresarMenu capitalInteligente() {
        return Tasks.instrumented(IngresarMenu.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CORPORATIVOS),
                Click.on(BTN_CAPITAL_INTELIGENTE),
                CambiarVentana.setWindow()
        );
    }
}
