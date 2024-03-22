package kitapyurdu_cucumber.stepdefinations;

import io.cucumber.java.en.Then;
import kitapyurdu_cucumber.links.bultenLocate;

import kitapyurdu_cucumber.utilities.AllMethods;
import org.junit.Assert;


public class bultenStepDefination extends bultenLocate {

    bultenLocate locate = new bultenLocate();

    @Then("bultene tikla")
    public void bultene_tikla() {
        AllMethods.click(locate.bultenLink);
    }

    @Then("bülten veri seç")
    public void bülten_veri_seç() {
        // Write code here that turns the phrase above into concrete actions
        AllMethods.click(locate.bilgisayar);
        AllMethods.click(locate.spor);
        AllMethods.click(locate.bilimMuhendislik);
        AllMethods.click(locate.siyaset);
    }

    @Then("verileri güncelle")
    public void verileri_güncelle() {
        //   AllMethods.click(locate.Kaydet);

    }

    @Then("güncellendiğini kontrol et")
    public void güncellendiğini_kontrol_et() {
    /*   Boolean x= AllMethods.isDisplayed(KaydetAss);
        Assert.assertTrue(x);

     */

    }

}
