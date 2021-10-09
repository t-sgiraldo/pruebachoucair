Feature: Sección Empleos


  Scenario: Validar que los videos de Youtube esten disponibles
    Given Ingreso al sitio web "https://www.choucairtesting.com/"
    When doy clic en el link de empleos
    And doy clic en el boton ir al portal de empleos
    And doy clic en continuar
    And doy clic en nuestras vacantes
    And filtro por Antioquia
    And Busco empleo de "Automatizador"
    Then Valido que aparezca un empleo de automatizador
