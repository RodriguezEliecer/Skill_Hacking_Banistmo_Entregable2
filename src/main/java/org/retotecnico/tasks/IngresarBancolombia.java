package org.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.retotecnico.userinterface.UrlBancolombia;

public class IngresarBancolombia implements Task {
    private UrlBancolombia urlpagina;
    public static IngresarBancolombia urlBancolombia() {
        return Tasks.instrumented(IngresarBancolombia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(urlpagina)
        );
    }
}
