package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SauceLoginScreen extends PageObject  {
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUsuario;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtPassword;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
    private WebElement tituloProductos;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ADD TO CART\"]")
    private WebElement btnAddCarrito;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")
    private WebElement Carrito;



    public void ingresarUsuario(String texto){
        WebDriverWait wait = new WebDriverWait(getDriver(),20);
        wait.until(ExpectedConditions.elementToBeClickable(txtUsuario));
        txtUsuario.sendKeys(texto);

    }


    public void ingresarContrasena(String texto) {
        WebDriverWait wait = new WebDriverWait(getDriver(),20);
        wait.until(ExpectedConditions.elementToBeClickable(txtPassword));
        txtPassword.sendKeys(texto);

    }

    public void ingresarLogin() {
            btnLogin.click();
    }

    public String validarApartadoProducto( ) {
        WebDriverWait wait = new WebDriverWait(getDriver(),20);
         WebElement titulo=getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"PRODUCTS\"]"));
        return titulo.getText();
    }

    public int listaElementos() {
        List<WebElement> lista=getDriver().findElements(By.xpath("//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]/android.view.ViewGroup/android.view.ViewGroup[1]"));
        System.out.println("Cantidad :"+ lista.size());
        return lista.size();
    }

    public void buscarProducto(String producto) {
        WebDriverWait wait = new WebDriverWait(getDriver(),20);
        WebElement nombreProducto=getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\""+producto+"\"]"));
        System.out.println(nombreProducto.getText());
         nombreProducto.click();

    }

    public void agregarCarrito() {
        btnAddCarrito.click();
    }

    public String validarCarrito(String producto) {
        WebDriverWait wait = new WebDriverWait(getDriver(),20);
        WebElement tituloCarrito=getDriver().findElement(By.xpath("//android.widget.TextView[@text=\""+producto+"\"]"));
        return tituloCarrito.getText();
    }

    public void clickEnCarrito() {
        Carrito.click();
    }
}
