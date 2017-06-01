package com.epicodus.myrestaurants;

import android.support.test.rule.ActivityTestRule;

import com.epicodus.myrestaurants.ui.RestaurantListActivity;

import org.junit.Rule;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by Guest on 5/23/17.
 */


public class RestaurantsActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<RestaurantListActivity> activityTestRule =
            new ActivityTestRule<>(RestaurantListActivity.class);

//    @Test
//    public void listItemClickDisplaysToastWithCorrectRestaurant() {
//        View activityDecorView = activityTestRule.getActivity().getWindow().getDecorView();
//        String restaurantName = "Mi Mero Mole";
//        onData(anything())
//                .inAdapterView(withId(R.id.listView))
//                .atPosition(0)
//                .perform(click());
//        onView(withText(restaurantName)).inRoot(withDecorView(not(activityDecorView)))
//                .check(matches(withText(restaurantName)));
//    }
}
