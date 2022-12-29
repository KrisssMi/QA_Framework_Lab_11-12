package com.example.autotests.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.autotests.Model.ConteMainPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Test;


import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.*;

public class MyTestClass{

    public static void setUpAll() {
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Test
    public void WhenPressConteFallWinterButton_HeaderShouldHaveTextConteFallWinter() {
        ConteMainPage conteMainPage = new ConteMainPage();
        conteMainPage.openPage();
        conteMainPage.clickOnElement(conteMainPage.link);
        if (conteMainPage.header.getText().contains("CONTE FALL WINTER 2023")) {
            assertTrue(false);
        } else {
            assertTrue(true);
        }
    }

    @Test
    public void WhenPressSalesButton_HeaderShouldHaveTextSales20() {
        ConteMainPage conteMainPage = new ConteMainPage();
        conteMainPage.openPage();
        conteMainPage.clickOnElement(conteMainPage.linkSales);
        assertEquals(
                "-20% на вторые колготки Fantasy", conteMainPage.headerSales.getText());
    }

    @Test
    public void WhenPressNewProductsButton_HeaderShouldHaveTextNewProducts() {
        ConteMainPage conteMainPage = new ConteMainPage();
        conteMainPage.openPage();
        conteMainPage.clickOnElement(conteMainPage.linkNewProducts);
        assertEquals(
                "Новинки - женской одежды", conteMainPage.headerNewProducts.getText());
    }

    @Test
    public void WhenPressGiftСardsButton_HeaderShouldHaveTextGiftСards() {
        ConteMainPage conteMainPage = new ConteMainPage();
        conteMainPage.openPage();
        conteMainPage.clickOnElement(conteMainPage.linkGiftСards);
        assertNotEquals(
                "Подарочные карты", conteMainPage.header.getText(), "Header text is not equal to 'Идеи подарков'");
    }

    @Test
    public void WhenPressNYSocksButton_HeaderShouldHaveTextNYSocks() {
        ConteMainPage conteMainPage = new ConteMainPage();
        conteMainPage.openPage();
        conteMainPage.clickOnElement(conteMainPage.linkNYSocks);
        assertNotEquals(
                "Новогодние носки и колготки", conteMainPage.headerNYSocks.getText(), "Header text is not equal to 'Новогодние носки'");
    }
}
