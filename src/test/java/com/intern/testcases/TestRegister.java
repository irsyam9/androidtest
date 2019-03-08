package com.intern.testcases;

import com.github.javafaker.Faker;
import com.intern.base.TestBase2;
import com.intern.pages.*;
import com.intern.util.ScrollDown;
import com.intern.util.ScrollUp;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestRegister extends TestBase2 {

    private CarouselPage carouselpage;
    private OnBoardingPage onboardingpage;
    private SignUpPage signuppage;
    private Faker faker;
    private Register register;
    private SkinPage skinpage;
    private HairPage hairpage;
    private ScrollDown scrolldown;
    private ScrollUp scrollup;
    private BodyConcernsPage bodyconcernspage;
    private HairConcernsPage hairconcernspage;
    private SkinConcernsPage skinconcernspage;
    private FormUser formuser;
    private AddReview addreview;

    public TestRegister(){super();}

    @BeforeMethod
    public void setup() throws IOException, InterruptedException {
        initialization();
        carouselpage = new CarouselPage();
        onboardingpage = new OnBoardingPage();
        signuppage = new SignUpPage();
        faker = new Faker();
        register = new Register();
        skinpage = new SkinPage();
        hairpage = new HairPage();
        scrolldown = new ScrollDown();
        scrollup = new ScrollUp();
        bodyconcernspage = new BodyConcernsPage();
        hairconcernspage = new HairConcernsPage();
        skinconcernspage = new SkinConcernsPage();
        formuser = new FormUser();
        addreview = new AddReview();
    }

    @AfterMethod
    public void tearDown(){driver.quit();}

    @Test
    public void tcRegister() throws InterruptedException {
        carouselpage.tapNextBtn();
        carouselpage.tapNextBtn();
        carouselpage.tapStartBtn();
        onboardingpage.tapSignUpBtn();
        signuppage.InputEmail(faker.internet().safeEmailAddress());
        signuppage.InputUsername(faker.internet().slug());
        signuppage.InputPassword(faker.internet().password());
        signuppage.tapRegisterBtn();
        register.Datebtn();
        register.MonthBtn();
        register.Month2Btn();
        register.Month3Btn();
        register.Month4Btn();
        register.DayBtn();
        register.Day2Btn();
        register.Day3Btn();
        register.Day4Btn();
        register.Day5Btn();
        register.Day6Btn();
        register.Day7Btn();
        register.Day8Btn();
        register.YearBtn();
        register.Year2Btn();
        register.Year3Btn();
        register.Year4Btn();
        register.Year5Btn();
        register.OkBtn();
        register.NextBtn();
        skinpage.selectSkinType();
        skinpage.selectSkinTone();
        skinpage.selectSkinUndertones();
        skinpage.tapNextBtn();
        hairpage.selectHairType();
        hairpage.selectColoredHair();
        hairpage.selectHijab();
        hairpage.tapNextBtn();
        skinconcernspage.selectSkinConcerns();
        skinconcernspage.tapNextBtn();
        bodyconcernspage.selectBodyConcerns();
        bodyconcernspage.tapNextBtn();
        hairconcernspage.selectHairConcerns();
        hairconcernspage.tapNextBtn();
        formuser.edtFullName("ajifjafioejio");
        formuser.tapBtnFoto();
        formuser.tapAllow1Btn();
        formuser.tapTakeBtn();
        formuser.tapAllow2Btn();
        formuser.tapCorrectBtn();
        formuser.edtLocation();
        Thread.sleep(2000);
        scrolldown.ScrollDown();
        scrolldown.ScrollDown();
        scrolldown.ScrollDown();
        scrollup.ScrollUp();
        scrolldown.ScrollDown();
        formuser.tapCityBtn();
        formuser.edtNumber("81309240924");
        formuser.tapNextBtn();
        formuser.tapSkipBtn();
        formuser.tapStartBtn();
        addreview.tapPlusBtn();
        addreview.tapBtnAddReview();
        Thread.sleep(5000);
        addreview.tapProduk1();
        addreview.setOverallRate();
        addreview.setPackagingRate();
        addreview.setPrice();
        addreview.setRepurchase();
        addreview.writeReview(faker.lorem().sentence(35));
        addreview.tapBackBtn();
    }
}
