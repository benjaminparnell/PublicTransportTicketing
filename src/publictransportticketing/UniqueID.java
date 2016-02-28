package publictransportticketing;

import java.util.UUID;

/**
 *
 * @author benp
 */
public class UniqueID {
    public static String generate() {
        return UUID.randomUUID().toString();
    }
}
