package com.choucairtesting.www.empleos.automatizacion.steps;

import com.choucairtesting.www.empleos.automatizacion.pages.HomePage;

public class HomeStep {

    HomePage homePage;

    public void navegateToUrl(String strUrl){
        homePage.getDriver().navigate().to(strUrl);
    }

    public void clicLinkEmpleos(){
        homePage.getLnkEmpleos().click();
    }
}
