package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase2 {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_close")
    MobileElement btnClose;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button_image")
    MobileElement btnNotif;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/civ_photo")
    MobileElement btnFoto;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_back_button_image")
    MobileElement btnBack;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    AndroidElement btnBack2;

    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void tapXBtn(){btnClose.click();}
    public void tapNotifBtn(){btnNotif.click();}
    public void tapFotoBtn(){btnFoto.click();}
    public void tapBackBtn(){btnBack.click();}
    public void tapBtnBack2(){btnBack2.click();}
}
