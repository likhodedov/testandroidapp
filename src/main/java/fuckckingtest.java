import io.selendroid.client.SelendroidDriver;
import io.selendroid.client.TouchAction;
import io.selendroid.client.TouchActionBuilder;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.standalone.SelendroidConfiguration;
import io.selendroid.standalone.SelendroidLauncher;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.touch.TouchActions;
/**
 * Created by d.lihodedov on 18.10.2016.
 */

public class fuckckingtest {
    WebDriver driver;
    SelendroidConfiguration config = new SelendroidConfiguration();
    SelendroidCapabilities caps = new SelendroidCapabilities("com.movavi.mobile.videoeditor:1.1");

    @Before
    public void initializeSelendroid() throws Exception {
        config.addSupportedApp("C:\\test\\testapp2.apk");
        SelendroidLauncher selendroidServer = new SelendroidLauncher(config);
        selendroidServer.launchSelendroid();
        caps.setEmulator(false);
        driver = new SelendroidDriver(caps);
        driver.get("and-activity://com.movavi.mobile.videoeditor.ActivityMain_");
        caps.setSerial(DeviceSelector("Samsung_Galaxy_Tab_4"));
    }


@Test
    public void WorkSpaceTest() throws Exception{

        WebDriverWait wait = new WebDriverWait(driver, 10000);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//--------------ДОБАВЛЕНИЕ ВИДЕО В ПРОЕКТ-----------------------
        checkvideoManager(4,1,driver);
        WebElement next=driver.findElement(By.id("menu_done"));
        next.click();
//--------------ДОБАВЛЕНИЕ АУДИО В ПРОЕКТ-----------------------
    AudioItemSelector("App music",driver);
    next.click();
    WebElement element3 = driver.findElement(By.id("button_done"));
    element3.click();
//--------------ВОСПРОИЗВЕДЕНИЕ ВИДЕО-----------------------
    WebElement PlayVideo = driver.findElement(By.id("buttonPlay"));
    PlayVideo.click();
    WebElement Split= driver.findElement(By.id("splitButton"));
    WebElement Crop = driver.findElement(By.id("menu_crop"));
    WebElement playSeekBar=driver.findElement(By.id("playSeekBar"));
    pairvalues bar=getLocationofElem(playSeekBar);
    PlayVideoStart(driver,PlayVideo);
//--------------РАЗРЕЗКА ТРЕКА НА СЕРЕДИНЕ ТАЙМЛАЙНА,ИЗМЕНЕНИЕ СООТНОШЕНИЯ СТОРОН И ВОСПРОИЗВЕДЕНИЕ-----------------------
    TouchAction ta = new TouchActionBuilder().pointerDown(bar.getXcoord(),bar.getYcoord()).
            pointerMove(bar.getXcoord()+playSeekBar.getSize().getWidth()/2,bar.getYcoord()).pointerUp().build();
    ta.perform(driver);
    Split.click();
    Crop.click();
    PlayVideo.click();
    PlayVideoStart(driver,PlayVideo);
//--------------РАЗРЕЗКА ТРЕКА НА 3/4 ТАЙМЛАЙНА,ИЗМЕНЕНИЕ СООТНОШЕНИЯ СТОРОН И ВОСПРОИЗВЕДЕНИЕ----------------------------
    pairvalues bar2=getLocationofElem(playSeekBar);
    TouchAction tb = new TouchActionBuilder().pointerDown(bar2.getXcoord(),bar2.getYcoord()).
            pointerMove(bar2.getXcoord()+playSeekBar.getSize().getWidth()-playSeekBar.getSize().getWidth()/4,bar2.getYcoord()).pointerUp().build();
    tb.perform(driver);
    Split.click();
    Crop.click();
    PlayVideo.click();
    PlayVideoStart(driver,PlayVideo);
//--------------ОБРЕЗКА ВИДЕО С ОБОИХ КРАЕВ-----------------------
    WebElement ChangeDurationVideoItem = driver.findElement(By.xpath("(//RangeSeekBar[@id='rangeSeekBar'])[1]"));
pairvalues coordinatesofChangeDurationVideoItem=getLocationofElem(ChangeDurationVideoItem);
    TouchAction tj = new TouchActionBuilder().pointerDown(coordinatesofChangeDurationVideoItem.getXcoord(),coordinatesofChangeDurationVideoItem.getYcoord()).
            pointerMove(coordinatesofChangeDurationVideoItem.getXcoord()+coordinatesofChangeDurationVideoItem.getXcoord(),coordinatesofChangeDurationVideoItem.getYcoord()).pointerUp().build();
    tj.perform(driver);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    TouchAction tk = new TouchActionBuilder().pointerDown(coordinatesofChangeDurationVideoItem.getXcoord()+ChangeDurationVideoItem.getSize().getWidth()-1,coordinatesofChangeDurationVideoItem.getYcoord()).
            pointerMove(coordinatesofChangeDurationVideoItem.getXcoord()+ChangeDurationVideoItem.getSize().getWidth()-ChangeDurationVideoItem.getSize().getWidth()/4,coordinatesofChangeDurationVideoItem.getYcoord()).pointerUp().build();
    tk.perform(driver);
//--------------ИЗМЕНЕНИЕ ПОЗИЦИИ ПЕРВОГО ВИДЕОТРЕКА-----------------------
    WebElement moveVideo=driver.findElement(By.id("reorder_handle"));
    pairvalues coordmoveVideo=getLocationofElem(moveVideo);
    TouchAction tp = new TouchActionBuilder().pointerDown(coordmoveVideo.getXcoord(),coordmoveVideo.getYcoord()).
            pointerMove(coordmoveVideo.getXcoord(),coordmoveVideo.getYcoord()+moveVideo.getSize().getHeight()*2).pointerUp().build();
    tp.perform(driver);
    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);


//--------------ПРОЛИСТЫВАНИЕ СПИСКА ДОБАВЛЕННЫХ ВИДЕО ДЛЯ НАЖАТИЯ КНОПКИ "+"(ДОБАВЛЕНИЕ ВИДЕО)-----------------------
    WebElement item1 = driver.findElement(By.xpath("(//LinearLayout[@id='item_layout'])[1]"));
    pairvalues item=getLocationofElem(item1);
        TouchAction tr = new TouchActionBuilder().pointerDown(item.getXcoord(),item.getYcoord()).
                pointerMove(item.getXcoord(),0).pointerUp().build();
        tr.perform(driver);
//--------------ДОБАВЛЕНИЕ ВИДЕО В ПРОЕКТ-----------------------
    WebElement AddNewVideo=driver.findElement(By.id("buttonAdd"));
    AddNewVideo.click();
    checkvideoManager(1,5,driver);

