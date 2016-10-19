import io.selendroid.client.SelendroidDriver;
import io.selendroid.client.TouchAction;
import io.selendroid.client.TouchActionBuilder;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.common.device.DeviceTargetPlatform;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by d.lihodedov on 18.10.2016.
 */
public class fuckckingtest {
    WebDriver driver;

    @Before
    public void setup() throws Exception {
    }

    @Test
    public void test1() throws Exception {
        SelendroidCapabilities caps = new SelendroidCapabilities("com.movavi.mobile.videoeditor:1.0.3");
        //DesiredCapabilities caps=SelendroidCapabilities.android();
        caps.setEmulator(false);
        caps.setSerial("044a6eeff0cca631"); // NEXUS 5 (D.LIKHODEDOV)
        // caps.setCapability("app-wait-activity", "com.peddle.buyer.BuyerHomeActivity");
        driver = new SelendroidDriver(caps);
        //caps.setCapability("app-activity", "com.movavi.mobile.videoeditor.ActivitySplash_");
        driver.get("and-activity://com.movavi.mobile.videoeditor.ActivityMain_");
        //driver.findElement(By.id("previewImage")).click();
        //WebDriverWait wait = new WebDriverWait(driver, 30);
        //while (driver.findElements(By.xpath("(//AppCompatImageView[@id='previewImage'])[1]")).size()<0)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //WebElement take = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_done")));
        //WebElement hello = driver.findElement(By.id("previewImage"));
       //builder.moveToElement(hello, 24, 528).click();
if (driver.findElements(By.xpath("(//AppCompatImageView[@id='previewImage'])[1]")).size()> 0)
{

        //wait.until(ExpectedConditions.visibilityOf(element1));
        WebElement element1 = driver.findElement(By.xpath("(//AppCompatImageView[@id='previewImage'])[1]"));
        if (element1.isDisplayed()) element1.click();
        //element1.click();
        WebElement element2 = driver.findElement(By.xpath("(//AppCompatImageView[@id='previewImage'])[2]"));
        if (element2.isDisplayed()) element2.click();

        WebElement element3 = driver.findElement(By.xpath("(//AppCompatImageView[@id='previewImage'])[3]"));
        if (element3.isDisplayed()) element3.click();}

WebElement next=driver.findElement(By.id("menu_done"));
      next.click();
        WebElement YOUR_MUSIC_CHECK=driver.findElement(By.id("button_your_music"));
        YOUR_MUSIC_CHECK.click();
        //next.click();


        //element2.click();
        //hello.click();
        //hello.getLocation();
        //getLocationofElem(hello);
        //-----------
        //WebElement element3 = driver.findElement(By.xpath("(//ProgressBar[@id='progressBar'])[1]"));
       // element3.click();

//WebElement elem[]=new WebElement[5];


       // driver.findElement(By.id("previewImage")).click();

        //take.click();
       // WebDriverWait waits = new WebDriverWait(driver, 10);
        //WebElement taken = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_done")));
        //String s = new String();
        //caps.setCapability("app-wait-activity", "com.movavi.mobile.videoeditor.ActivityMain_");
        //WebElement tag = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_done")));
    }

    @After
    public void end() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void getLocationofElem(WebElement element){
        Point point = element.getLocation();
        int xcord = point.getX();
        System.out.println("Element's Position from left side Is "+xcord +" pixels.");
        int ycord = point.getY();
        System.out.println("Element's Position from top side Is "+ycord +" pixels.");
    }

    public void checkvideoManager(int count) {

    }
}