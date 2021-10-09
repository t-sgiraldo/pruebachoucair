package com.choucairtesting.www.empleos.automatizacion.stepdefinitions;

import com.choucairtesting.www.empleos.automatizacion.steps.EmpleosStep;
import com.choucairtesting.www.empleos.automatizacion.steps.HomeStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EmpleosStepDefinition {

    @Steps
    HomeStep homeStep;
    @Steps
    EmpleosStep empleosStep;

    @Given("^Ingreso al sitio web \"([^\"]*)\"$")
    public void ingresoAlSitioWeb(String strUrl) {
        homeStep.navegateToUrl(strUrl);
    }

    @When("^doy clic en el link de empleos$")
    public void doyClicEnElLinkDeEmpleos() {
        homeStep.clicLinkEmpleos();
    }

    @And("^doy clic en el boton ir al portal de empleos$")
    public void doyClicEnElBotonIrAlPortalDeEmpleos() {
        empleosStep.clicIrPortalEmpleos();
    }

    @And("^doy clic en continuar$")
    public void doyClicEnContinuar() {
        empleosStep.clicContinuar();
    }
}