    WebElement element1 = driver.findElement(By.xpath("//ActionMenuItemView[@id='menu_done']"));
    element1.click();
//--------------ОТКРЫТИЕ СВОЙСТВ ВИДЕО-----------------------
    WebElement itemtodelandcopy=driver.findElement(By.xpath("(//LinearLayout[@id='item_layout'])[1]"));
    pairvalues todelandcopy=getLocationofElem(itemtodelandcopy);
    TouchAction th = new TouchActionBuilder().pointerDown(todelandcopy.getXcoord(),todelandcopy.getYcoord()).
            pointerMove(todelandcopy.getXcoord()+itemtodelandcopy.getSize().getWidth(),todelandcopy.getYcoord()).pointerUp().build();
    th.perform(driver);
//--------------КОПИРОВАНИЕ ВИДЕОДОРОЖКИ-----------------------
    WebElement buttoncopy = driver.findElement(By.xpath("(//AppCompatButton[@id='buttonCopy'])[1]"));
    buttoncopy.click();
    TouchAction tf = new TouchActionBuilder().pointerDown(todelandcopy.getXcoord(),todelandcopy.getYcoord()).
            pointerMove(todelandcopy.getXcoord()+itemtodelandcopy.getSize().getWidth(),todelandcopy.getYcoord()).pointerUp().build();
    tf.perform(driver);
//--------------УДАЛЕНИЕ ВИДЕОДОРОЖКИ И ОТМЕНА ДЕЙСТВИЯ-----------------------
    WebElement buttonDelete = driver.findElement(By.xpath("(//AppCompatButton[@id='buttonDelete'])[1]"));
    buttonDelete.click();
WebElement SnackBar = driver.findElement(By.id("snackbar_action"));
    SnackBar.click();
//--------------ОТКРЫТИЕ ВКЛАДКИ С АУДИО И ВОЗВРАТ ОБРАТНО-----------------------
    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    WebElement MusicAdd=driver.findElement(By.id("menu_add_music"));
    MusicAdd.click();
    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    driver.navigate().back();
//--------------ОТКРЫТИЕ FULLSCREEN И ВОСПРОИЗВЕДЕНИЕ ВСЕГО ВИДЕО-----------------------
    WebElement fullscreen=driver.findElement(By.id("fullscreen_toggle"));
    fullscreen.click();
    WebElement playfullscreen = driver.findElement(By.xpath("//AppCompatImageView[@id='buttonPlay']"));
    playfullscreen.click();
    PlayVideoStart(driver,playfullscreen);
    fullscreen.click();
//--------------ЭКСПОРТ И ОЖИДАНИЕ ОКОНЧАНИЯ ЭКСПОРТА-----------------------
        WebElement element4 = driver.findElement(By.id("menu_export"));
        element4.click();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        WebElement taken = wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_export_new")));
        if (driver != null) {
            driver.quit();
   }}



    @Test
    public void CheckVideoTest() throws Exception{
        WebDriverWait wait = new WebDriverWait(driver, 10000);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        checkvideoManager(4,1,driver);
        WebElement next=driver.findElement(By.id("menu_done"));
        next.click();
        driver.navigate().back();
        WebElement ClickAgree=driver.findElement(By.id("button1"));
        ClickAgree.click();


        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        checkvideoManager(1,4,driver);
        next.click();

        AudioItemSelector("App music",driver);
        next.click();
        WebElement element3 = driver.findElement(By.id("button_done"));
        element3.click();

        WebElement PlayVideo = driver.findElement(By.id("buttonPlay"));
        PlayVideo.click();
        WebElement playSeekBar=driver.findElement(By.id("playSeekBar"));
        pairvalues bar=getLocationofElem(playSeekBar);

        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    public void AudioTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10000);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        checkvideoManager(4,1,driver);
        WebElement next=driver.findElement(By.id("menu_done"));
        next.click();
        AudioItemSelector("App music",driver);
        next.click();
        WebElement element3 = driver.findElement(By.id("button_done"));
        element3.click();
        WebElement PlayVideo = driver.findElement(By.id("buttonPlay"));
        PlayVideo.click();
        PlayVideoStart(driver,PlayVideo);
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        WebElement MusicAdd=driver.findElement(By.id("menu_add_music"));
        MusicAdd.click();
        AudioItemSelector("No music",driver);
        //-----НУЖНО ДОБАВЛЕНИЕ ВЫБРАННОГО АУДИО-----

        PlayVideo.click();
        PlayVideoStart(driver,PlayVideo);
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }

    @Test
    public void ExportTest(){

    }







    public static void checkvideoManager(int count,int position, WebDriver driver)  {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement elem[]=new WebElement[count];
        WebDriverWait wait = new WebDriverWait(driver, 10000);
        for (int i=0;i<count;i++) {
            if (driver.findElements(By.xpath("(//AppCompatImageView[@id='previewImage'])["+(position+i)+"]")).size()> 0) {
        elem[i]=driver.findElement(By.xpath("(//AppCompatImageView[@id='previewImage'])["+(position+i)+"]"));
                if(elem[i].isDisplayed()){ //TouchActions touc=new TouchActions(driver).longPress(elem[i]);
                   elem[i].click();
                }
        } else wait.until(ExpectedConditions.elementToBeClickable(elem[i]));
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
            pointerMove(coordinates.getXcoord()+coordinates.getXcoord()*4,coordinates.getYcoord()).pointerUp().build();
            ta.perform(driver);
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        TouchAction tb = new TouchActionBuilder().pointerDown(coordinates.getXcoord()+element1.getSize().getWidth()-1,coordinates.getYcoord()).
                pointerMove((coordinates.getXcoord()+element1.getSize().getWidth()-element1.getSize().getWidth()/4),coordinates.getYcoord()).pointerUp().build();
        tb.perform(driver);}
    }
    public static pairvalues getLocationofElem(WebElement element){
        Point point = element.getLocation();
                pairvalues Coordinates=new pairvalues(point.getX(),point.getY());
        return Coordinates;
    }
    public static String DeviceSelector(String NameofDevice){
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
public static void PlayVideoStart (WebDriver driver, WebElement Element){
    while ((Element.isDisplayed())) {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    while(!Element.isDisplayed()){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
}
}

