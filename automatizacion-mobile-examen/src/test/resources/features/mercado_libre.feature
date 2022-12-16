Feature: Busqueda en mercado libre

  @testMercadoLibre
  Scenario:  busqueda de producto

    Given estoy en la app Mercado Libre
    When  selecciono la barra de busqueda
    And   ingreso la busqueda "televisores"
    And   seleciono el primer resultado