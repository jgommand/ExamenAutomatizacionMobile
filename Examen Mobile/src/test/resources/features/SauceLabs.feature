# new feature
# Tags: optional

Feature: Sauce Labs APP
@Test
    Scenario Outline: Login exitoso y validacion de productos
        Given ingreso al aplicativo de SacueLabs
        And  ingreso el usuario "standard_user"
        And  ingreso la clave "secret_sauce"
        And hago click en LOGIN
        When  valido que ingrese al apartado de productos
        And valido que carguen correctamente los productos en la galeria
        And agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
        Then valido el "<PRODUCTO>" en el carrito de compra actualice correctamente

        Examples:
         | PRODUCTO                        | UNIDADES |
         |Sauce Labs Backpack| 1                   |
          |Sauce Labs Bike Light|1                 |




