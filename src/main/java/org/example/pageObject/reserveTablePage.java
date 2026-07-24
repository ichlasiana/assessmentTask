package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.ws.WebEndpoint;

public class reserveTablePage {

    public static WebDriver driver;

    public reserveTablePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[text()=\"Make a reservation\"]")
    private WebElement makeBtn;

    @FindBy(xpath = "//button[@id=\"um-reservation-date-picker\"]")
    private WebElement datePicker;

    @FindBy(xpath = "//button[@aria-label=\"14th August 2026\"]")
    private WebElement selectDate;

    @FindBy(xpath = "//div[@class=\" css-jdo2at\"]")
    private WebElement peoplePicker;

    @FindBy(id = "react-select-3-option-6")
    private WebElement selectPeople;

    @FindBy(xpath = "//button[text()=\"Search for a reservation\"]")
    private WebElement searchBtn;

    @FindBy(id = "timeslot-lunch-5")
    private WebElement lunch3PM;

    @FindBy(xpath = "//button[text()=\"2 hours 15 minutes\"]")
    private WebElement clickFullExp;

    @FindBy(xpath = "(//button[@id='item_counter_add'])[3]")
    private WebElement wagyu;

    @FindBy(xpath = "//span[text()='Confirm Selection']")
    private WebElement confirmSupplements;

    @FindBy(xpath = "//input[@placeholder=\"First name\"]")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@placeholder=\"Last name\"]")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@placeholder=\"Mobile number\"]")
    private WebElement inputPhone;

    @FindBy(xpath = "//input[@placeholder=\"Email address\"]")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@name=\"birthday\"]")
    private WebElement inputBirthday;

    @FindBy(xpath = "//input[@placeholder=\"Promo Code\"]")
    private WebElement inputPromoCode;

    @FindBy(xpath = "//textarea[@name=\"notes\"]")
    private WebElement inputNotes;

    @FindBy(xpath = "(//button[@class=\"um-selected-tags__add\"])[1]")
    private WebElement addDietary;

    @FindBy(xpath = "(//label[@class=\"ums-checkbox\"])[22]")
    private WebElement selectADietary;

    @FindBy(xpath = "(//span[text()=\"Special occasions\"])[1]")
    private WebElement selectSpecialOcc;

    @FindBy(xpath = "(//label[@class=\"ums-checkbox\"])[3]") //diganti
    private WebElement selectASpecialOccassion;

    @FindBy(xpath = "//button[text()=\"Save\"]")
    private WebElement saveDietary;

    @FindBy(xpath = "//div[@class=\"um-form-checkbox\"]")
    private WebElement checkPrivacyPolicy;

    @FindBy(xpath = "//span[text()=\"Proceed to add payment details\"]")
    private WebElement proceedToPayment;

    @FindBy(xpath = "//iframe[@title=\"Secure payment input frame\"]")
    private WebElement changeIFrame;

    @FindBy(xpath = "//input[@autocomplete=\"cc-number\"]")
    private WebElement cardNumber;

    @FindBy(xpath = "//input[@autocomplete=\"cc-exp\"]")
    private WebElement expDate;

    @FindBy(xpath = "//input[@name=\"cvc\"]")
    private WebElement cvc;

    @FindBy(xpath = "//span[text()=\"Confirm reservation\"]")
    private WebElement confirmPayment;

    @FindBy(xpath = "//button[text()=\"Yes, join the program\"]")
    private WebElement becomeMember;

    @FindBy(xpath = "//span[text()=\"Done\"]")
    private WebElement doneReserve;

    @FindBy(xpath = "//h4[text()=\"Your reservation is confirmed at \"]")
    private WebElement reserved;

//    @FindBy(xpath = "//button[@id=\"um-reservation-date-picker\"]")
//    private WebElement datePicker;

    public boolean isDisplayed(){
        makeBtn.isDisplayed();
        return true;
    }

    public void clickMakeReservation(){
        makeBtn.click();
    }

    public void setDate() throws InterruptedException{
        datePicker.click();
        Thread.sleep(3000);
        selectDate.click();
    }

    public void setPeople() throws InterruptedException{
        peoplePicker.click();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.scrollToElement(selectPeople).perform();
        selectPeople.click();
    }

    public void clickSearchReservation(){
        searchBtn.click();
    }

    public void availLunch(){
        lunch3PM.click();
    }

    public void fullExperience(){
        clickFullExp.click();
    }

    public void wagyuA5(){
        wagyu.click();
    }

    public void confirmItem(){
        confirmSupplements.click();
    }

    public void contactDetails() throws InterruptedException{
        inputFirstName.sendKeys("Amel");
        Thread.sleep(1000);
        inputLastName.sendKeys("Amel");
        Thread.sleep(1000);
        inputPhone.sendKeys("9393 1947");
        Thread.sleep(1000);
        inputEmail.sendKeys("amel@mail.com");
        Thread.sleep(1000);
        inputBirthday.sendKeys("09/10");
        Thread.sleep(1000);
        inputPromoCode.sendKeys("assessment");
        Thread.sleep(1000);
        inputNotes.sendKeys("No ketchup please");
        Thread.sleep(1000);
        addDietary.click();
        Thread.sleep(1000);
        selectADietary.click();
        Thread.sleep(1000);
        selectSpecialOcc.click();
        Thread.sleep(1000);
        selectASpecialOccassion.click();
        Thread.sleep(1000);
        saveDietary.click();
        Thread.sleep(1000);
        checkPrivacyPolicy.click();
        Thread.sleep(1000);
    }

    public void proceedPay() throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.scrollToElement(proceedToPayment).perform();
        proceedToPayment.click();
        Thread.sleep(5000);
    }

    public void paymentDetail() throws InterruptedException{
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        driver.switchTo().frame(changeIFrame);
        cardNumber.sendKeys("4242 4242 4242 4242");
        Thread.sleep(1000);
        expDate.sendKeys("02/29");
        Thread.sleep(1000);
        cvc.sendKeys("123");
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
    }

    public void setConfirmPayment() throws InterruptedException{
        confirmPayment.click();
        Thread.sleep(5000);
    }


    public void becomeAMember(){
        becomeMember.click();
    }

    public void setDoneReserve(){
        doneReserve.click();
    }

    public void confirmReservation() throws InterruptedException{
        Thread.sleep(1000);
        reserved.isDisplayed();
    }





}
