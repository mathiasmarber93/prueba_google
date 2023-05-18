Feature: Prueba Google

  Scenario Outline: Buscar una palabra en google

    Given el usuario ingresa a google
    When escribe la palabra <word>
    And da click en el boton buscar
    Then google mostrara una serie de resultados

    Examples:
    |word|
    |INEI|