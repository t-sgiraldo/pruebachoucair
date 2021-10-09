package com.choucairtesting.www.empleos.automatizacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {

    @FindBy(className = "overlay-black")
    private WebElementFacade ctdSubCategories;
}
