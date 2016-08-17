package kim.stk1m1.pathfuzz.exceptions;

/**
 * Path Fuzz, Parameters related errors
 *
 * @see
 * @author Sung-Taek, Kim
 * @version 0.1
 */
public class ParametersErrorException extends Exception {

    /**
     * the constructor
     *
     * @param message the error message
     */
    public ParametersErrorException(String message) {
        super(message);
    }
}
