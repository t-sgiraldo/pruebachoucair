package com.choucairtesting.www.empleos.automatizacion.steps;

import com.choucairtesting.www.empleos.automatizacion.pages.EmpleosPage;
import com.choucairtesting.www.empleos.automatizacion.pages.HomePage;
import com.choucairtesting.www.empleos.automatizacion.utils.Utils;
import net.thucydides.core.annotations.Step;

public class EmpleosStep {

    EmpleosPage empleosPage;
    Utils utils;

    @Step
    public void clicIrPortalEmpleos(){
        utils.scrollDown("250");
        empleosPage.getBtnPortalEmpleos().click();
    }

    @Step
    public void clicContinuar(){
        empleosPage.getBtnContinuar().click();
    }
}
