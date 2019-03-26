package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class AddProduct extends TestBase2 {

    public AddProduct(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fab")
    MobileElement btnPlus;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_add_product")
    MobileElement btnAddProduct;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_profile")
    MobileElement btnProfile;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
    AndroidElement btnTake;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/toolbar_action_button")
    MobileElement btnHold;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_brand")
    MobileElement btnBrand;

    @AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id= 'com.fdbr.android.debug:id/recycler_view']" +
            "//android.widget.RelativeLayout//android.widget.TextView[starts-with(@resource-id, 'com.fdbr.android.debug:id/tv_title')]")
    List<MobileElement> btnBrands;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_product_cat")
    MobileElement btnProduk;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nails']")
    MobileElement btnProdukCat;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Polish']")
    MobileElement btnMoisturizer;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_product_name")
    MobileElement btnProductName;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_product_shade")
    MobileElement btnShade;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_product_desc")
    MobileElement txtDescription;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/edt_price")
    MobileElement btnPrice;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_currency")
    MobileElement btnSetMoney;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='EUR']")
    MobileElement btnEuro;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_add_product")
    MobileElement btnAddProd;

    public void tapPlusBtn(){btnPlus.click();}
    public void tapBtnAddReview(){btnAddProduct.click();}
    public void tapProfilBtn(){btnProfile.click();}
    public void tapTakeBtn(){btnTake.click();}
    public void tapHoldBtn(){btnHold.click();}
    public void tapBrandBtn(){btnBrand.click();}
    public void tapBrandsBtn(){
        Random rnd = new Random();
        int rndInt = rnd.nextInt(btnBrands.size());
        btnBrands.get(rndInt).click();
    }
    public void tapProdukBtn(){btnProduk.click();}
    public void tapProdukCategoryBtn(){btnProdukCat.click();}
    public void tapMoisturizerBtn(){btnMoisturizer.click();}
    public void ProdukNameBtn(String name){btnProductName.sendKeys(name);}
    public void ShadeBtn(String shade){btnShade.sendKeys(shade);}
    public void edtTextDesc(String desc){txtDescription.sendKeys(desc);}
    public void SetPriceBtn(String price){btnPrice.sendKeys(price);}
    public void SetMoneyBtn(){btnSetMoney.click();}
    public void EuroBtn(){btnEuro.click();}
    public void setBtnAddProduct(){btnAddProd.click();}
}
