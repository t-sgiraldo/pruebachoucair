package com.choucairtesting.www.empleos.automatizacion.stepdefinitions;

import com.choucairtesting.www.empleos.automatizacion.steps.EmpleosStep;
import com.choucairtesting.www.empleos.automatizacion.steps.HomeStep;
import com.choucairtesting.www.empleos.automatizacion.steps.Magneto365Step;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EmpleosStepDefinition {

    @Steps
    HomeStep homeStep;
    @Steps
    EmpleosStep empleosStep;
    @Steps
    Magneto365Step magneto365Step;

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

    @And("^doy clic en nuestras vacantes$")
    public void doyClicEnNuestrasVacantes() {
        magneto365Step.clicNuestrasVacantes();
    }

    @And("^filtro por Antioquia$")
    public void filtroPorAntioquia() {
        magneto365Step.filtroMunicipio();
    }

    @And("^Busco empleo de \"([^\"]*)\"$")
    public void buscoEmpleoDe(String strCargo)  {
        magneto365Step.buscarCargo(strCargo);
        magneto365Step.clicBuscar();
    }

    @Then("^Valido que aparezca un empleo de automatizador$")
    public void validoQueAparezcaUnEmpleoDeAutomatizador() {
        magneto365Step.validarAutomatizador();
    }

    @And("^doy clic en registrar hoja de vida y continuar$")
    public void doyClicEnRegistrarHojaDeVidaYContinuar() {
        magneto365Step.clicRegistrarHV();
        magneto365Step.clicContinuar();
    }

    @Then("^valido pagina de registrar hoja de vida$")
    public void validoPaginaDeRegistrarHojaDeVida() throws InterruptedException {
        Thread.sleep(3000);
        magneto365Step.validarPaginaRegistro();
    }

    @Then("^valido iconos redes sociales$")
    public void validoIconosRedesSociales() {
        magneto365Step.validarRedesSociales();
    }
}
