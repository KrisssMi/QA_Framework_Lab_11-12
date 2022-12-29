package com.example.autotests.Model;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class ConteMainPage {

    public final String URL = "https://conteshop.by/";

    public final SelenideElement link = $x("//html/body/div[4]/div[4]/div/div[2]/div/div/div[4]/a");
    public final SelenideElement header = $x("//html/body/div/div[1]/div/div/div[4]/div");

    public final SelenideElement linkSales = $x("//html/body/div[4]/div[2]/div[6]/div/div/a");
    public final SelenideElement headerSales = $x("//html/body/div[5]/div[6]/div/div[2]/div[2]/div[1]");

    public final SelenideElement linkNewProducts = $x("//html/body/div[4]/div[3]/div/div/div/a[2]");
    public final SelenideElement headerNewProducts = $x("//html/body/div[5]/div[6]/div/div[2]/div[4]");

    public final SelenideElement linkGiftСards = $x("//html/body/div[4]/div[3]/div/div/div/a[3]");
    public final SelenideElement headerGiftСards = $x("//html/body/div[5]/div[6]/div/div[2]/div[4]");

    public final SelenideElement linkNYSocks = $x("//html/body/div[4]/div[3]/div/div/div/a[5]");
    public final SelenideElement headerNYSocks = $x("//html/body/div[5]/div[6]/div/h1");


    public final SelenideElement SearchByFranchise  = $x("//html/body/div[4]/div[2]/div[2]/div/div/div[2]/a[3]");
    public final SelenideElement GogoLink = $x("//html/body/div[4]/div[2]/div[1]/div/div[2]/div[3]/noindex/form/input[2]");

    public void clickOnElement(SelenideElement element){
        element.click();
    }

    public void setValueOnInput(SelenideElement inputElement,String Value){
        inputElement.setValue(Value);
    }

    public void PressTabOnElement(SelenideElement element){
        element.pressTab();
    }

    public void hoverOnElement(SelenideElement element) {
        element.hover();
    }

    public void openPage() {
        open(URL);
    }
}
