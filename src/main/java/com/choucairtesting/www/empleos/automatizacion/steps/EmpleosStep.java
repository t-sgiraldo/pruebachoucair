package com.choucairtesting.www.empleos.automatizacion.steps;

import com.choucairtesting.www.empleos.automatizacion.pages.EmpleosPage;
import com.choucairtesting.www.empleos.automatizacion.pages.HomePage;
import com.choucairtesting.www.empleos.automatizacion.utils.Utils;

public class EmpleosStep {

    EmpleosPage empleosPage;
    Utils utils;

    public void clicIrPortalEmpleos(){
        utils.scrollDown("250");
        empleosPage.getBtnPortalEmpleos().click();
    }

    public void clicContinuar(){
        empleosPage.getBtnContinuar().click();
    }
}
