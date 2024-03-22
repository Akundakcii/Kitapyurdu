package kitapyurdu_cucumber.links;

import kitapyurdu_cucumber.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class yayinEvleriLocate {
    public yayinEvleriLocate() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[class='swiper-slide']")
    public WebElement yayinEvleri;

    public static final By yayinEvleriList = new By.ByCssSelector("a[class='swiper-slide']");
    @FindBy(css = "input[name='selected_sell_price_min']")
    public WebElement minFiyat;
    @FindBy(css = "input[name='selected_sell_price_max']")
    public WebElement maxFiyat;
    @FindBy(css = "a[class='button']")
    public WebElement güncelleButton;
    public static final By urunFiyat = new By.ByCssSelector("span[class='value']");
    @FindBy(css = "span[class='value']")
    public List<WebElement> kitapFiyat;
    @FindBy (css="div[class='name ellipsis']")
    public List<WebElement> kitapAd;
    public static final By urunList = new By.ByCssSelector("div[class='cover']");
    @FindBy(css = "div[class='cover']")
    public List<WebElement> kitapLar;
    @FindBy(css = "div[class='offer-action']")
    public List<WebElement> birlikteAl;
    public static final By sepeteEklemeAssert = new By.ByCssSelector("div[class='success']");
    @FindBy(css = "textarea[placeholder='Yorum Yaz']")
    public WebElement yorumyaz;

    @FindBy(css = "li[data-value='5']")
    public WebElement yildizVer;
    @FindBy(id = "review-reply-button")
    public WebElement yorumGonder;


}
