package ru.netology.web.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import ru.netology.web.data.DataHelper;
import ru.netology.web.page.*;

import static com.codeborne.selenide.Selenide.*;

class MoneyTransferTest {

    @Test
    void shouldTransferMoneyBetweenOwnCardsV1() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999");
        var loginPage = new LoginPageV1();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
        var verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        var transferInfo = DataHelper.getTransferInfo();
        DashboardPage.transferFromSecondCountOnFirst(transferInfo);
    }

    @Test
    void shouldTransferMoneyBetweenOwnCardsV2() {
        open("http://localhost:9999");
        var loginPage = new LoginPageV1();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
        var verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        var transferInfo = DataHelper.getOtherTransferInfo();
        DashboardPage.transferFromFirstCountOnSecond(transferInfo);
    }

    @Test
    void shouldTransferMoneyBetweenOwnCardsBalanceNegative() {
        open("http://localhost:9999");
        var loginPage = new LoginPageV1();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
        var verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        var transferInfo = DataHelper.getTransferElevenThousandsInfo();
        DashboardPage.transferFromFirstCountOnSecond(transferInfo);
    }

    @Test
    void shouldTransferMoneyBetweenOwnCardsBalance() {
        open("http://localhost:9999");
        var loginPage = new LoginPageV1();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
        var verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        var transferInfo = DataHelper.getTransferBalanceInfo();
        DashboardPage.transferFromSecondCountOnFirst(transferInfo);
    }

    @Test
    void shouldTransferMoneyBetweenOwnCardsKopecks() {
        open("http://localhost:9999");
        var loginPage = new LoginPageV1();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
        var verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        var transferInfo = DataHelper.getTransferKopecksInfo();
        DashboardPage.transferFromSecondCountOnFirst(transferInfo);
    }

    @Test
    void shouldTransferMoneyBetweenOwnCardsKopecksV2() {
        open("http://localhost:9999");
        var loginPage = new LoginPageV1();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
        var verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        var transferInfo = DataHelper.getTransferKopecksV2Info();
        DashboardPage.transferFromFirstCountOnSecond(transferInfo);
    }
}

