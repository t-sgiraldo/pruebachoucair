Feature: Sección Empleos

  @test1
  Scenario: Validar vacantes de Automatizador en Antioquia
    Given Ingreso al sitio web "https://www.choucairtesting.com/"
    When doy clic en el link de empleos
    And doy clic en el boton ir al portal de empleos
    And doy clic en continuar
    And doy clic en nuestras vacantes
    And filtro por Antioquia
    And Busco empleo de "Automatizador"
    Then Valido que aparezca un empleo de automatizador

  @test2
  Scenario: Ingresar hoja de vida
    Given Ingreso al sitio web "https://www.choucairtesting.com/"
    When doy clic en el link de empleos
    And doy clic en el boton ir al portal de empleos
    And doy clic en continuar
    And doy clic en nuestras vacantes
    And doy clic en registrar hoja de vida y continuar
    Then valido pagina de registrar hoja de vida

  @test3
  Scenario: Iconos redes sociales
    Given Ingreso al sitio web "https://www.choucairtesting.com/"
    When doy clic en el link de empleos
    And doy clic en el boton ir al portal de empleos
    And doy clic en continuar
    And doy clic en nuestras vacantes
    Then valido iconos redes sociales
