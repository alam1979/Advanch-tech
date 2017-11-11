package com.util.helper;
/*package com.usa.helper;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.usa.selenium.factory.InverseCumulativePageObject;
import com.usa.rabo.lrm.automation.test.messageBox;

public class SelectScenarios {
	static WebDriver driver;
	static WebElement element;
	static boolean ScenarioExists=false;
	private enum Scenario{
		BASELINE,baseline,CONTRACTUAL,contractual,DNB,dnb,GLOBAL_NAME,global_name,GLOBAL_SYSTEMIC,global_systemic,LOCAL_NAME,local_name,LOCAL_SYSTEMIC,local_systemic,US_COMBINED,us_combined
		
	}
	
public static String getDropdownScenario(WebDriver driver){
	InverseCumulativePageObject icpageobj = PageFactory.initElements(driver, InverseCumulativePageObject.class);
	Scanner scaner=new Scanner(System.in);
	String a=messageBox.infoBox("Please go console and select anyone -BASELINE,CONTRACTUAL,DNB,GLOBAL_NAME,GLOBAL_SYSTEMIC,LOCAL_NAME,LOCAL_SYSTEMIC,US_COMBINED ", "Done");
	System.out.println(a);
	System.out.println("Please select Scenario name");
	String DropdownscenarioName=scaner.nextLine();
	Scenario selectScenario=Scenario.valueOf(DropdownscenarioName);
	//select specifit entity
	selectEntities=Entities.CUSO;
	for (Scenario e:Scenario.values()){
		if(DropdownscenarioName.equalsIgnoreCase(e.name())){
			if(ScenarioExists=true){
				switch(selectScenario){
				case BASELINE:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectBASELINE(), driver);
					element.click();
					System.out.println("BASELINE is selected");
					break;
				case CONTRACTUAL:
				element=ExplicitWait.getExplicitWait(icpageobj.getSelectCONTRUCTUAL(), driver);
				element.click();
				System.out.println("CONTRUCTUAL is selected");
				break;
				case DNB:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectDNB(), driver);
					element.click();
					System.out.println("DNB is selected");
					break;
				case GLOBAL_NAME:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectGLOBAL_NAME(), driver);
					element.click();
					System.out.println("GLOBAL_NAME is selected");
					break;
				case GLOBAL_SYSTEMIC:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectGLOBAL_SYSTEM(), driver);
					element.click();
					System.out.println("GLOBAL_SYSTEMIC is selected");
					break;
				case LOCAL_NAME:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectLOCAL_NAME(), driver);
					element.click();
					System.out.println("LOCAL_NAME is selected");
					break;
				case LOCAL_SYSTEMIC:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectLOCAL_SYSTEM(), driver);
					element.click();
					System.out.println("LOCAL_SYSTEMIC is selected");
					break;
				case US_COMBINED:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectUS_COMBINED(), driver);
					element.click();
					System.out.println("US_COMBINED is selected");
					break;
				case baseline:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectBASELINE(), driver);
					element.click();
					System.out.println("BASELINE is selected");
					break;
				case contractual:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectCONTRUCTUAL(), driver);
					element.click();
					System.out.println("CONTRUCTUAL is selected");
					break;
				case dnb:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectDNB(), driver);
					element.click();
					System.out.println("DNB is selected");
					break;
				case global_name:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectGLOBAL_NAME(), driver);
					element.click();
					System.out.println("GLOBAL_NAME is selected");
					break;
				case global_systemic:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectGLOBAL_SYSTEM(), driver);
					element.click();
					System.out.println("GLOBAL_SYSTEMIC is selected");
					break;
				case local_name:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectLOCAL_NAME(), driver);
					element.click();
					System.out.println("LOCAL_NAME is selected");
					break;
				case local_systemic:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectLOCAL_SYSTEM(), driver);
					element.click();
					System.out.println("LOCAL_SYSTEMIC is selected");
					break;
				case us_combined:
					element=ExplicitWait.getExplicitWait(icpageobj.getSelectUS_COMBINED(), driver);
					element.click();
					System.out.println("US_COMBINED is selected");
					break;
				default:
					System.out.println("No Scenaro is selected");
					break;
				
			}
				
			}
			break;
		}
		
	}
	

if(!ScenarioExists){
	System.out.println("Bcause no such scenario is present in dropdown");
	}
	scaner.close();
	return DropdownscenarioName;

}	
}

*/