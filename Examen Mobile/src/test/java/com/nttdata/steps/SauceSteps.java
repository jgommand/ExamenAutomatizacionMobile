package com.nttdata.steps;


import com.nttdata.screens.SauceLoginScreen;
import org.junit.Assert;

public class SauceSteps {

    SauceLoginScreen loginScreen;

    public void ingresarUsuario(String usuario) {
        loginScreen.ingresarUsuario(usuario);

    }

    public void ingresoContrasena(String contrasena) {
        loginScreen.ingresarContrasena(contrasena);
    }

    public void botonLogin() {
        loginScreen.ingresarLogin();

    }

    public void  validatTituloProductos() {
        Assert.assertEquals("PRODUCTS",loginScreen.validarApartadoProducto());

    }

    public void validarProductos() {
        loginScreen.listaElementos();

    }

    public void agregarUnidades(int unidad, String producto) {
        loginScreen.buscarProducto(producto);
        loginScreen.agregarCarrito();

    }

    public void validarCarrito(String producto) {
        loginScreen.clickEnCarrito();
        loginScreen.validarCarrito(producto);
    }
}
