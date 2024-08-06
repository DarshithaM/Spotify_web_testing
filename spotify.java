package CAProject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ExperimentOne {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver",

"C:\\Users\\haris\\Downloads\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
// Experiment-1: Opening google chrome
driver.get("https://www.google.com");
// Experiment-2: Maximizing browser window
driver.manage().window().maximize();
// Experiment-3: Searching in chrome
driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("spotify"+Keys.ENTER)
;
// Experiment-4: Opening desired link
driver.findElement(By.tagName("h3")).click();
// Experiment-5: Click on login button and login
driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/header/div[4]/div
[2]/button[2]")).click();
// Experiment -6: Fill Credentials
new WebDriverWait(driver,

Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath
("//*[@id=\"login-username\"]"))).sendKeys("darshithamurali.1903@gmail.com");
driver.findElement(By.id("login-password")).sendKeys("Mugaamda19");
driver.findElement(By.id("login-button")).click();
// Experiment-7: Retrieve Login details
String name =
driver.findElement(By.id("login-username")).getAttribute("value");
String pass =
driver.findElement(By.id("login-password")).getAttribute("value");
System.out.println("login id: "+name+", login password: "+pass);
// Experiment-8: Search a playlist

new WebDriverWait(driver,

Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath
("//*[@id=\"main\"]/div/div[2]/div[1]/nav/div[1]/ul/li[2]/a/span"))).click();
Scanner myObj = new Scanner(System.in); // Create a Scanner object
System.out.println("Search: ");
String search = myObj.nextLine(); // Read user input
new WebDriverWait(driver,

Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath
("//*[@id=\"main\"]/div/div[2]/div[3]/header/div[3]/div/div/form/input"))).sendKey
s(search + Keys.ENTER);
// Experiment-9: Click on top preferred playlist
new WebDriverWait(driver,

Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath
("//*[@id=\"searchPage\"]/div/div/section[1]"))).click();
new WebDriverWait(driver,

Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//
*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[2]/main/div[1]/
section/div[2]/div[2]/div[4]/div/div/div/div/div[1]/button"))).click();
// Experiment-10: Stop playing the playlist
driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[2]/div
[2]/div/div/div[2]/main/div[1]/section/div[2]/div[2]/div[4]/div/div/div/div/div[1]
/button")).click();
// Experiment-11: To check if there is an album cover on the playlist
boolean cover =

driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[2]/div
[2]/div/div/div[2]/main/div[1]/section/div[1]/div[4]/div/div/img")).isDisplayed();
if(cover == true) {
System.out.println("Cover is available");
}else {
System.out.println("Cover is not available");
}
// Experiment-12: Adding playlist to favourites and checking if it is in
favourites
driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[2]/div
[2]/div/div/div[2]/main/div[1]/section/div[2]/div[2]/div[4]/div/div/div/div/button
[1]")).click();
boolean fav =

driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[2]/div
[2]/div/div/div[2]/main/div[1]/section/div[2]/div[2]/div[4]/div/div/div/div/button
[1]")).isEnabled();
if(fav == true) {
System.out.println("Playlist added to favourite");
}else {
System.out.println("Playlist not added to favourite");
}
//Experiment-13: Opening dropdown menu and removing playlist from
dropdown
driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[2]/div
[2]/div/div/div[2]/main/div[1]/section/div[2]/div[2]/div[4]/div/div/div/div/button
[2]")).click();

//driver.findElement(By.xpath("//*[@id=\"context-menu\"]/ul/li[1]/button")).click(
);
//Experiment-14: check notification
driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/header/div[4]/but
ton[2]")).click();
//Experiment-15: Clear Search
new WebDriverWait(driver,

Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//
*[@id=\"main\"]/div/div[2]/div[3]/header/div[2]/button[1]"))).click();

new WebDriverWait(driver,

Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//
*[@id=\"main\"]/div/div[2]/div[3]/header/div[2]/button[1]"))).click();

new WebDriverWait(driver,

Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//
*[@id=\"main\"]/div/div[2]/div[3]/header/div[3]/div/div/form/input"))).clear();
//Experiment-16: Logout
driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/header/div[4]/but
ton[2]")).click();
driver.findElement(By.xpath("//*[@id=\"context-menu\"]/div/ul/li[5]/button")).clic
k();
}
}