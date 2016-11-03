import io.selendroid.client.SelendroidDriver;
import io.selendroid.client.TouchAction;
import io.selendroid.client.TouchActionBuilder;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.standalone.SelendroidConfiguration;
import io.selendroid.standalone.SelendroidLauncher;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

/**
 * Created by d.lihodedov on 18.10.2016.
 */
public class fuckckingtest {


    public static void main(String args[]) throws Exception{
        WebDriver driver;
        String current = new java.io.File( "." ).getCanonicalPath();
        System.out.println("Current dir:"+current);
        SelendroidConfiguration config = new SelendroidConfiguration();
        //Add the selendroid-test-app to the standalone server
        config.addSupportedApp("C:\\Users\\d.lihodedov\\IdeaProjects\\testandroidapp\\src\\main\\resources\\fortest.apk");

        SelendroidLauncher selendroidServer = new SelendroidLauncher(config);
        selendroidServer.launchSelendroid();
        //-------------------------------------
        SelendroidCapabilities caps = new SelendroidCapabilities("com.movavi.mobile.videoeditor:1.0.4");
        caps.setEmulator(false);

        caps.setSerial("8e34c2ad");
        driver = new SelendroidDriver(caps);
        driver.get("and-activity://com.movavi.mobile.videoeditor.ActivityMain_");
        WebDriverWait wait = new WebDriverWait(driver, 10000);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        checkvideoManager(3,driver);
        WebElement next=driver.findElement(By.id("menu_done"));
        next.click();
        AudioItemSelector("App music",driver);
        next.click();
        WebElement element3 = driver.findElement(By.id("button_done"));
        element3.click();
        WebElement element4 = driver.findElement(By.id("menu_export"));
        element4.click();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        WebElement taken = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_export_new")));
        if (driver != null) {
            driver.quit();
   }}

    public static void checkvideoManager(int count, WebDriver driver)  {

        WebElement elem[]=new WebElement[count];
        for (int i=0;i<count;i++) {
            if (driver.findElements(By.xpath("(//AppCompatImageView[@id='previewImage'])["+(i+1)+"]")).size()> 0) {
        elem[i]=driver.findElement(By.xpath("(//AppCompatImageView[@id='previewImage'])["+(i+1)+"]"));
                if(elem[i].isDisplayed()) elem[i].click();
        } else driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    public static void AudioItemSelector(String S, WebDriver driver) {
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

                WebElement element1 = driver.findElement(By.xpath("//RangeSeekBar[@id='rangeSeekBar']"));
                element1.click();
                //getLocationofElem(element1);
                pairvalues coordinates=getLocationofElem(element1);
            TouchAction ta = new TouchActionBuilder().pointerDown(coordinates.getXcoord(),coordinates.getYcoord()).
            pointerMove(coordinates.getXcoord()+coordinates.getXcoord()*3,coordinates.getYcoord()).pointerUp().build();
            ta.perform(driver);
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                     }
    }
    public static pairvalues getLocationofElem(WebElement element){
        Point point = element.getLocation();
        pairvalues Coordinates=new pairvalues(point.getX(),point.getY());
        return Coordinates;
    }
    public String DeviceSelector(String NameofDevice){
        String outputSerial=new String();
        if (NameofDevice.equals("Nexus_5")) outputSerial="044a6eeff0cca631";
        else if (NameofDevice.equals("Samsung_Galaxy_Tab_4")) outputSerial="61ac735d07d7de10";
        else if (NameofDevice.equals("Huawei_MediaPad_M2")) outputSerial="36E6R15925001108";
        //else if (NameofDevice.equals("Nexus_5X")) outputSerial="00bd9f1ce5b6b398";
        else if (NameofDevice.equals("Lenovo_S60")) outputSerial="1376deea";
        else if (NameofDevice.equals("Lenovo_S860")) outputSerial="error";
        else if (NameofDevice.equals("Asus_ZenFone_5")) outputSerial="ECAZCY02W348";
        else if (NameofDevice.equals("Asus_ZenFone2_Laser")) outputSerial="";
        else if (NameofDevice.equals("Samsung_J5")) outputSerial="8e34c2ad";
return outputSerial;
    }
}