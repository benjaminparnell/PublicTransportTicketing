package publictransportticketing;

import java.util.UUID;

/**
 *
 * @author benp
 */
public class UniqueID {
    /**
     * Creates a random UUID using java.util.UUID and calls toString() on it, returning the result.
     * @return String 
     */
    public static String generate() {
        return UUID.randomUUID().toString();
    }
}
