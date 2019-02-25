package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class FeedPage extends TestBase2 {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/siv_photo_hi_res")
    MobileElement btnView;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rl_btn")
    MobileElement btnReview;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_back_button_image")
    MobileElement btnBack;

    public FeedPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapViewBtn(){btnView.click();}
    public void tapReviewBtn(){btnReview.click();}
    public void tapBackBtn(){btnBack.click();}
}
