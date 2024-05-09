package pages;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Ebebek_Locators {

    public Ebebek_Locators(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);

    }

    @AndroidFindBy(uiAutomator ="new UiSelector().text(\"Kategoriler\")" )
    public WebElement categorybutton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Bebek Odası\")")
    public WebElement babyroom;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RelativeLayout\").instance(3)")
    public WebElement babybed;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Filtrele\")")
    public WebElement filters;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Fiyat Aralığı\")")
    public WebElement fiyataraligi;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"500 - 1000 TL (6)\")")
    public WebElement fiyataraligisecildi;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Uygula\")")
    public WebElement uygulabutonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Ürünleri Gör\")")
    public WebElement urunlerigorbutonu;

    @AndroidFindBy(uiAutomator="new UiSelector().text(\"Sırala\")")
    public WebElement siralabutonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Çok Değerlendirilenler\")")
    public WebElement cokdegerlendirilenler;

    @AndroidFindBy(xpath = "(//android.widget.Button[@resource-id=\"com.solidict.ebebek:id/btAddToCart_\"])[1]")
    public WebElement sepeteEkle;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.solidict.ebebek:id/navigation_bar_item_icon_view\").instance(2)")
    public WebElement sepeteTikla;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
    public WebElement urunArttir;

    @AndroidFindBy(id = "com.solidict.ebebek:id/textView_CartProduct_Price")
    public WebElement fiyatDogrula;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Alışverişi Tamamla\")")
    public WebElement alisverisiSonlandir;
}
