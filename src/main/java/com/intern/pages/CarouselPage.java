package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;



public class CarouselPage extends TestBase2 {
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_next")
    MobileElement btnNext;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_start")
    MobileElement btnStart;

    public CarouselPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapNextBtn() {
        btnNext.click();
    }

    public void tapStartBtn() {
        btnStart.click();
    }


}
