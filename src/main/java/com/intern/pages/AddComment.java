package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AddComment extends TestBase2 {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_comment")
    MobileElement btnComen;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rl_comment")
    MobileElement btnkomen;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_comment")
    MobileElement btnComment;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_post")
    MobileElement btnPost;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_picture")
    MobileElement btnFoto;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/siv_photo_hi_res")
    MobileElement btnPict;

    public AddComment(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);}

    public void tapBtnComen(){btnComen.click(); }

    public void CommentField(String comen){btnComment.sendKeys(comen);}

    public void tapPostBtn(){btnPost.click();}

    public void tapFotoBtn(){btnFoto.click();}

    public void tapPictBtn(){btnPict.click();}

    public void tapBtnKomen(){btnkomen.click();}
}
