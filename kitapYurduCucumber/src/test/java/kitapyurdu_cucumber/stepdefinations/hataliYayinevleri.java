package kitapyurdu_cucumber.stepdefinations;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kitapyurdu_cucumber.links.yayinEvleriLocate;
import kitapyurdu_cucumber.utilities.AllMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class hataliYayinevleri extends yayinEvleriLocate {
    yayinEvleriLocate locate = new yayinEvleriLocate();


    @When("Ayın Yayın eklerınen random biri seçilir1")
    public void ayın_yayın_eklerınen_random_biri_seçilir1() {
        AllMethods.scroll(400);

        for (int i = 2; i < getProductList().size(); i++)
            getProductList().get(i).click();

    }

    @When("Fiyat filtrelemesi yapılır ve Güncelle Tıklanır1")
    public void fiyat_filtrelemesi_yapılır_ve_güncelle_tıklanır1() {
        AllMethods.scroll(800);
        AllMethods.sendKeysJS(locate.minFiyat, "100");
        AllMethods.sendKeysJS(locate.maxFiyat, "200");
        AllMethods.click(güncelleButton);

    }

    @Then("fiyat kontrolu")
    public void fiyat_kontrolu() {

        for (int i = 0; i < kitapFiyat.size(); i++) {
            String x = kitapFiyat.get(i).getText();

            double toplamDeger = Double.parseDouble(x.replace(",", "."));
            if (toplamDeger < 100 || toplamDeger > 200) {
                String kitapAdi = kitapAd.get(i).getText();
                System.out.println("Kitapların Fiyat listesi Filtrelemeyi 100  TL ile 200 TL arası yaptık.");
                System.out.println("Kitap adı: " + kitapAdi + ", Fiyat: " + toplamDeger + " TL");
                Assert.assertTrue(toplamDeger >= 100 && toplamDeger <= 200); //Bunu silip tüm hatalı veriler görünür

            }

        }


    }


    //List Eklemessek buradan tanımlar FindBy sız hali
    private List<WebElement> getProductList() {
        return AllMethods.findAll(yayinEvleriList);
    }


}


