package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
	WebElement elementUsername =driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
		
	WebElement elementPassword =driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
		
	WebElement elementLogin =driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	
	WebElement elementCRMSFA =driver.findElement(By.linkText("CRM/SFA"));
	elementCRMSFA.click();
	
	WebElement elementLeads = driver.findElement(By.linkText("Leads"));
	elementLeads.click();
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		WebElement elementCompanyName =driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("DemoCompany");
		
		WebElement elementFirstName =driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("DemofirstName");
		
		WebElement elementLastName =driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("DemolastName");
		
		WebElement elementDepartment =driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartment.sendKeys("Testing Engineer");
		
		WebElement elementDescription =driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("DemoTestLeaf Assessment");
		
		WebElement elementEmail =driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("demo@gmail.com");
		
		WebElement elementStateProvince =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateprovinceName = new Select(elementStateProvince);
		  stateprovinceName.selectByVisibleText("New York");
		  
		  WebElement elementSubmitbutton = driver.findElement(By.name("submitButton"));
			elementSubmitbutton.click();
			
			System.out.println(driver.getTitle());
			
			WebElement elementDuplicateLead = driver.findElement(By.linkText("Duplicate Lead"));
			elementDuplicateLead.click();
			
			WebElement elementCompanyName1 =driver.findElement(By.id("createLeadForm_companyName"));
			elementCompanyName1.clear();
			
			WebElement elementCompanyName2 =driver.findElement(By.id("createLeadForm_companyName"));
			elementCompanyName2.sendKeys("DemoDuplicateCompany");
			
			WebElement elementFirstName1 =driver.findElement(By.id("createLeadForm_firstName"));
			elementFirstName1.clear();
		
			
			WebElement elementFirstName2 =driver.findElement(By.id("createLeadForm_firstName"));
			elementFirstName2.sendKeys("DemoDuplicatefirstName");
			
			  WebElement elementSubmitbutton1 = driver.findElement(By.name("submitButton"));
				elementSubmitbutton1.click();
				
				System.out.println(driver.getTitle());
			
		
	}

}

