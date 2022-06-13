package SeleniumSessoins;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	static WebDriver driver = null;
	public ElementUtil() {
		// TODO Auto-generated constructor stub
	}

	public ElementUtil(WebDriver driver2) {
		// TODO Auto-generated constructor stub
driver=driver2;
	}

	public  By getBYlocator(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		case "name":
			locator = By.id(locatorValue);
			break;

		case "classname":
			locator = By.id(locatorValue);
			break;

		case "tagname":
			locator = By.id(locatorValue);
			break;

		case "linktext":
			locator = By.id(locatorValue);
			break;

		case "partiallinktext":
			locator = By.id(locatorValue);
			break;

		case "cssselector":
			locator = By.id(locatorValue);
			break;

		default:
			System.out.println("please pass the right locator....");
			break;
		}
		return locator;

	}

	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public  void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public  String doGetElementText(By  locator) {
	return getElement(locator).getText();
	}
	
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public  void doClick(By locator){
		getElement(locator).click();		
	}
	
	public String doGetAttributeValue(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}

	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public void clickOnElementFromSection(By locator, String value) {
		List<WebElement> eleList = getElements(locator);
		System.out.println(eleList.size());

		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println("=================" + text + "==================");
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

	public  void printAllElementsText(By locator) {
		    List<WebElement> eleList =  driver.findElements(locator);		
			for(WebElement e: eleList) {
			//eleTextList.add(e.getText());
			String ele_text =e.getText();
			System.out.println("===============" + ele_text + "===============");

			
		}

	}
	// GENERIC METHOD TO GET THE ELEMENT LIST SHIFT IT TO Eutil CLASS
	public  List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = driver.findElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;

	}
	
	//GENERIC METHOD TO GET THE NO OF ELEMENTS IN THE BROWSER/RIGHTPANEL ETC
	public  int getElementsListCount(By locator) {
		return driver.findElements(locator).size();
	}
	
	//GENERIC METHOD TO SELECT DROPDOWN ITEM WITHOUT SELECT CLASS
	public  void selectValueFromDropDown(By locator,String value) 
	{
		List<WebElement> countryOptions = driver.findElements(locator);
		System.out.println(countryOptions.size());
		for (int i = 0; i < countryOptions.size(); i++) {
			String text = countryOptions.get(i).getText();
			System.out.println("============" + text + "============");
			if (text.contains(value)) {
				countryOptions.get(i).click();
				break;
			}

	}	
		
	}
}
