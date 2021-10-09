package com.choucairtesting.www.empleos.automatizacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

    @FindBy(id = "menu-item-550")
    private WebElementFacade lnkEmpleos;

    public WebElementFacade getLnkEmpleos() {
        return lnkEmpleos;
    }
}
