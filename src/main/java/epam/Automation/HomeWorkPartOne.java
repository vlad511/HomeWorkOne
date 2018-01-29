package epam.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static epam.Automation.HomeWorkPartOne.driver;



public class HomeWorkPartOne {

    public static WebElement userIcon() {
        return driver.findElement(By.className("fa-user"));
    }
    public static WebElement loginField() {
        return driver.findElement(By.id("Login"));
    }
    public static WebElement passwordField() {
        return driver.findElement(By.id("Password"));
    }
    public static WebElement enterButton() {
        return driver.findElement(By.className("fa fa-sign-in"));
    }

    public static WebElement logoutButton(){

        return driver.findElement(By.className("Logout"));
    }

    public static WebElement userName(){

        return driver.findElement(By.cssSelector(".profile-photo span"));
    }


    public static WebElement supportLabel() {

        return driver.findElement(By.xpath("//*[@id='mCSB_1_container']/ul/li"));

    }
    public static WebElement contactFormLabel() {

        return driver.findElement(By.xpath(".//*[@id='mCSB_1_container']"));

    }
    public static WebElement contactFormName() {
        return driver.findElement(By.id("Login"));
    }

    public static WebElement contactFormLastName() {
        return driver.findElement(By.id("Login"));
    }

    public static WebElement contactFormDescription() {
        return driver.findElement(By.id("Login"));
    }






    public static void login(){
        userIcon().click();
        loginField().sendKeys("epam");
        passwordField().sendKeys("1234");
        enterButton().click();
    }
    public static void logout(){
        logoutButton().click();

    }
    public static boolean isLoggedIn(){return userName().isDisplayed();}{

    }

    public static void openSupportPage(){
           supportLabel().click();
    }

    public static void openContactForm(){
           contactFormLabel().click();
    }
    public static void filloutContactForm(){

    }
    public static void submit(){

    }
    public static void verification(){

    }

}
