package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase2 {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_username")
    MobileElement txtFieldUsername;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_password")
    MobileElement txtFieldPassword;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_signin")
    MobileElement btnSignin;

    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void loginField(String uname, String pass){ txtFieldUsername.sendKeys(uname);
        txtFieldPassword.sendKeys(pass);
    }
    public void tapSigninBtn(){btnSignin.click();}

}
