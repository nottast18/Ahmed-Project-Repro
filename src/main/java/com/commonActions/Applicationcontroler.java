package com.commonActions;

import com.Pages.*;
import org.openqa.selenium.WebDriver;

public class Applicationcontroler extends Basepage {


    private Homepage homepage=null;
    private Logingpage logingpage=null;
    private ProductListsPage productListsPage=null;
    private ProductDetailsPage productDetailsPage=null;
    private CartPage cartPage=null;
    private DragDetailsPage  dragDetailsPage=null;
    private DragInformationPage  dragInformationPage=null;

   protected Applicationcontroler(WebDriver driver) {
        super(driver);
    }

    public Homepage homePage() {

        if(homepage == null) {
            homepage = new Homepage(driver);
        }
        return homepage;
    }
    public Logingpage  logingpage() {

        if(logingpage == null) {
            logingpage = new Logingpage(driver);
        }
        return logingpage;
    }
    public CartPage  cartPage() {

        if(cartPage == null) {
            cartPage = new CartPage(driver);
        }
        return cartPage;
    }


    public DragDetailsPage  dragDetailsPage() {

        if(dragDetailsPage == null) {
            dragDetailsPage = new DragDetailsPage(driver);
        }
        return dragDetailsPage;
    }


    public DragInformationPage  dragInformationPage() {

        if(dragInformationPage == null) {
            dragInformationPage = new DragInformationPage(driver);
        }
        return dragInformationPage;
    }
    public ProductListsPage  productListsPage() {

        if(productListsPage == null) {
            productListsPage = new ProductListsPage(driver);
        }
        return productListsPage;
    }
    public ProductDetailsPage  productDetailsPage() {

        if(productDetailsPage == null) {
            productDetailsPage = new ProductDetailsPage(driver);
        }
        return productDetailsPage;
    }





}
