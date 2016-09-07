import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CookieHandling {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		Set <Cookie> cookies = driver.manage().getCookies();
		System.out.println("Total cookies " + cookies.size());
		Iterator <Cookie>iter = cookies.iterator();
		while(iter.hasNext()){
			Cookie c = iter.next();
			System.out.println(c.getDomain() + " -7- " + c.getName() + " -- " + c.getValue());
		}
		//driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("utmz");//not working still showing all cookies
	
		 cookies = driver.manage().getCookies();
		System.out.println("Total cookies " + cookies.size());
		iter = cookies.iterator();
		while(iter.hasNext()){
			Cookie c = iter.next();
			System.out.println(c.getDomain() + " -7- " + c.getName() + " -- " + c.getValue());
		}
	}

}
