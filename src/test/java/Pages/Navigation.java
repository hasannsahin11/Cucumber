package Pages;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends MyMethods {
    public Navigation() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupBtn;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterBtn;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesBtn;

    @FindBy(xpath = "//a[@href='/citizenships/list']")
    private WebElement citizenshipButton;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement feesButton;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsButton;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement entranceExamsSetupBtn;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsInnerBtn;

    @FindBy(xpath = "//span[text()='States']")
    private WebElement statesBtn;

    public WebElement getSetupBtn() {
        return setupBtn;
    }

    public WebElement getParameterBtn() {
        return parameterBtn;
    }

    public WebElement getCountriesBtn() {
        return countriesBtn;
    }

    public WebElement getCitizenshipButton() {
        return citizenshipButton;
    }

    public WebElement getFeesButton() {
        return feesButton;
    }

    public WebElement getEntranceExamsButton() {
        return entranceExamsButton;
    }

    public WebElement getEntranceExamsSetupBtn() {
        return entranceExamsSetupBtn;
    }

    public WebElement getEntranceExamsInnerBtn() {
        return entranceExamsInnerBtn;
    }

    public WebElement getStatesBtn() {
        return statesBtn;
    }
}
