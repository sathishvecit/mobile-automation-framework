package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BackupRecoveryPhrase extends BasePage {
    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[4]")
    private MobileElement confirm;
    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[27]")
    private MobileElement copy;

    //Method to click confirm button
    public BackupRecoveryPhrase tapConfirm() {
        click(confirm, "press confirm option");
        return this;
    }
    /*
    Method to copy the recovery phrase
     */
    public BackupRecoveryPhrase tapCopy() {
        click(confirm, "press copy option");
        return this;
    }
}
