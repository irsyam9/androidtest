package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class FormUser extends TestBase2 {

    public FormUser(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Full Name*']")
    MobileElement txtFullName;

    @AndroidFindBy (id = "com.fdbr.android.debug:id/fl_photo")
    MobileElement btnFoto;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    MobileElement btnAllow;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/capture_image_button")
    MobileElement btnTake;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    MobileElement btnAllow2;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button")
    MobileElement btnHold;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/met_location")
    MobileElement txtLocation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bogor']")
    MobileElement btnCity;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Phone Number']")
    MobileElement txtNumber;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_next")
    MobileElement btnNext;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_skip_button")
    MobileElement btnSkip;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_btn")
    MobileElement btnStart;

    public void edtFullName(String Fn){txtFullName.sendKeys(Fn);}
    public void tapBtnFoto(){btnFoto.click();}
    public void tapAllow1Btn(){btnAllow.click();}
    public void tapTakeBtn(){btnTake.click();}
    public void tapAllow2Btn(){btnAllow2.click();}
    public void tapCorrectBtn(){btnHold.click();}
    public void edtLocation(){txtLocation.click();}
    public void tapCityBtn(){btnCity.click();}
    public void edtNumber(String number){txtNumber.sendKeys(number);}
    public void tapNextBtn(){btnNext.click();}
    public void tapSkipBtn(){btnSkip.click();}
    public void tapStartBtn(){btnStart.click();}

}
