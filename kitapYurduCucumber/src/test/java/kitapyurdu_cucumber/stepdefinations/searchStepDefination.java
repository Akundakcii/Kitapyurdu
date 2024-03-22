package kitapyurdu_cucumber.stepdefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kitapyurdu_cucumber.links.searchLocate;
import kitapyurdu_cucumber.links.uyelikLocate;
import kitapyurdu_cucumber.utilities.AllMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class searchStepDefination extends searchLocate {
    searchLocate locate = new searchLocate();

    @When("SearchBox bir ürün yaz")
    public void search_box_bir_ürün_yaz() {
        AllMethods.sendKeysJS(locate.searchBox, "Suç ve ceza");
    }

    @When("Arama butonuna tıkla")
    public void arama_butonuna_tıkla() {
        AllMethods.click(locate.searchButton);
    }

    @Then("Arama yapıldığına kontrol et")
    public void arama_yapıldığına_kontrol_et() {
        for (int i = 0; i < locate.urunler.size(); i++) {
            Assert.assertTrue(locate.urunler.get(i).getText().contains("Suç"));
        }
    }

    @Then("Filtreden dil seceniği ekle")
    public void filtreden_dil_seceniği_ekle() {
        Boolean dilsecenegi = AllMethods.isDisplayed(dilSecenek);
        if (dilsecenegi) {
            AllMethods.click(ingilizce);
            AllMethods.bekle(2);
        }
    }

    @Then("ilk iki ürünü sepete ekle")
    public void ilk_iki_ürünü_sepete_ekle() {
        for (int i = 1; i < getProductList().size(); i++)
            getProductList().get(i).click();
        AllMethods.click(sepeteEkle);

    }

    @Then("Sepete eklenen ürünü kontrolünü yap")
    public void sepete_eklenen_ürünü_kontrolünü_yap() {
        String mevcutUrun = locate.sepetKontrol.getText();
        String urun = "0";
        Assert.assertNotEquals(urun, mevcutUrun);

    }

    @Then("Sepete tıkla ve git")
    public void sepete_tıkla_ve_git() {
        AllMethods.click(sepeteTikla);
       // AllMethods.bekle(2);
        AllMethods.click(sepeteGit);
    }

    @Then("Sepet tutarı yüz tl değil ise yeni bir kitap ekle")
    public void sepet_tutarı_yüz_tl_değil_ise_yeni_bir_kitap_ekle() {
        String toplam = locate.urunToplam.getText();
        double toplamDeger = Double.parseDouble(toplam.replace(",", "."));
        if (toplamDeger < 100) {
            AllMethods.sendKeysJS(locate.searchBox, "Suç ve ceza");
            AllMethods.click(locate.searchButton);

            for (int i = 2; i < getProductList().size(); i++)
                getProductList().get(i).click();
            AllMethods.click(sepeteEkle);
            AllMethods.bekle(2);
            AllMethods.click(sepeteTikla);
           AllMethods.bekle(2);
            AllMethods.click(sepeteGit);
        }


    }

    @Then("Sepete git ve ürünleri sil")
    public void sepete_git_ve_ürünleri_sil() {

        for (int i = 0; i < urunSilme.size();) {
            AllMethods.bekle(2);
            AllMethods.click(urunSilme.get(i));
        }

    }

    private List<WebElement> getProductList() {
        return AllMethods.findAll(locate.urunResim);
    }
}
