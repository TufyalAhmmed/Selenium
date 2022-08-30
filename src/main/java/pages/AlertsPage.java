package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggeralertButton = By.xpath("//button[@onclick='jsAlert()']");
    private By triggerConfirmButton = By.xpath("//button[@onclick='jsConfirm()']");
    private By triggerPromptButton = By.xpath("//button[@onclick='jsPrompt()']");

    private By results = By.id("result");
    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggeralertButton).click();
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(results).getText();
    }
}
