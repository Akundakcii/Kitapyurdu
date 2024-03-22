package kitapyurdu_cucumber.links;

import kitapyurdu_cucumber.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class searchLocate {
    public searchLocate() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "search-input")
    public WebElement searchBox;
    @FindBy(css = "span[class='common-sprite button-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='product-cr']")
    public List<WebElement> urunler;
    @FindBy(css = "input[value='İNGİLİZCE']")
    public WebElement ingilizce;

    public static final By dilSecenek =new By.ByXPath("//span[text()='Dil']");


    public static final By urunResim =new By.ByCssSelector("div[class='cover']");

    @FindBy(xpath = "(//a[@id='button-cart'])")
    public WebElement sepeteEkle;
    @FindBy(id = "cart-items-text")
    public WebElement sepetKontrol;

    @FindBy(id="cart-items")
    public WebElement sepeteTikla;
    @FindBy(id="js-cart")
    public WebElement sepeteGit;
    @FindBy(css = "strong[style]")
    public WebElement urunToplam;
    @FindBy(css = "i[title='Kaldır']")
    public  List<WebElement> urunSilme;



}
