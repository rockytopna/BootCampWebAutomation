package amazon;

import base.CommonAPI;
import org.testng.annotations.Test;

public class HomepageOnlineShopping extends CommonAPI {

    @Test
    public void clickOnAccount() {
        clickOnElement("nav-link-accountList");
        sleepFor(3);

    }

    @Test
    public void clickOnOrders() {
        clickOnElement("nav-orders");

    }

    @Test
    public void searchBook() {
        typeOnElement("twotabsearchtextbox", "Iphone");
        clickOnElement("//input[@type='submit' and @value='Go']");
    }

    @Test
    public void todaysDealTest() {
        clickOnElement("//a[contains(text(),\"Today's Deals\")]");

    }

    @Test
    public void dealFashion() {
        todaysDealTest();
        clickOnElement("//span[@class='a-size-small a-color-base faceoutText aok-block'][contains(text(),'Fashion')]");

    }

    @Test
    public void seeDatailforFashion() {
        dealFashion();
        clickOnElement("//a[@id='101 e84ad748-announce']");

    }

    @Test
    public void wholeFoods() {
        clickOnElement("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Whole Foods')]");

    }

    @Test
    public void getWeeklyDealFeedback() {
        wholeFoods();
    }

    @Test //(priority = 1)
    public void amazonCareerfulfillmentjobs() {
        clickOnElement("//a[contains(text(),'Careers')]");
        sleepFor(2);
        clickOnElement("//a[contains(text(),'View fulfillment jobs')]");
    }

    @Test(enabled = false)
    public void sellInAamaon() {
        clickOnElement("//li[@class='nav_first']//a[@class='nav_a'][contains(text(),'Sell on Amazon')]");

    }

    @Test(enabled = false)
    public void signUpforSeller() {
        sellInAamaon();
        sleepFor(2);
        clickOnElement("//div[@id='Sign_up_h']//a[contains(@class,'button button-type-primary font-size-xlarge')][contains(text(),'Sign up')]");

    }

    @Test(priority = 1)//(enabled = false)
    public void getcustomerService() {
        clickOnElement("//a[contains(text(),'Customer Service')]");
        sleepFor(2);
        clickOnElement("//a[@class='active']");

    }


     @Test //(priority = 1)
    public void amazonPopup (){
        clickOnElement("Amazon Music");

     }

    }


