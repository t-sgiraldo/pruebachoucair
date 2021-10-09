package com.choucairtesting.www.empleos.automatizacion.steps;

import com.choucairtesting.www.empleos.automatizacion.pages.EmpleosPage;
import com.choucairtesting.www.empleos.automatizacion.pages.HomePage;

public class EmpleosStep {

    EmpleosPage empleosPage;

    public void clicIrPortalEmpleos(){
        empleosPage.getBtnPortalEmpleos().click();
    }

    public void clicContinuar(){
        empleosPage.getBtnContinuar().click();
    }
}
