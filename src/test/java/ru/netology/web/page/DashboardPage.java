package ru.netology.web.page;

import org.openqa.selenium.Keys;
import ru.netology.web.data.DataHelper;
import static com.codeborne.selenide.Selenide.$;


public class DashboardPage {

  public static DashboardPage transferFromSecondCountOnFirst(DataHelper.TransferOnCard info) {
    $("[data-test-id='92df3f1c-a033-48e6-8390-206f6b1f56c0']").$("[data-test-id=action-deposit]").click();
    $("[data-test-id=amount] input").sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
    $("[data-test-id=amount] input").setValue(info.getAmount());
    $("[data-test-id=from] input").sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
    $("[data-test-id=from] input").setValue(info.getCount());
    $("[data-test-id=action-transfer]").click();
    return new DashboardPage();
  }

  public static DashboardPage transferFromFirstCountOnSecond(DataHelper.TransferOnCard info) {
    $("[data-test-id='0f3f5c2a-249e-4c3d-8287-09f7a039391d']").$("[data-test-id=action-deposit]").click();
    $("[data-test-id=amount] input").sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
    $("[data-test-id=amount] input").setValue(info.getAmount());
    $("[data-test-id=from] input").sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
    $("[data-test-id=from] input").setValue(info.getCount());
    $("[data-test-id=action-transfer]").click();
    return new DashboardPage();
  }
}

