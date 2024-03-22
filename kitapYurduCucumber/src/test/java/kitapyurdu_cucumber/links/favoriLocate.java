package kitapyurdu_cucumber.links;

import kitapyurdu_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class favoriLocate {

    public favoriLocate() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='product-cr']")
    public List<WebElement> urunler;

    @FindBy(css = "i[class='fa fa-heart']")
    public WebElement favori ;

    @FindBy(css = "i[class='fa fa-tag']")
    public WebElement tag;
    @FindBy(xpath = "(//a[@class='common-sprite'])[3]")
    public WebElement listelerim;

}
