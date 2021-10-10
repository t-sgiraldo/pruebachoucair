package com.choucairtesting.www.empleos.automatizacion.steps;

import com.choucairtesting.www.empleos.automatizacion.pages.Magneto365Page;
import com.choucairtesting.www.empleos.automatizacion.utils.Utils;

import static org.junit.Assert.assertEquals;

public class Magneto365Step {

    Magneto365Page magneto365Page;
    Utils utils;

    public void clicNuestrasVacantes(){
        magneto365Page.getLnkNuestrasVacantes().click();
    }

    public void filtroMunicipio(){
        magneto365Page.getChkAntioquia().click();
    }

    public void buscarCargo(String strCargo){
        magneto365Page.getTxtBuscar().sendKeys(strCargo);
    }

    public void clicBuscar(){
        magneto365Page.getBtnBuscar().click();
    }

    public void validarAutomatizador(){
        assertEquals("Automatizador", magneto365Page.getLblAutomatizador().getText());
    }

    public void clicRegistrarHV(){
        utils.scrollDown("750");
        magneto365Page.getBtnRegistrar().click();
    }

    public void clicContinuar(){
        magneto365Page.getBtnContinuar().click();
    }

    public void validarPaginaRegistro(){
        assertEquals("correo", magneto365Page.getLblCorreo().getText());
    }

    public void validarRedesSociales(){
        utils.waitForVisibility(magneto365Page.getImgFacebook());
        utils.waitForVisibility(magneto365Page.getImgMail());
        utils.waitForVisibility(magneto365Page.getImgWhatsapp());
        utils.waitForVisibility(magneto365Page.getImgLinkedin());
    }

}
