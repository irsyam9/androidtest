package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class AddReview extends TestBase2 {

    @AndroidFindBy(id = "com.fdbr.android.debug:id/fab")
    MobileElement btnPlus;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/iv_add_review")
    MobileElement btnAddReview;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nature Republic']")
    MobileElement btnProduk1;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rate_overall")
    MobileElement rateOverall;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rate_packaging")
    MobileElement ratePackaging;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_1")
    MobileElement btnPrice1;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_2")
    MobileElement btnPrice2;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/lbl_price_3")
    MobileElement btnPrice3;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_purchase_yes")
    MobileElement btnRepurchaseYes;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_purchase_maybe")
    MobileElement btnRepurchaseMaybe;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/rel_purchase_no")
    MobileElement btnRepurchaseNo;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/txt_story")
    MobileElement btnReview2;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_back")
    MobileElement btnBack;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/btn_yes")
    MobileElement btnYes;

    @AndroidFindBy(id = "com.fdbr.android.debug:id/img_back")
    MobileElement btnBack2;

    public AddReview(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void tapPlusBtn(){btnPlus.click();}
    public void tapBtnAddReview(){btnAddReview.click();}
    public void tapProduk1(){btnProduk1.click();}
    public void setOverallRate(){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(5) + 1;

        AndroidTouchAction androidtouchaction = new AndroidTouchAction(driver);
        int startOverallX = rateOverall.getLocation().getX();
        int startOverallY = rateOverall.getLocation().getY();
        int widthOverallX = rateOverall.getSize().getWidth();
        int endOverallX = startOverallX + widthOverallX;
        int tapOverallAt;
        switch (rand_int1){
            case 1:
                tapOverallAt = startOverallX + ((int)(widthOverallX * 0.2));
                break;
            case 2:
                tapOverallAt = startOverallX + ((int) (widthOverallX * 0.4));
                break;
            case 3:
                tapOverallAt = startOverallX + ((int) (widthOverallX * 0.6));
                break;
            case 4:
                tapOverallAt = startOverallX + ((int) (widthOverallX * 0.8));
                break;
            case 5:
                tapOverallAt = startOverallX + widthOverallX;
                break;
            default:
                return;
        }
        androidtouchaction.press(PointOption.point(tapOverallAt, startOverallY)).release().perform();
    }

    public void setPackagingRate(){
        Random rand = new Random();
        int rand_int2 = rand.nextInt(5) + 1;
        AndroidTouchAction androidtouchaction = new AndroidTouchAction(driver);
        int startPackagingX = ratePackaging.getLocation().getX();
        int startPackagingY = ratePackaging.getLocation().getY();
        int widthPackagingX = ratePackaging.getSize().getWidth();
        int endPackagingX = startPackagingX + widthPackagingX;
        int tapPAckagingAt;
        switch (rand_int2){
            case 1:
                tapPAckagingAt = startPackagingX + ((int)(widthPackagingX * 0.2));
                break;
            case 2:
                tapPAckagingAt = startPackagingX + ((int)(widthPackagingX * 0.4));
                break;
            case 3:
                tapPAckagingAt = startPackagingX + ((int)(widthPackagingX * 0.6));
                break;
            case 4:
                tapPAckagingAt = startPackagingX + ((int)(widthPackagingX * 0.8));
                break;
            case 5:
                tapPAckagingAt = startPackagingX + widthPackagingX;
                break;
            default:
                return;
        }
        androidtouchaction.press(PointOption.point(tapPAckagingAt, startPackagingY)).release().perform();
    }

    public void setPrice(){
        Random rand = new Random();
        int rand_int3 = rand.nextInt(3) + 1;
        switch (rand_int3){
            case 1 :
                btnPrice1.click();
                break;
            case 2 :
                btnPrice2.click();
                break;
            case 3 :
                btnPrice3.click();
                break;
            default:
                System.out.println("Wrong Price Selected");
                break;
        }
    }

    public void setRepurchase(){
        Random rand = new Random();
        int rand_int4 = rand.nextInt(3) + 1;
        switch (rand_int4){
            case 1 :
                btnRepurchaseYes.click();
                break;
            case 2 :
                btnRepurchaseMaybe.click();
                break;
            case 3 :
                btnRepurchaseNo.click();
                break;
            default:
                System.out.println("Wrong Repurchase Selected");
                break;
        }
    }

    public void writeReview(String sentence){btnReview2.sendKeys(sentence);}
    public void tapBackBtn(){btnBack.click();}
    public void tapYesBtn(){btnYes.click();}
    public void tapBackBtn1(){btnBack2.click();}
}
