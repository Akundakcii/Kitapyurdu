package kitapyurdu_cucumber.stepdefinations;

import io.cucumber.java.en.When;
import kitapyurdu_cucumber.links.favoriLocate;
import kitapyurdu_cucumber.links.girisLocate;
import kitapyurdu_cucumber.utilities.AllMethods;
import kitapyurdu_cucumber.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class favoriStepDefination extends favoriLocate {
    favoriLocate locate = new favoriLocate();
    Actions action = new Actions(Driver.getDriver());


    int randomNum1 = ThreadLocalRandom.current().nextInt(1, 20 + 1);
    int randomNum2 = ThreadLocalRandom.current().nextInt(1, 15 + 1);


    @When("bir ile otuz arasında bir sayı üret ve o ürünü fav ekle")
    public void bir_ile_otuz_arasında_bir_sayı_üret_ve_o_ürünü_fav_ekle() {

        scroll();

        favori(randomNum1);
    }

    @When("alisveris sepetine bir urun ekleme")
    public void alisveris_sepetine_bir_urun_ekleme() {
        AllMethods.bekle(2);
        alisveris(randomNum2);
    }

    @When("favorileri gidilir")
    public void favorileri_gidilir() {
        action.moveToElement(listelerim).perform();
        WebElement s = listelerim.findElement(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
        AllMethods.visibleWait(s, 2);
        AllMethods.click(s);
    }
    @When("favorideki urunler sepete eklenir")
    public void favorideki_urunler_sepete_eklenir(){

        for(int i = 0; i < urunler.size(); i++){
            action.moveToElement(urunler.get(i)).perform();
            WebElement r=urunler.get(i).findElement(By.cssSelector("i[class='fa fa-shopping-cart']"));
            AllMethods.visibleWait(r, 2);
            AllMethods.click(r);

        }
    }

    public void favori(int random) {
        WebElement s = urunler.get(random);
        action.moveToElement(s).perform();
        WebElement fav = s.findElement(By.cssSelector("i[class='fa fa-heart']"));
        AllMethods.visibleWait(fav, 3);
        AllMethods.click(fav);
    }

    public void alisveris(int random) {
        WebElement b = urunler.get(random);
        action.moveToElement(b).perform();
        WebElement alisveris = b.findElement(By.cssSelector("i[class='fa fa-shopping-cart']"));
        AllMethods.visibleWait(alisveris, 2);
        AllMethods.click(alisveris);
    }


    public void scroll() {
        AllMethods.scroll(1000);
        AllMethods.bekle(2);

        AllMethods.scroll(-900);






    }

}

