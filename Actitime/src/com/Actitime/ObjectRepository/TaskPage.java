package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	//declaration
	
	//@FindBy(id ="container_tasks")
	//private WebElement taskbtn;
	
	@FindBy(xpath ="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath ="//div[.='+ New Customer']")
	private WebElement newcusbtn;
	
	@FindBy(xpath ="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath ="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesc;
	
	@FindBy(xpath ="//div[.='Create Customer']")
	private WebElement crecust;
	
	@FindBy(xpath ="//div[@class='greyButton cancelBtn']")
	private WebElement canclbtn;
	
	//initialazation
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
	//utilization
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcusbtn() {
		return newcusbtn;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesc() {
		return custdesc;
	}

	public WebElement getCrecust() {
		return crecust;
	}

	public WebElement getCanclbtn() {
		return canclbtn;
	}
	
	
	
	
	

}
