package kitapyurdu_cucumber.links;

import kitapyurdu_cucumber.utilities.AllMethods;
import kitapyurdu_cucumber.utilities.Driver;
import org.junit.FixMethodOrder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class girisLocate {
    public girisLocate() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "a[href='https://www.kitapyurdu.com/index.php?route=account/login']")
    public WebElement girisButton;
    @FindBy(id = "login-email")
    public WebElement epostaTextBox;
    @FindBy(id = "login-password")
    public WebElement sifreText;

    @FindBy(css = "button[role='button']")
    public WebElement girisButtonClick;

    @FindBy(css = "h1[class='section']")
    public WebElement hesabimDogrulama;
    @FindBy(id = "cookiescript_accept")
    public WebElement acceptcokies;
    @FindBy(css = "img[src='https://img.kitapyurdu.com/v1/getImage/fn:11682843/wh:d8e078ec3']")
    public WebElement anasayfayaDon;
}
