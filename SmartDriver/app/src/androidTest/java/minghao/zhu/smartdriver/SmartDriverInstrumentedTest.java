package minghao.zhu.smartdriver;

import android.view.View;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.matcher.ViewMatchers;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SmartDriverInstrumentedTest {
    @Rule
    public ActivityTestRule<ControlPanel> activityTestRule =
            new ActivityTestRule<>(ControlPanel.class);

}
