package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SauceSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SauceStepDef {
    @Steps
    SauceSteps login;

    /*@Given("ingreso al aplicativo de Sacue Labs")
    public void ingresoAlAplicativoDeSacueLabs() {
    }*/

    @When("inicio sesion mi usuario {string} y clave {string}")
    public void inicioSesionMiUsuarioYClave(String arg0, String arg1) {
    }

    @Given("ingreso al aplicativo de SacueLabs")
    public void ingresoAlAplicativoDeSacueLabs() {
    }

    @When("ingreso el usuario {string}")
    public void ingresoUsuario(String usuario) {
        login.ingresarUsuario(usuario);

    }

    @And("ingreso la clave {string}")
    public void ingresoLaClave(String contrasena) {
        login.ingresoContrasena(contrasena);
    }

    @And("hago click en LOGIN")
    public void hagoClickEn() {
        login.botonLogin();
    }

    @When("valido que ingrese al apartado de productos")
    public void validoQueIngreseAlApartadoDeProductos() {
        login.validatTituloProductos();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        login.validarProductos();
    }

    @And("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int unidad,String producto) {
        login.agregarUnidades(unidad,producto);


    }

    @Then("valido el {string} en el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente(String producto) {
        login.validarCarrito(producto);
    }
}


