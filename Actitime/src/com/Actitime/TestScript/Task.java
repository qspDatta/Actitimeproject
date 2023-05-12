package com.Actitime.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.Filelibrary;
import com.Actitime.ObjectRepository.HomePage;
import com.Actitime.ObjectRepository.TaskPage;

public class Task extends Baseclass{
	
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getTasktab().click();
		
		TaskPage tp=new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcusbtn().click();
		
		Filelibrary f=new Filelibrary();
		String createcustomer = f.readDataFromExcel("Sheet1", 1, 1);
		String value1 = f.readDataFromExcel("Sheet1", 1, 2);
		tp.getCustname().sendKeys(createcustomer);
		tp.getCustdesc().sendKeys(value1);
		tp.getCrecust().click();
		String expectedresult = createcustomer;
		String actualresult = driver.findElement(By.xpath("(//div[.='"+createcustomer+"'])[2]")).getText();//concatenation
		SoftAssert s=new SoftAssert();
		s.assertEquals(expectedresult, actualresult);
		s.assertAll();
		
		
		
		
		
		
		
		
	}

}
