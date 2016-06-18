package kim.stk1m1.pathfuzz;

import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

import java.util.Collections;

/**
 * The PathFuzz: The code path fuzz tester (also supports regular JUnit @Test annotations)
 *
 * @author Sung-Taek, Kim
 * @version 0.1
 */
public class PathFuzz extends Suite {

    public PathFuzz(Class<?> clazz) throws InitializationError {
        super(clazz, Collections.<Runner>emptyList());
    }
}