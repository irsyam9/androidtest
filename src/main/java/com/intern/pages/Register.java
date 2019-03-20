package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Register extends TestBase2 {

    public Register(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_dob")
    MobileElement btnDate;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Feb']")
    AndroidElement btnMonth;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Mar']")
    AndroidElement btnMonth2;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Apr']")
    AndroidElement btnMonth3;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='May']")
    AndroidElement btnMonth4;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='02']")
    AndroidElement btnDay;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='03']")
    AndroidElement btnDay2;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='04']")
    AndroidElement btnDay3;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='05']")
    AndroidElement btnDay4;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='06']")
    AndroidElement btnDay5;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='07']")
    AndroidElement btnDay6;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='08']")
    AndroidElement btnDay7;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='09']")
    AndroidElement btnDay8;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='2006']")
    AndroidElement btnYear;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='2005']")
    AndroidElement btnYear2;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='2004']")
    AndroidElement btnYear3;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='2003']")
    AndroidElement btnYear4;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='2002']")
    AndroidElement btnYear5;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='2001']")
    AndroidElement btnYear6;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_ok")
    MobileElement btnOk;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fl_next")
    MobileElement btnNext;

    public void Datebtn(){btnDate.click();}
    public void MonthBtn(){btnMonth.click();}
    public void Month2Btn(){btnMonth2.click();}
    public void Month3Btn(){btnMonth3.click();}
    public void Month4Btn(){btnMonth4.click();}
    public void DayBtn(){btnDay.click();}
    public void Day2Btn(){btnDay2.click();}
    public void Day3Btn(){btnDay3.click();}
    public void Day4Btn(){btnDay4.click();}
    public void Day5Btn(){btnDay5.click();}
    public void Day6Btn(){btnDay6.click();}
    public void Day7Btn(){btnDay7.click();}
    public void Day8Btn(){btnDay8.click();}
    public void YearBtn(){btnYear.click();}
    public void Year2Btn(){btnYear2.click();}
    public void Year3Btn(){btnYear3.click();}
    public void Year4Btn(){btnYear4.click();}
    public void Year5Btn(){btnYear5.click();}
    public void Year6Btn(){btnYear6.click();}
    public void OkBtn(){btnOk.click();}
    public void NextBtn(){btnNext.click();}



}
