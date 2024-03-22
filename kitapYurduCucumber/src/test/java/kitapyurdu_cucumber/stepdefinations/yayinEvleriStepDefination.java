package kitapyurdu_cucumber.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kitapyurdu_cucumber.links.uyelikLocate;
import kitapyurdu_cucumber.links.yayinEvleriLocate;
import kitapyurdu_cucumber.utilities.AllMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class yayinEvleriStepDefination extends yayinEvleriLocate {
    yayinEvleriLocate locate = new yayinEvleriLocate();

    @When("Ayın Yayın eklerınen random biri seçilir")
    public void ayın_yayın_eklerınen_random_biri_seçilir() {
        AllMethods.scroll(400);

        for (int i = 2; i < getProductList().size(); i++)
            getProductList().get(i).click();

    }

    @When("Fiyat filtrelemesi yapılır ve Güncelle Tıklanır")
    public void fiyat_filtrelemesi_yapılır_ve_güncelle_tıklanır() {
        AllMethods.scroll(800);
        AllMethods.sendKeysJS(locate.minFiyat, "100");
        AllMethods.sendKeysJS(locate.maxFiyat, "200");
        AllMethods.click(güncelleButton);

    }

    @When("birtane kitap seçilir")
    public void birtane_kitap_seçilir() {
        for (int i = 0; i < kitapFiyat.size(); i++) {
            String x = kitapFiyat.get(i).getText();
            double toplamDeger = Double.parseDouble(x.replace(",", "."));
            if (toplamDeger < 100 || toplamDeger > 200) {
              //  System.out.println("Kitapların Fiyat listesi Filtrelemeyi 100  TL ile 200 TL arası yaptık.");
              //  System.out.println(toplamDeger);
            }
        }
        for (int i = 6; i < kitapLar.size(); i++) {

            kitapLar.get(i).click();
        }


    }

    @Given("Çoklu Tekliften birtanesi seçilir")
    public void çoklu_tekliften_birtanesi_seçilir() {

      birlikteAl.get(1).click();

      /* hepsini gezmek için
      for (int i = 0; i < birlikteAl.size();i++ ) {

            birlikteAl.get(1).click();
        }


       */
    }


    @Given("Kitap için yorum yapılır ve yıldız verilir")
    public void kitap_için_yorum_yapılır_ve_yıldız_verilir() {
        AllMethods.sendKeysJS(yorumyaz, "Çok Güzel Kitap Kesinlikle Tavsiye ederim... AHMET KUNDAKCI");
        AllMethods.click(locate.yildizVer);
        // AllMethods.click(yorumGonder); // Yorum Göndermek için aç
    }



    //List Eklemessek buradan tanımlar FindBy sız hali
    private List<WebElement> getProductList() {
        return AllMethods.findAll(yayinEvleriList);
    }


}
