package step_definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.reserveTablePage;
import org.openqa.selenium.WebDriver;

public class reserveSteps {
    private WebDriver webDriver;

    public reserveSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the website KWC Automated")
    public void openWebsite() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.isDisplayed();
        Thread.sleep(3000);

    }

    @When("User select 'Make a Reservation' button")
    public void reserveTableRestaurant() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.clickMakeReservation();
        Thread.sleep(3000);
    }

    @And("User select an available date")
    public void selectDate() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.setDate();
        Thread.sleep(3000);
    }

    @And("User select guests to 7 people")
    public void selectPeople() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.setPeople();
        Thread.sleep(3000);
    }

    @And("User select 'Search for Reservation' button")
    public void searchTable() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.clickSearchReservation();
        Thread.sleep(3000);
    }

    @And("User select at 03.00 PM for Lunch")
    public void lunchTime() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.availLunch();
        Thread.sleep(3000);
    }

    @And("User select '2 Hours 15 Minutes' in full experience section")
    public void clickFullExperience() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.fullExperience();
        Thread.sleep(3000);
    }

    @And("User select 'A5 Wagyu Brisket' for reservation supplements")
    public void clickA5Wagyu() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.wagyuA5();
        Thread.sleep(3000);
    }

    @And("User select 'Confirm Selection' button")
    public void confirmSelection() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.confirmItem();
        Thread.sleep(3000);
    }
    @And("User input all required field, Dietary Restriction and Special Occasion in reservation details")
    public void inputReservationDetails() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.contactDetails();
        Thread.sleep(3000);
    }

    @And("User select 'Proceed to add payment details' button")
    public void clickProceedPay() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.proceedPay();
        Thread.sleep(3000);
    }

    @And("User input all required field in payment details")
    public void inputAllField() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.paymentDetail();
        Thread.sleep(3000);
    }

    @And("User select 'Confirm Reservation' button")
    public void clickConfirmPayment() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.setConfirmPayment();
        Thread.sleep(3000);
    }

    @And("User want to become a member, and select 'Yes, join the program'")
    public void beAMember() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.becomeAMember();
        Thread.sleep(3000);
    }

    @And("User select 'Done' button")
    public void confirmedReservation() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.setDoneReserve();
        Thread.sleep(3000);
    }

    @Then("User already confirmed for reservation")
    public void doneReservation() throws InterruptedException{
        reserveTablePage reserveTablePage = new reserveTablePage(webDriver);
        reserveTablePage.confirmReservation();
        Thread.sleep(3000);
    }

}
