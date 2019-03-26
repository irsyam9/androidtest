package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class OnBoardingPage extends TestBase2 {

    public OnBoardingPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_login")
    MobileElement btnLogin;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_signup")
    MobileElement btnSignUp;

    public void tapLoginBtn() {
        btnLogin.click();
    }

    public void tapSignUpBtn(){ btnSignUp.click();}






}
