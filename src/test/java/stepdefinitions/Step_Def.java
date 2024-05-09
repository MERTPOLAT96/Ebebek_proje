package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Ebebek_Locators;
import static org.junit.Assert.*;

public class Step_Def {

    Ebebek_Locators page=new Ebebek_Locators();


    @Given("go to ebebek apk")
    public void goToEbebekApk() {



    }

    @Then("choose categories")
    public void chooseCategories() {

        page.categorybutton.click();
        page.babyroom.click();
        page.babybed.click();


    }

    @When("click the filters and do it all missions")
    public void clickTheFiltersAndDoItAllMissions() {
        page.filters.click();
        page.fiyataraligi.click();
        page.fiyataraligisecildi.click();
        page.uygulabutonu.click();
        page.urunlerigorbutonu.click();
    }

    @And("Select Highly Reviewed from the list and add the first product to the cart.")
    public void selectHighlyReviewedFromTheListAndAddTheFirstProductToTheCart() {
        page.siralabutonu.click();
        page.cokdegerlendirilenler.click();
        page.sepeteEkle.click();
    }

    @And("You go to the cart, increase the number of items and check the price.")
    public void youGoToTheCartIncreaseTheNumberOfItemsAndCheckThePrice() {
        page.sepeteTikla.click();
        page.urunArttir.click();
        assertTrue(page.fiyatDogrula.isDisplayed());
    }

    @Then("Click the “Complete Shopping” button.")
    public void clickTheCompleteShoppingButton() {
        page.alisverisiSonlandir.click();
    }
}
