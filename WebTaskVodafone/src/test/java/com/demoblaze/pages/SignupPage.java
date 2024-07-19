package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignupPage extends BasePage {
    @FindBy(id = "signin2")
    public WebElement l_SignupBtnHome;
    @FindBy(id = "sign-username")
    public WebElement l_Signupusername;
    @FindBy(id = "sign-password")
    public WebElement l_Signuppassword;
    @FindBy(xpath = "//button[contains(text(), 'Sign up')]")
    public WebElement l_SignupBtn;

    // public By signupButton = By.xpath("//button[contains(text(), 'Sign up')]");


    public void signup(String username, String password) {
        l_SignupBtnHome.click();
        l_Signupusername.sendKeys(username);
        l_Signuppassword.sendKeys(password);
        l_SignupBtn.click();
    }


    public void verifySuccessCredentailsPopUpMessage(String exceptedMessage) {
        alert = wait.until(ExpectedConditions.alertIsPresent());
        alert = Driver.get().switchTo().alert();
        //alert.accept();
        String actualMessage = alert.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(exceptedMessage, actualMessage);
    }


}


