package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BimserPage {

    public BimserPage(){

       PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@class='pix-header-phone text-sm d-inline-block2 pix-header-text d-inline-flex align-items-center pix-py-5 text-primary mb-0']")
    public WebElement telefon;

    @FindBy(linkText = "info@bimser.com")
    public WebElement mail;

    @FindBy(className = "pixicon-facebook3 px-2")
    public WebElement facebook;


    @FindBy(xpath = "//i[@class='pixicon-x-twitter px-2']")
    public WebElement x;
}
