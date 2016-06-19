package kim.stk1m1.examples;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import kim.stk1m1.pathfuzz.PathFuzz;

import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;

@RunWith(PathFuzz.class)
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mMainActivity;
    private Instrumentation mInstrumentation;
    private View mMainView;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(true);
        mInstrumentation = getInstrumentation();
        mMainActivity = getActivity();
        mMainView = mMainActivity.findViewById(R.id.hello_world);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testMainViewIsOnScreen() {
        View mainActivityDecorView = mMainActivity.getWindow().getDecorView();
        ViewAsserts.assertOnScreen(mainActivityDecorView, mMainView);
    }
}
