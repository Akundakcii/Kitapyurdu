package kitapyurdu_cucumber.stepdefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kitapyurdu_cucumber.links.girisLocate;
import kitapyurdu_cucumber.links.uyelikLocate;
import kitapyurdu_cucumber.utilities.AllMethods;
import org.junit.Assert;

public class uyelikStepDefination extends uyelikLocate {
    uyelikLocate locate = new uyelikLocate();

    @When("uye isiminin üstüne gel")
    public void uye_isiminin_üstüne_gel() {
        //  AllMethods.visibleWait(locate.merhabayazisi,5);
        //  AllMethods.click(locate.merhabayazisi);
    }

    @When("hesabına tikla")
    public void hesabına_tikla() {
        AllMethods.click(locate.merhabayazisi);

    }

    @Then("hesap bilgilerine tikla")
    public void hesap_bilgilerine_tikla() {
        AllMethods.click(locate.hesapBilgilerim);
    }

    @Then("resim ekle")
    public void resim_ekle() {

        //   AllMethods.resimEkleText("C:\\Users\\Kundakcii\\Desktop\\balkes.png",resim);
    }

    @Then("takma ad koy")
    public void takma_ad_koy() {
        AllMethods.sendKeysJS(locate.takmaAd, "Kukuule");
    }

    @Then("dogumgunu sec")
    public void dogumgunu_sec() {
        AllMethods.ddmValue(locate.gunSelected, "2");
        AllMethods.ddmVisibleText(locate.aySelected, "Ocak");

        AllMethods.ddmValue(locate.yilSelected, "1997");

    }

    @Then("Tel no yaz")
    public void tel_no_yaz() {
        AllMethods.sendKeysJS(locate.telNo, "5466965474");
    }

    @Then("güncelleye tikla")
    public void güncelleye_tikla() {
//AllMethods.click(locate.kaydet);
    }

    @Then("hesap güncellendi yazsını kontrol et")
    public void hesap_güncellendi_yazsını_kontrol_et() {
     /*   String Atext = "Hesabınız başarılı bir şekilde güncellendi.";
        String Otexy = locate.kontrolAler.getText();

        Assert.assertEquals(Otexy, Atext);

      */
    }
}
