package kitapyurdu_cucumber.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kitapyurdu_cucumber.links.girisLocate;
import kitapyurdu_cucumber.utilities.AllMethods;
import kitapyurdu_cucumber.utilities.ConfigrationRead;
import kitapyurdu_cucumber.utilities.Driver;
import org.junit.Assert;

public class girisStepDefination {
    girisLocate locate = new girisLocate();

    @Given("kitapyurdu sayfasına gidilir")
    public void kitapyurdu_sayfasına_gidilir() {
        Driver.getDriver().get(ConfigrationRead.getProperty("kitapyurdu"));
    }

    @When("Giris yap tikla.")
    public void giris_yap_tikla() {
        AllMethods.click(locate.girisButton);
    }

    @When("eposta gir")
    public void eposta_gir() {
        AllMethods.sendKeysJS(locate.epostaTextBox, "***BURAYA GİRİŞ EPOSTASINI GİRİNİZ***");
    }

    @When("sifre gir")
    public void sifre_gir() {

        AllMethods.sendKeysJS(locate.sifreText, "***BURAYA ŞİFRENİZİ GİRİNİZ***");

    }

    @When("giris butona tikla")
    public void giris_butona_tikla() {
        AllMethods.click(locate.girisButtonClick);
    }

    @Then("giris yapıldığını kontrol et")
    public void giris_yapıldığını_kontrol_et() {
String hesabim = "Hesabım";
String varmi= locate.hesabimDogrulama.getText();
        Assert.assertEquals(hesabim,varmi);
    }
    @Then("isCookies")
    public void is_cookies() {
        //AllMethods.visibleWait(locate.acceptcokies,3);
        AllMethods.click(locate.acceptcokies);
    }
    @Then("Anasayfaya Don")
    public void anasayfaya_don(){
        AllMethods.click(locate.anasayfayaDon);
    }
}

