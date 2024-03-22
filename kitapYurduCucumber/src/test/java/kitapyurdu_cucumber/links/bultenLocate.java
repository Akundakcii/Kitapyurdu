package kitapyurdu_cucumber.links;

import kitapyurdu_cucumber.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bultenLocate {
    public bultenLocate() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[href='https://www.kitapyurdu.com/index.php?route=account/newsletter']")
    public WebElement bultenLink;
    @FindBy (css = "input[value='2']")
    public WebElement bilgisayar;
    @FindBy (css = "input[value='15']")
    public WebElement bilimMuhendislik;
    @FindBy (css = "input[value='11']")
    public WebElement spor;
    @FindBy(css = "input[value='7']")
    public WebElement siyaset;
    @FindBy(css = "input[value='Kaydet']")
    public WebElement Kaydet;
    @FindBy(css="div[class='success']")
    public WebElement KaydetAssert;
    public static final By KaydetAss = new By.ByCssSelector("div[class='success']");




}
