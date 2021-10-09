package com.choucairtesting.www.empleos.automatizacion.stepdefinitions;

import com.choucairtesting.www.empleos.automatizacion.pages.HomePage;
import com.choucairtesting.www.empleos.automatizacion.steps.HomeSteps;
import cucumber.api.java.en.Given;

public class EmpleosStepDefinition {

    HomeSteps homeSteps;

    @Given("^Ingreso al sitio web \"([^\"]*)\"$")
    public void ingresoAlSitioWeb(String strUrl) {
        homeSteps.openUrl(strUrl);
    }
}
