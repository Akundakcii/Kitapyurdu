package kitapyurdu_cucumber.links;

import kitapyurdu_cucumber.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class uyelikLocate {
    public uyelikLocate() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='menu top login']")
    public WebElement merhabayazisi;
    @FindBy(xpath = "//span[text()='Hesap Bilgilerim']")
    public WebElement hesapBilgilerim;
    @FindBy(id = "button-select-customer-image")
    public WebElement resimSelected;

    public static final By resim =By.id("button-select-customer-image");
    @FindBy(css = "input[name='nickname']")
    public WebElement takmaAd;
    @FindBy(css = "select[name='day']")
    public WebElement gunSelected;
    @FindBy(css = "select[name='month']")
    public WebElement aySelected;

    @FindBy(css = "select[name='year']")
    public WebElement yilSelected;
    @FindBy(id = "login-phone-number")
    public WebElement telNo;
    @FindBy(id = "button")
    public WebElement kaydet;

    @FindBy(css = "div[class='alert dismissable success']")
    public WebElement kontrolAler;

}
