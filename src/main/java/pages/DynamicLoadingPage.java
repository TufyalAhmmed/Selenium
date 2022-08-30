package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpath_Format = "//a[normalize-space()='Example 1: Element on page that is hidden']";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);

    }

}
