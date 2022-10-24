package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.AddTimeEntryConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

public class LoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT, email);
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT, password);
        MobileActionManager.click(LoginConstants.LOGIN_BUTTON);
    }

    public static void isLoginViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.LOGIN_HEADER);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT), "Login page failed to load");
    }

    public static void isUserViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.MENU);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.TOOLBAR), "User page failed to load");
    }
}
