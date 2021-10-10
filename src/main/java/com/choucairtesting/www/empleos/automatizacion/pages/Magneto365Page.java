package com.choucairtesting.www.empleos.automatizacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Magneto365Page extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Nuestras Vacantes')]")
    private WebElementFacade lnkNuestrasVacantes;

    @FindBy(id = "search_states_checkbox_776")
    private WebElementFacade chkAntioquia;

    @FindBy(name = "search[search_query]")
    private WebElementFacade txtBuscar;

    @FindBy(name = "commit")
    private WebElementFacade btnBuscar;

    @FindBy(id = "v_title_0")
    private WebElementFacade lblAutomatizador;

    @FindBy(className = "btn-success")
    private WebElementFacade btnRegistrar;

    @FindBy(className = "ant-btn-block")
    private WebElementFacade btnContinuar;

    @FindBy(xpath = "//label[contains(text(),'Correo')]")
    private WebElementFacade lblCorreo;

    @FindBy(className = "facebook")
    private WebElementFacade imgFacebook;

    @FindBy(className = "linkedin")
    private WebElementFacade imgLinkedin;

    @FindBy(className = "whatsapp")
    private WebElementFacade imgWhatsapp;

    @FindBy(className = "mail")
    private WebElementFacade imgMail;


    public WebElementFacade getLnkNuestrasVacantes() {
        return lnkNuestrasVacantes;
    }

    public WebElementFacade getChkAntioquia() {
        return chkAntioquia;
    }

    public WebElementFacade getTxtBuscar() {
        return txtBuscar;
    }

    public WebElementFacade getBtnBuscar() {
        return btnBuscar;
    }

    public WebElementFacade getLblAutomatizador() {
        return lblAutomatizador;
    }

    public WebElementFacade getBtnRegistrar() {
        return btnRegistrar;
    }

    public WebElementFacade getBtnContinuar() {
        return btnContinuar;
    }

    public WebElementFacade getLblCorreo() {
        return lblCorreo;
    }

    public WebElementFacade getImgFacebook() {
        return imgFacebook;
    }

    public WebElementFacade getImgLinkedin() {
        return imgLinkedin;
    }

    public WebElementFacade getImgWhatsapp() {
        return imgWhatsapp;
    }

    public WebElementFacade getImgMail() {
        return imgMail;
    }
}
