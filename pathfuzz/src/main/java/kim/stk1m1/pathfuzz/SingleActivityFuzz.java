package kim.stk1m1.pathfuzz;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

/**
 * The PathFuzz: The code path fuzz tester (also supports regular JUnit @Test annotations)
 *
 * @author Sung-Taek, Kim
 * @version 0.1
 */
public abstract class SingleActivityFuzz <T extends Activity> extends ActivityInstrumentationTestCase2<T> {

    /**
     * Creates an {@link SingleActivityFuzz}.
     *
     * @param activityClass The activity to test. This must be a class in the instrumentation
     * targetPackage specified in the AndroidManifest.xml
     */
    public SingleActivityFuzz(Class<T> activityClass) {
        super(activityClass);
    }
}
