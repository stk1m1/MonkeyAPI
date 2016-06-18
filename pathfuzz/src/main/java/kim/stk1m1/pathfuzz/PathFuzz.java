package kim.stk1m1.pathfuzz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.runner.Runner;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

import java.util.Collections;

import kim.stk1m1.pathfuzz.exceptions.ParametersErrorException;

/**
 * The PathFuzz: The code path fuzz tester (also supports regular JUnit @Test annotations)
 *
 * @author Sung-Taek, Kim
 * @version 0.1
 */
public class PathFuzz extends Suite {

    private final Logger log = LogManager.getLogger(getClass());

    public PathFuzz(Class<?> clazz) throws ParametersErrorException, InitializationError {
        super(clazz, Collections.<Runner>emptyList());
        // check if @paramters really exists
        /*
        if(!clazz.isAnnotationPresent(Parameterized.Parameters.class)) {
            throw new ParametersErrorException( "@Parameters( TestDirectory, Prefix, Suffix = '.json', TestDirectoryRootPropertyName = ''");
        }
        */
        log.debug("PathFuzz Constructed");
    }
}