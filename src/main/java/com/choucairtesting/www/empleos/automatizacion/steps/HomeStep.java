package com.choucairtesting.www.empleos.automatizacion.steps;

import com.choucairtesting.www.empleos.automatizacion.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeStep {

    HomePage homePage;

    @Step
    public void navegateToUrl(String strUrl){
        homePage.getDriver().navigate().to(strUrl);
    }

    @Step
    public void clicLinkEmpleos(){
        homePage.getLnkEmpleos().click();
    }
}
