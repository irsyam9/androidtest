package com.intern.util;

import com.intern.base.TestBase2;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar extends TestBase2{

        public NavigationBar(){
            PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='view1']")
    AndroidElement btnTabHome;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='view2']")
    AndroidElement btnTabFeed;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='view4']")
    AndroidElement btnTabDiscover;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc='view5']")
    AndroidElement btnTabProfile;

    public void tapBtnNavHome(){btnTabHome.click();}

    public void tapBtnNavFeed(){btnTabFeed.click();}

    public void tapBtnNavDiscover(){btnTabDiscover.click();}

    public void tapBtnNavProfile(){btnTabProfile.click();}


}
