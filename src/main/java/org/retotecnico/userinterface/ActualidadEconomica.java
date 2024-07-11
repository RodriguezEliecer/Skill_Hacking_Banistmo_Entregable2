package org.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ActualidadEconomica extends PageObject {
    public static final Target BTN_ACTUALIDAD_ECONOMICA = Target.the(
    "Boton Actualida economica Menu").located(
    By.xpath("//*[@id='bs-example-navbar-collapse-1']//a[contains(text(),'Actualidad económica')]"));

    public static final Target BTN_REPORTE = Target.the(
            "Boton REPORTE").located(
            By.xpath("//*[@id='capital_inteligente']/div[1]/div[113]/div[1]/div/a/img"));
}
