package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIFrameId = "mce_0_ifr";
    private By textArea = By.xpath("//body//p");
    private By decreaseIndentButton = By.xpath("//button[@title='Increase indent']//span[@class='tox-icon tox-tbtn__icon-wrap']//*[name()='svg']");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }
    private void switchToEditArea(){
        driver.switchTo().frame(editorIFrameId);
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
