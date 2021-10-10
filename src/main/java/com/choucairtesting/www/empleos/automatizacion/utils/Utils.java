package com.choucairtesting.www.empleos.automatizacion.utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends PageObject {

    public void scrollDown(String tam) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("scroll(0, " + tam + ")");
    }

    public WebElement waitForVisibility(WebElement webElement) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 15);
        return webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
