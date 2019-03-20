package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class EditProfile extends TestBase2 {

    public EditProfile(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_settings")
    MobileElement btnSetting;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Edit Profile']")
    MobileElement btnProfile;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_profile")
    MobileElement btnPict;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
    AndroidElement btnTake;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button")
    MobileElement btnHold;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='09 May 2002']")
    MobileElement btnDate;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Apr']")
    MobileElement btnMonth;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='10']")
    MobileElement btnDay1;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='11']")
    MobileElement btnDay2;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='12']")
    MobileElement btnDay3;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='13']")
    MobileElement btnDay4;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='2003'")
    MobileElement btnYear;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    MobileElement btnOk;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_name")
    MobileElement btnClearName;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_name")
    MobileElement btnName;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_location")
    MobileElement btnLock;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Depok']")
    MobileElement btnCity;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_phone_number")
    MobileElement btnClearPhone;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_phone_number")
    MobileElement btnPhone;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_bio")
    MobileElement btnBio;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_beauty_id") MobileElement btnBeautyprofile;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_types']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListSkinType;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_tones']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded_titled')]")
    List<MobileElement> ListSkinTone;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_skin_undertones']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListSkinUnder;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hair_types']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListHairType;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hair_colors']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_checked_rounded')]")
    List<MobileElement> ListColorHair;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.fdbr.android.debug:id/ll_hijabs']"+
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/civ_image_rounded')]")
    List<MobileElement> ListHijab;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_save")
    MobileElement btnSave;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_beauty_concern")
    MobileElement btnBeautyconcern;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='com.fdbr.android.debug:id/fl_skin']"+
            "//android.widget.FrameLayout//android.widget.LinearLayout[starts-with(@resource-id, 'com.fdbr.android.debug:id/container')]")
    List<MobileElement> ListSkinconcern;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='com.fdbr.android.debug:id/fl_body']"+
            "//android.widget.FrameLayout//android.widget.LinearLayout[starts-with(@resource-id, 'com.fdbr.android.debug:id/container')]")
    List<MobileElement> ListBodyconcern;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='com.fdbr.android.debug:id/fl_hair']"+
            "//android.widget.FrameLayout//android.widget.LinearLayout[starts-with(@resource-id, 'com.fdbr.android.debug:id/container')]")
    List<MobileElement> ListHairconcern;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rl_continue")
    MobileElement btnSave2;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_save")
    MobileElement btnDone;

    public void tapSettingBtn(){btnSetting.click();}
    public void tapProfileBtn(){btnProfile.click();}
    public void tapPictBtn(){btnPict.click();}
    public void tapTakeBtn(){btnTake.click();}
    public void tapHoldBtn(){btnHold.click();}
    public void tapDateBtn(){btnDate.click();}
    public void tapMonthBtn(){btnMonth.click();}
    public void tapDay1Btn(){btnDay1.click();}
    public void tapDay2Btn(){btnDay2.click();}
    public void tapDay3Btn(){btnDay3.click();}
    public void tapDay4Btn(){btnDay4.click();}
    public void tapOkBtn(){btnOk.click();}
    public void tapClearNameBtn(){btnClearName.clear();}
    public void tapNameBtn(String name){btnName.sendKeys(name);}
    public void tapLockBtn(){btnLock.click();}
    public void tapCityBtn(){btnCity.click();}
    public void tapClearPhoneBtn(){btnClearPhone.clear();}
    public void tapPhoneBtn(String phone){btnPhone.sendKeys(phone);}
    public void tapBioBtn(String bio){btnBio.sendKeys(bio);}
    public void tapBeautyProfileBtn(){btnBeautyprofile.click();}
    public void selectSkinType(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinType.size());
        ListSkinType.get(rndInt).click();
    }
    public void selectSkinTone(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinTone.size());
        ListSkinTone.get(rndInt).click();
    }
    public void selectSkinUnder(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinUnder.size());
        ListSkinUnder.get(rndInt).click();
    }
    public void selectHairType(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListHairType.size());
        ListHairType.get(rndInt).click();
    }
    public void selectColorHair(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListColorHair.size());
        ListColorHair.get(rndInt).click();
    }
    public void selectHijab(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListHijab.size());
        ListHijab.get(rndInt).click();
    }
    public void tapSaveBtn(){btnSave.click();}
    public void tapBeautyConcernsBtn(){btnBeautyconcern.click();}
    public void selectSkinConcern(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListSkinconcern.size());
        ListHijab.get(rndInt).click();
    }
    public void selectBodyConcern(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListBodyconcern.size());
        ListBodyconcern.get(rndInt).click();
    }
    public void selectHairConcern(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(ListHairconcern.size());
        ListHairconcern.get(rndInt).click();
    }
    public void tapSave2Btn(){btnSave2.click();}
    public void tapDoneBtn(){btnDone.click();}
}
