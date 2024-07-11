package org.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuCapitalInteligente extends PageObject {
    public static final Target BTN_CORPORATIVOS = Target.the(
    "Boton Menu Corporativo").located(
    By.id("header-empresas")
    );

    public static final Target BTN_CAPITAL_INTELIGENTE = Target.the(
            "Boton Sub Menu Capital Inteligente").located(
            By.xpath("//*[@id='headerMain']/div[2]//a[contains(text(),'Capital Inteligente')]")
    );



}
