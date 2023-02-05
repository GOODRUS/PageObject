package ru.netology.web.data;

import lombok.Value;

public class DataHelper {
  private DataHelper() {
  }

  @Value
  public static class AuthInfo {
    private String login;
    private String password;
  }

  public static AuthInfo getAuthInfo() {
    return new AuthInfo("vasya", "qwerty123");
  }

  public static AuthInfo getOtherAuthInfo(AuthInfo original) {
    return new AuthInfo("petya", "123qwerty");
  }

  @Value
  public static class VerificationCode {
    private String code;
  }

  public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
    return new VerificationCode("12345");
  }

  @Value
  public static class TransferOnCard {
    private String count;
    private String amount;
  }

  public static TransferOnCard getTransferInfo() {
    return new TransferOnCard("5559 0000 0000 0002", "500");
  }

  public static TransferOnCard getOtherTransferInfo() { return new TransferOnCard("5559 0000 0000 0001", "500"); }

  public static TransferOnCard getTransferElevenThousandsInfo() { return new TransferOnCard("5559 0000 0000 0001", "11000"); }

  public static TransferOnCard getTransferBalanceInfo() { return new TransferOnCard("5559 0000 0000 0002", "11000"); }

  public static TransferOnCard getTransferKopecksInfo() { return new TransferOnCard("5559 0000 0000 0002", "15,15"); }

  public static TransferOnCard getTransferKopecksV2Info() { return new TransferOnCard("5559 0000 0000 0001", "15,15"); }
}






