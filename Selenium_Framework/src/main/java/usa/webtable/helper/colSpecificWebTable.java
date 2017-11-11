package usa.webtable.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.usa.automation.factory.browserFactory;

public class colSpecificWebTable {
	static WebDriver driver;
	public static ArrayList<String> getcolValue(String browserName,String URL,String WebTableXpath,int colmnIndex) throws InterruptedException{
	
	driver =browserFactory.getBrowser(browserName,driver);
	//driver.get("https://www.nasdaq.com/symbol/ab//institutional-holdings/");
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//WebElement table =driver.findElement(By.xpath(".//*[@id='quotes_content_left_pnlInsider']"));
	WebElement table =driver.findElement(By.xpath(WebTableXpath));
	List<WebElement> rows = table.findElements(By.xpath(".//tr"));
	ArrayList<String>Webcolumdata =new ArrayList<String>();
	for(int rnum=0;rnum<rows.size();rnum++){
		List<WebElement> columns=rows.get(rnum).findElements(By.xpath(".//td["+colmnIndex+"]"));
		for(int cnum=0;cnum<columns.size();cnum++){
			Webcolumdata.add(columns.get(cnum).getText());
	}
	}
	System.out.println(Webcolumdata);
	System.out.println("WebTable Total Buckets =  "+Webcolumdata.size());
	
	driver.close();
	return Webcolumdata;
}
}