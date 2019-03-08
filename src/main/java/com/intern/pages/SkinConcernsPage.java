package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SkinConcernsPage extends TestBase2 {

    public SkinConcernsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.fdbr.android.debug:id/rv_skin_concerns']" +
            "//android.widget.FrameLayout//android.widget.ImageView[starts-with(@resource-id, 'com.fdbr.android.debug:id/iv_image_rectangle')]")
    List<MobileElement> listSkinConcern;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_next")
    MobileElement btnNext;

    public void selectSkinConcerns(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(listSkinConcern.size());
        listSkinConcern.get(rndInt).click();
    }

    public void tapNextBtn(){btnNext.click();}

}
