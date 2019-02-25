package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AddPost extends TestBase2 {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fab")
    MobileElement btnPlus;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_post_photo")
    MobileElement btnAddPost;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_ok")
    MobileElement btnOk;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    MobileElement btnAllow;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/capture_image_button")
    MobileElement btnTake;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    MobileElement btnAllow2;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button")
    MobileElement btnHold;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_right1")
    MobileElement btnCorrect;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_tag_product")
    MobileElement btnTag;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/checkbox")
    MobileElement btnCheck;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/action_done")
    MobileElement btnDone;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_right2")
    MobileElement btnCorrect2;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_add_review")
    MobileElement btnReview;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_caption")
    MobileElement btnCaption;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button_image")
    MobileElement btnHold2;

    public AddPost(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapPlusBtn(){btnPlus.click();}
    public void tapAddPostBtn(){btnAddPost.click();}
    public void tapOkeBtn(){btnOk.click();}
    public void tapAllowBtn(){btnAllow.click();}
    public void tapTakeBtn(){btnTake.click();}
    public void tapAllow2Btn(){btnAllow2.click();}
    public void tapholdBtn(){btnHold.click();}
    public void tapCorrectBtn(){btnCorrect.click();}
    public void tapTagBtn(){btnTag.click();}
    public void tapCheckBtn(){btnCheck.click();}
    public void tapDoneBtn(){btnDone.click();}
    public void tapCorrect2Btn(){btnCorrect2.click();}
    public void tapReviewBtn(){btnReview.click();}
    public void editCaption(String caption){btnCaption.sendKeys(caption);}
    public void tapHold2Btn(){btnHold2.click();}
}
