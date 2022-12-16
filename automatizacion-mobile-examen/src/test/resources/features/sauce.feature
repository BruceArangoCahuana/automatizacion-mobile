#language: es
Característica: validar producto
  Yo, como usuario
  Quiero, tener la opcion de iniciar session
  para ver los productos

  @saucelab
  Escenario:  Iniciar session
    Dado que me encuentro en la app de SauceApp
    Cuando  Ingrese el usuario "standard_user" y la contraseña "secret_sauce"
    Entonces  valido quedeberia aparecer el titulo "PRODUCTS"
    Y valido que exista al menos un producto