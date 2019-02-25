package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DiscoverPage extends TestBase2 {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/siv_photo_hi_res")
    MobileElement btnView;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_like")
    MobileElement btnLike;

    public DiscoverPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);}

    public void tapViewBtn(){btnView.click();}
    public void tapLikeBtn(){btnLike.click();}


}
