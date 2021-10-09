package com.choucairtesting.www.empleos.automatizacion.steps;

import com.choucairtesting.www.empleos.automatizacion.pages.Magneto365Page;

import static org.junit.Assert.assertEquals;

public class Magneto365Step {

    Magneto365Page magneto365Page;

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

    public void ValidarAutomatizador(){
        assertEquals("Automatizador", magneto365Page.getLblAutomatizador().getText());
    }
}
