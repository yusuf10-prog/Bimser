package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.BimserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Set;

public class BimserStepdefinitions {
    BimserPage bimserPage;


    @Given("Kullanici {string} adresi ile anasayfaya gider")
    public void kullanici_adresi_ile_anasayfaya_gider(String bimserUrl) {
        bimserPage=new BimserPage();
        Driver.getDriver().get(ConfigReader.getProperty(bimserUrl));
       // JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
       // js.executeScript("window.scrollTo(0, 0)");
    }
    @Given("Telefon numarasini arama alanina tiklar.")
    public void telefon_numarasini_arama_alanina_tiklar() {


        bimserPage.telefon.click();
    }
    @Given("FaceTime acilsin mi? alaninda iptal butonuna tiklar.")
    public void face_time_acilsin_mi_alaninda_iptal_butonuna_tiklar() throws AWTException {
        Robot robot=new Robot();
        ReusableMethods.bekle(5);
        Point point1 = new Point(710,274);
        robot.mouseMove(point1.x, point1.y); // Farenin konumunu ayarla
        ReusableMethods.bekle(5);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama yap
        ReusableMethods.bekle(5);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama bırak
        ReusableMethods.bekle(5);
    }
    @Given("mail adresine tiklar. Mail adresinin acildigi alanda cik butonuna tiklar.")
    public void mail_adresine_tiklar_mail_adresinin_acildigi_alanda_cik_butonuna_tiklar() throws AWTException {
        bimserPage.mail.click();
        Robot robot=new Robot();
        ReusableMethods.bekle(5);
        Point point1 = new Point(672,467);
        robot.mouseMove(point1.x, point1.y); // Farenin konumunu ayarla
        ReusableMethods.bekle(5);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama yap
        ReusableMethods.bekle(5);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama bırak
        ReusableMethods.bekle(9);

    }
    @Given("Facebook ikonuna tiklar. Facebook sayfasina gecis yaptiktan sonra tekrar Bimser sayfasina geri donulur.")
    public void facebook_ikonuna_tiklar_facebook_sayfasina_gecis_yaptiktan_sonra_tekrar_bimser_sayfasina_geri_donulur() {

        bimserPage.facebook.click();

        String ilkSayfaWhd= Driver.getDriver().getWindowHandle();

        String ikinciSayfaWhd="";
        Set<String> whdSeti=Driver.getDriver().getWindowHandles();

        for (String each: whdSeti
        ) {
            if (!each.equals(ilkSayfaWhd)){
                ikinciSayfaWhd=each;
            }
        }
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ikinciSayfaWhd);
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ilkSayfaWhd);
    }
    @Given("X ikonuna tiklar. X sayfasina gecis yaptiktan sonra tekrar Bimser sayfasina geri donulur.")
    public void x_ikonuna_tiklar_x_sayfasina_gecis_yaptiktan_sonra_tekrar_bimser_sayfasina_geri_donulur() {
        bimserPage.x.click();
    }
    @Given("Youtube ikonuna tiklanir. Youtube sayfasina gecis yaptiktan sonra tekrar Bimser sayfasina geri donulur.")
    public void youtube_ikonuna_tiklanir_youtube_sayfasina_gecis_yaptiktan_sonra_tekrar_bimser_sayfasina_geri_donulur() {
    }
    @Given("Linkedin ikonuna tiklanir. Linkedin sayfasina gecis yaptiktan sonra tekrar Bimser sayfasina geri donulur.")
    public void linkedin_ikonuna_tiklanir_linkedin_sayfasina_gecis_yaptiktan_sonra_tekrar_bimser_sayfasina_geri_donulur() {
    }
    @Given("Instagram ikonuna tiklanir. Instagram sayfasina gecis yaptiktan sonra tekrar Bimser sayfasina geri donulur.")
    public void ınstagram_ikonuna_tiklanir_ınstagram_sayfasina_gecis_yaptiktan_sonra_tekrar_bimser_sayfasina_geri_donulur() {
    }
    @Given("sayfayi kapatir.")
    public void sayfayi_kapatir() {
        //Driver.quitDriver();
    }
}
