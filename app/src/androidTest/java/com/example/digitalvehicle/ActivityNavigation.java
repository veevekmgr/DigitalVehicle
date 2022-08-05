package com.example.digitalvehicle;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.action.ViewActions;

import com.example.digitalvehicle.activities.LoginUserActivity;
import com.example.digitalvehicle.activities.MainActivity;
import com.example.digitalvehicle.activities.MenuActivity;

import org.junit.Test;

public class ActivityNavigation {
    @Test
    public void chkLoginSignUpRedirection() {
        ActivityScenario.launch(MenuActivity.class);
        onView(withId(R.id.login_btn)).perform(click());
        ActivityScenario.launch(MenuActivity.class);
        onView(withId(R.id.request_btn)).perform(click());
    }

    @Test
    public void chkBackBtnRedirection() {
        ActivityScenario.launch(LoginUserActivity.class);
        onView(withId(R.id.back_Btn)).perform(click());
    }

    @Test
    public void chkExit() {
        ActivityScenario.launch(MainActivity.class);
        ViewActions.pressBack();
    }


}
