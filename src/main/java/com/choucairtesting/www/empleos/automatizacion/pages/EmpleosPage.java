package com.choucairtesting.www.empleos.automatizacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class EmpleosPage extends PageObject {

    @FindBy(xpath = "//span[contains(text(),'Ir al portal de empleos')]")
    private WebElementFacade btnPortalEmpleos;

    @FindBy(xpath = "//span[contains(text(),'Continuar')]")
    private WebElementFacade btnContinuar;

    public WebElementFacade getBtnPortalEmpleos() {
        return btnPortalEmpleos;
    }

    public WebElementFacade getBtnContinuar() {
        return btnContinuar;
    }
}
