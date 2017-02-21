import io.selendroid.client.SelendroidDriver;
import io.selendroid.client.TouchAction;
import io.selendroid.client.TouchActionBuilder;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.standalone.SelendroidConfiguration;
import io.selendroid.standalone.SelendroidLauncher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.touch.TouchActions;
/**
 * Created by d.lihodedov on 18.10.2016.
 */

public class fuckckingtest {
    public static String DeviceSelector(String NameofDevice){
        String outputSerial=new String();
        if (NameofDevice.equals("Nexus_5")) outputSerial="044a6eeff0cca631";
        else if (NameofDevice.equals("Samsung_Galaxy_Tab_4")) outputSerial="61ac735d07d7de10";
        else if (NameofDevice.equals("Huawei_MediaPad_M2")) outputSerial="36E6R15925001108";
        else if (NameofDevice.equals("Nexus_5X")) outputSerial="00bd9f1ce5b6b398";
        else if (NameofDevice.equals("Lenovo_S60")) outputSerial="1376deea";
        else if (NameofDevice.equals("Lenovo_S860")) outputSerial="error";
        else if (NameofDevice.equals("Asus_ZenFone_5")) outputSerial="ECAZCY02W348";
        else if (NameofDevice.equals("Asus_ZenFone2_Laser")) outputSerial="";
        else if (NameofDevice.equals("Samsung_J5")) outputSerial="8e34c2ad";
        return outputSerial;
    }
private final int ValueOfVideo = 15;
    WebDriver driver;
    SelendroidConfiguration config = new SelendroidConfiguration();
    SelendroidCapabilities caps = new SelendroidCapabilities("com.movavi.mobile.videoeditor:1.5");

    @Before
    public void initializeSelendroid() throws Exception {
       config.addSupportedApp("C:\\test\\test_app.apk");
      //  config.setPort(8080);
      //  config.setSelendroidServerPort(8080);
        SelendroidLauncher selendroidServer = new SelendroidLauncher(config);
       selendroidServer.launchSelendroid();
        caps.setEmulator(false);
        driver = new SelendroidDriver(caps);
        //driver.get("and-activity://com.movavi.mobile.videoeditor.SplashActivity_");
        caps.setSerial(DeviceSelector("Asus_ZenFone_5"));
    }
    public static void main(String[] args) throws Exception {
        JUnitCore.main(
                "fuckckingtest");
    }


    @Test
    public void SERTest() throws  Exception{
        WebDriverWait wait = new WebDriverWait(driver, 10000);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);




for (int i=1;i<=10;i++){
    checkvideoManagerNEW(1,i,driver);
        driver.findElement(By.id("buttonComplete")).click();


       driver.findElement(By.id("skipButton")).click();
    //--------------
        driver.findElement(By.id("buttonPlay")).click();
              PlayVideoStart(driver,driver.findElement(By.id("buttonPlay")));
//----------------------
driver.findElement(By.id("menu_restart")).click();
driver.findElement(By.id("button1")).click();

//------------------------
    }}


@Test
    public void WorkSpaceTest() throws Exception{
    WebDriverWait wait = new WebDriverWait(driver, 10000);
    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//--------------ДОБАВЛЕНИЕ ВИДЕО В ПРОЕКТ-----------------------
        checkvideoManager(1,5,driver);
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
            pointerMove(coordinatesofChangeDurationVideoItem.getXcoord()+ChangeDurationVideoItem.getSize().getWidth()/4,coordinatesofChangeDurationVideoItem.getYcoord()).pointerUp().build();
    tj.perform(driver);
    tj.perform(driver);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    TouchAction tk = new TouchActionBuilder().pointerDown(coordinatesofChangeDurationVideoItem.getXcoord()-1+ChangeDurationVideoItem.getSize().getWidth()-1,coordinatesofChangeDurationVideoItem.getYcoord()).
            pointerMove(coordinatesofChangeDurationVideoItem.getXcoord()+ChangeDurationVideoItem.getSize().getWidth()-ChangeDurationVideoItem.getSize().getWidth()/4,coordinatesofChangeDurationVideoItem.getYcoord()).pointerUp().build();
    tk.perform(driver);
    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//--------------ИЗМЕНЕНИЕ ПОЗИЦИИ ПЕРВОГО ВИДЕОТРЕКА-----------------------
    WebElement moveVideo=driver.findElement(By.xpath("(//AppCompatImageView[@id='reorder_handle'])[1]"));
    pairvalues coordmoveVideo=getLocationofElem(moveVideo);
    TouchAction tp = new TouchActionBuilder().pointerDown(coordmoveVideo.getXcoord(),coordmoveVideo.getYcoord()).
            pointerMove(coordmoveVideo.getXcoord(),coordmoveVideo.getYcoord()+moveVideo.getSize().getHeight()*2).pointerUp().build();
    tp.perform(driver);
    driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
    tp.perform(driver);
//--------------ПРОЛИСТЫВАНИЕ СПИСКА ДОБАВЛЕННЫХ ВИДЕО ДЛЯ НАЖАТИЯ КНОПКИ "+"(ДОБАВЛЕНИЕ ВИДЕО)-----------------------
    WebElement item1 = driver.findElement(By.xpath("(//LinearLayout[@id='item_layout'])[1]"));
    pairvalues item=getLocationofElem(item1);
        TouchAction tr = new TouchActionBuilder().pointerDown(item.getXcoord()+1,item.getYcoord()).
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
    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//--------------КОПИРОВАНИЕ ВИДЕОДОРОЖКИ-----------------------
    WebElement buttoncopy = driver.findElement(By.xpath("(//AppCompatButton[@id='buttonCopy'])[1]"));
    buttoncopy.click();
    TouchAction tf = new TouchActionBuilder().pointerDown(todelandcopy.getXcoord(),todelandcopy.getYcoord()).
            pointerMove(todelandcopy.getXcoord()+itemtodelandcopy.getSize().getWidth(),todelandcopy.getYcoord()).pointerUp().build();
    tf.perform(driver);
    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
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
            System.out.println("WorkspaceTest_OK");
            driver.quit();
   }
}



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
            System.out.println("CheckVideoTest_OK");
            driver.quit();
        }
    }


    @Test
    public void AudioTest(){
        WebDriverWait wait = new WebDriverWait(driver, 10000);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        checkvideoManager(4,1,driver);
        WebElement next=driver.findElement(By.id("menu_done"));
        next.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        AudioItemSelector("App music",driver);
        next.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebElement element3 = driver.findElement(By.id("button_done"));
        element3.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebElement PlayVideo = driver.findElement(By.id("buttonPlay"));
        PlayVideo.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        PlayVideoStart(driver,PlayVideo);

        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        WebElement MusicAdd=driver.findElement(By.id("menu_add_music"));
        MusicAdd.click();
        AudioItemSelector("No music",driver);
        //-----НУЖНО ДОБАВЛЕНИЕ ВЫБРАННОГО АУДИО-----
        WebElement addNoAudio = driver.findElement(By.xpath("//ActionMenuItemView[@id='menu_done']"));
        addNoAudio.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        PlayVideo = driver.findElement(By.id("buttonPlay"));
        PlayVideo.click();
        PlayVideoStart(driver,PlayVideo);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        MusicAdd=driver.findElement(By.id("menu_add_music"));
        MusicAdd.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        AudioItemSelector("Your music",driver);
        WebElement addYourAudio = driver.findElement(By.xpath("//ActionMenuItemView[@id='menu_done']"));
addYourAudio.click();
        PlayVideo = driver.findElement(By.id("buttonPlay"));
PlayVideo.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        PlayVideoStart(driver,PlayVideo);
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        if (driver != null) {
            System.out.println("CheckAudioTest_OK");
            driver.quit();
        }
    }

