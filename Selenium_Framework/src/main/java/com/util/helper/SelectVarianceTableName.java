package com.util.helper;
/*package com.usa.helper;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.usa.selenium.factory.InverseCumulativePageObject;
import com.usa.rabo.lrm.automation.test.messageBox;

public class SelectVarianceTableName {
	
	static WebDriver driver;
	static WebElement element;
	static boolean EntityExists=false;
	private enum Entities{
		CUSO,cuso,CUSOExNYBR,cusoexnybr,DLL,dll,NYBR,nybr,UAH,uah,UAHWS,uahws
	}
	
@SuppressWarnings("resource")
public static String getEntitiy(WebDriver driver){
	InverseCumulativePageObject icpageobj = PageFactory.initElements(driver, InverseCumulativePageObject.class);
	Scanner scaner=new Scanner(System.in);
	String a=messageBox.infoBox("Please go console and select anyone -CUSO,CUSOExNYBR,DLL,NYBR,UAH,UAHWS ", "Done");
	System.out.println(a);
	System.out.println("Please select entity name");
	String ReportingEntityname=scaner.nextLine();
	Entities selectEntities=Entities.valueOf(ReportingEntityname);
	//select specifit entity
	selectEntities=Entities.CUSO;
	for (Entities e:Entities.values()){
		if(ReportingEntityname.equalsIgnoreCase(e.name())){
				switch(selectEntities){
				case CUSO:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectdropDownCUSO(), driver);
					element.click();
					System.out.println("CUSO is selected");
					break;
				case CUSOExNYBR:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectdropDownCUSOExNYBR(), driver);
					element.click();
					System.out.println("CUSOExNYBR is selected");
					break;
				case DLL:
					element=driver.findElement(By.xpath(""));
					element.click();
					System.out.println("CUSO is selected");
					break;
				case NYBR:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectdropDownNYBR(), driver);
					element.click();
					System.out.println("NYBR is selected");
					break;
				case UAH:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectdropDownUAH(), driver);
					element.click();
					System.out.println("UAH is selected");
					break;
				case UAHWS:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectdropDownUAHWS(), driver);
					element.click();
					System.out.println("UAHWS is selected");
					break;
				case cuso:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectdropDownCUSO(), driver);
					element.click();
					System.out.println("CUSO is selected");
					break;
				case cusoexnybr:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectdropDownCUSOExNYBR(), driver);
					element.click();
					System.out.println("CUSOExNYBR is selected");
					break;
				case dll:
					element=driver.findElement(By.xpath(""));
					element.click();
					System.out.println("CUSO is selected");
					break;
				case nybr:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectdropDownNYBR(), driver);
					element.click();
					System.out.println("NYBR is selected");
					break;
				case uah:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectdropDownUAH(), driver);
					element.click();
					System.out.println("UAH is selected");
					break;
				case uahws:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectdropDownUAHWS(), driver);
					element.click();
					System.out.println("UAHWS is selected");
					break;
				default:
					System.out.println("No entity is selected");
					break;
				
				}
				
			}
			break;
		}
	
		
	
	
	//scaner.close();
	return ReportingEntityname;
	
}

	
}
*/