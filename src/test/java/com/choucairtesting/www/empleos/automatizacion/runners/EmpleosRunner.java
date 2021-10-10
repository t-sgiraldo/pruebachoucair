package com.choucairtesting.www.empleos.automatizacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/choucairtesting/www/empleos/automatizacion/features/Empleos.feature",
        tags = "@test2",
        glue = "com.choucairtesting.www.empleos.automatizacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class EmpleosRunner {
}
