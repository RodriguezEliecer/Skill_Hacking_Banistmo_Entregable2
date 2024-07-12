package org.retotecnico.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarPDF implements Question<Boolean> {

    public static ValidarPDF toThe() {
        return new ValidarPDF();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean resultado = false;
        String nombre = "informe-sectorial-petroleo-junio-2021";
        String currentTitle = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
        if (currentTitle.contains(nombre)){
            resultado = true;
        }
        return resultado;

    }
}
