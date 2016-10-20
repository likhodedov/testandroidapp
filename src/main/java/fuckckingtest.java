import io.selendroid.client.SelendroidDriver;
import io.selendroid.client.TouchAction;
import io.selendroid.client.TouchActionBuilder;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.common.device.DeviceTargetPlatform;

import io.selendroid.standalone.SelendroidConfiguration;
import io.selendroid.standalone.SelendroidLauncher;
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

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by d.lihodedov on 18.10.2016.
 */
public class fuckckingtest {
   public WebDriver driver;

    @Before
    public void setup() throws Exception {

    }

    @Test
    public void test1() throws Exception {
       //--------------------------------------
        // SelendroidConfiguration config = new SelendroidConfiguration();
// Add the selendroid-test-app to the standalone server
       // config.addSupportedApp("src/main/resources/develop.apk");
       // SelendroidLauncher selendroidServer = new SelendroidLauncher(config);
       // selendroidServer.launchSelendroid();
        //-------------------------------------
        SelendroidCapabilities caps = new SelendroidCapabilities("com.movavi.mobile.videoeditor:1.0.4");
        //DesiredCapabilities caps=SelendroidCapabilities.android();
        caps.setEmulator(false);
        caps.setSerial("044a6eeff0cca631"); // NEXUS 5 (D.LIKHODEDOV)

        driver = new SelendroidDriver(caps);
        //caps.setCapability("app-activity", "com.movavi.mobile.videoeditor.ActivitySplash_");
        driver.get("and-activity://com.movavi.mobile.videoeditor.ActivityMain_");
        //driver.findElement(By.id("previewImage")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10000);
        //while (driver.findElements(By.xpath("(//AppCompatImageView[@id='previewImage'])[1]")).size()<0)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //WebElement take = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_done")));
        //WebElement hello = driver.findElement(By.id("previewImage"));
       //builder.moveToElement(hello, 24, 528).click();
/*if (driver.findElements(By.xpath("(//AppCompatImageView[@id='previewImage'])[1]")).size()> 0)
{
        //wait.until(ExpectedConditions.visibilityOf(element1));
        WebElement element1 = driver.findElement(By.xpath("(//AppCompatImageView[@id='previewImage'])[1]"));
        if (element1.isDisplayed()) element1.click();
        //element1.click();
        WebElement element2 = driver.findElement(By.xpath("(//AppCompatImageView[@id='previewImage'])[2]"));
        if (element2.isDisplayed()) element2.click();

        WebElement element3 = driver.findElement(By.xpath("(//AppCompatImageView[@id='previewImage'])[3]"));
        if (element3.isDisplayed()) element3.click();}*/
        checkvideoManager(3);



WebElement next=driver.findElement(By.id("menu_done"));
      next.click();
      /*   WebElement YOUR_MUSIC_CHECK=driver.findElement(By.id("button_your_music"));
        YOUR_MUSIC_CHECK.click();

       WebElement element1 = driver.findElement(By.xpath("(//RelativeLayout[@id='audioItemWrapper'])[1]"));
        element1.click();
        WebElement element2 = driver.findElement(By.xpath("(//RelativeLayout[@id='audioItemWrapper'])[2]"));
        element2.click();*/
AudioItemSelector("App music");

        next.click();
        WebElement element3 = driver.findElement(By.id("button_done"));
        element3.click();
        WebElement element4 = driver.findElement(By.id("menu_export"));
        element4.click();

      //  WebElement element5 = driver.findElement(By.id("menu_export_cancel"));
      //  element5.click();

        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        WebElement taken = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_export_new")));

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

    public void checkvideoManager(int count)  {

        WebElement elem[]=new WebElement[count];
        for (int i=0;i<count;i++) {
            if (driver.findElements(By.xpath("(//AppCompatImageView[@id='previewImage'])["+(i+1)+"]")).size()> 0) {
        elem[i]=driver.findElement(By.xpath("(//AppCompatImageView[@id='previewImage'])["+(i+1)+"]"));
            if(elem[i].isDisplayed()) elem[i].click();
        }
        }
    }

    public void AudioItemSelector(String S) {
            if (S.equals("No music")){
            WebElement YOUR_CHOICE=driver.findElement(By.id("button_no_music"));
            YOUR_CHOICE.click();
        }
        else if (S.equals("Your music")){
            WebElement YOUR_CHOICE=driver.findElement(By.id("button_your_music"));
            YOUR_CHOICE.click();
            WebElement element1 = driver.findElement(By.xpath("(//RelativeLayout[@id='audioItemWrapper'])[1]"));
            element1.click();
        }
        else if (S.equals("App music")){
                WebElement YOUR_CHOICE=driver.findElement(By.id("button_program_music"));
                YOUR_CHOICE.click();

            WebElement element1 = driver.findElement(By.xpath("(//RelativeLayout[@id='audioItemWrapper'])[1]"));
            element1.click();
                //WebElement musictimeline = driver.findElement(By.id("rangeSeekBar"));
              //  TouchActions flick = new TouchActions(driver).flick(musictimeline, 200, 384, 1);

                TouchAction ta = new TouchActionBuilder().pointerDown(48,384).
                        pointerMove(900,384).pointerUp().build();
                ta.perform(driver);
               // TouchAction ta = new TouchActionBuilder().pointerDown(48,384).
                     //  pointerMove(300,400).pointerUp().build();
               //ta2.perform(driver);

        }
    }
}