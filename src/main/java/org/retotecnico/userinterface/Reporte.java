package org.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Reporte extends PageObject {
    public static final Target BTN_VISUAL = Target.the(
            "Boton Visual").located(
            By.id("btnGrid"));
    public static final Target SELECCIONAR_REPORTE = Target.the(
    "Boton Seleccionar Reporte").located(
            By.xpath("//*[@id='capital_inteligente']/div[2]/div[113]/h2/a"));

    public static final Target BTN_DESCARGAR_REPORTE = Target.the(
            "Boton Descargar PDF").located(
            By.xpath("//*[@id='main-content']/div[2]/div[1]/div/div[1]/p[15]/a/img"));

}