//    @Test
//    public void StressTestAddVideoToProject() {
//
//        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
//        checkvideoManager(10, 1, driver);
//                WebElement next=driver.findElement(By.id("menu_done"));
//        next.click();
//        AudioItemSelector("No music",driver);
//        next.click();
//        WebElement element3 = driver.findElement(By.id("button_done"));
//        element3.click();
//        for (int i = 0; i <=ValueOfVideo; i++) {
//            for (int j=0;j<4;j++)
//            {
//                WebElement item1 = driver.findElement(By.id("timeline_view"));
//                pairvalues item=getLocationofElem(item1);
//                TouchAction tr = new TouchActionBuilder().pointerDown(item.getXcoord()+item1.getSize().getWidth()/2,item.getYcoord()+item1.getSize().getHeight()/2).
//                        pointerMove(item.getXcoord()+item1.getSize().getWidth()/2,0).pointerUp().build();
//                tr.perform(driver);
//            }
//            WebElement AddNewVideo=driver.findElement(By.id("buttonAdd"));
//            AddNewVideo.click();
//            checkvideoManager(10,1,driver);
//
//            WebElement element1 = driver.findElement(By.xpath("//ActionMenuItemView[@id='menu_done']"));
//            element1.click();
//System.out.println("Добавлено "+(i+2)+" видео");
//        }
//    }
//
//@Test
//    public void StressTestAddVideoToProject2() {
//
//        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
//        checkvideoManager(10, 1, driver);
//        WebElement next=driver.findElement(By.id("menu_done"));
//        next.click();
//        AudioItemSelector("No music",driver);
//        next.click();
//        WebElement element3 = driver.findElement(By.id("button_done"));
//        element3.click();
//        for (int i = 0; i <=ValueOfVideo; i++) {
//            for (int j=0;j<4;j++)
//            {
//                WebElement item1 = driver.findElement(By.id("timeline_view"));
//                pairvalues item=getLocationofElem(item1);
//                TouchAction tr = new TouchActionBuilder().pointerDown(item.getXcoord()+item1.getSize().getWidth()/2,item.getYcoord()+item1.getSize().getHeight()/2).
//                        pointerMove(item.getXcoord()+item1.getSize().getWidth()/2,0).pointerUp().build();
//                tr.perform(driver);
//            }
//            WebElement AddNewVideo=driver.findElement(By.id("buttonAdd"));
//            AddNewVideo.click();
//            checkvideoManager(10,1,driver);
//
//            WebElement element1 = driver.findElement(By.xpath("//ActionMenuItemView[@id='menu_done']"));
//            element1.click();
//            System.out.println("Добавлено "+(i+2)+" видео");
//        }
//    }






//    @Test
//    public void ExportTest(){
//
//    }







    public static void checkvideoManager(int count,int position, WebDriver driver)  {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
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
   // driver.findElement(By.xpath("(//VideoItemView_)[1]"));

    public static void checkvideoManagerNEW(int count,int position, WebDriver driver)  {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebElement elem[]=new WebElement[count];
        WebDriverWait wait = new WebDriverWait(driver, 10000);
        for (int i=0;i<count;i++) {
            if (driver.findElements(By.xpath("(//VideoItemView_)["+(position+i)+"]")).size()> 0) {
                elem[i]=driver.findElement(By.xpath("(//VideoItemView_)["+(position+i)+"]"));
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
            pointerMove(coordinates.getXcoord()+element1.getSize().getWidth()/4,coordinates.getYcoord()).pointerUp().build();
            ta.perform(driver);
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


public static void PlayVideoStart (WebDriver driver, WebElement Element){
    while ((Element.isDisplayed())) {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    while(!Element.isDisplayed()){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
}
}

