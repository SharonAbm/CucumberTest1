package stepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {
	WebDriver driver;
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/login");

	}
	//@When("User enters login credential")
	//public void user_enters_login_credential(){
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
		//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
//}
	
	//@When("User enters {string} and {string}")
	//public void user_enters_and(String strUser,String strPwd){
		//driver.findElement(By.id("username")).sendKeys(strUser);
		//driver.findElement(By.id("password")).sendKeys(strPwd);
		//driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();}
	
	//@When("User enters login credentials")
	//public void user_enters_login_credentials(DataTable dataTable) {
		//List<List<String>> users =dataTable.asLists();
//		user1 - uname,pwd
//		user1 - uname,pwd
		//String strUser =users.get(0).get(0);
		//String strPwd =users.get(0).get(1);
		//driver.findElement(By.id("username")).sendKeys(strUser);
		//driver.findElement(By.id("password")).sendKeys(strPwd);
		//driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();}
	
	@When("User enters login credentials")
	public void user_enters_login_credentials(DataTable dataTable) {
		List<Map<String,String>> users =dataTable.asMaps();
//		user1 - uname,pwd
//		user1 - uname,pwd
		String strUser =users.get(0).get("username");
		String strPwd =users.get(0).get("password");
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.id("password")).sendKeys(strPwd);
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	
	}
	@Then("Should display Home Page")
	public void should_display_home_page() {
		boolean isValidUser = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isValidUser);

	}

}
