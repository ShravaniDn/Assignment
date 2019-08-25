package MyProj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment1 
{ @Test
	//public static void main(String[] args) throws Exception
	public void call() throws Exception
	{
		//FileInputStream fin= new FileInputStream("F:\\shravani\\sample.xlsx");
		//XSSFWorkbook wb=new XSSFWorkbook(fin);
		//XSSFSheet ws=wb.getSheet("Sheet2");
		//Row row;
		Boolean flag = true;
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demos.devexpress.com/ASPxNavigationAndLayoutDemos/TabControl/TabScrolling.aspx");
		WebElement w = driver.findElement(By.xpath("//ul[@id='ContentHolder_ASPxPageControl1_TC']"));
		List<WebElement> lst = w.findElements(By.xpath("li[contains(@class,'dxtc-tab')]/a/span"));
		Thread.sleep(2000);
		
		try
		{
			while(flag)
		  {
			//lst = w.findElements(By.xpath("//span[@dx-vam]"));
			flag = lst.get(0).isDisplayed()== false;
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='ContentHolder_ASPxPageControl1_SBL']")).click();
			Thread.sleep(3000);
			//lst = w.findElements(By.xpath("//span[@class='dx-vam']"));
		}
		}
			
			catch (Exception e) {
				// TODO: handle exception
			}
		for(int i=0;i<lst.size();i++)
		{
			lst.get(i).click();
			Thread.sleep(3000);
		}
		driver.close();
}    
	}
