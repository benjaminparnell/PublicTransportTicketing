package publictransportticketing;

/**
 *
 * @author benp
 */
public class Location {
    private final float latitude;
    private final float longitude;

    Location (float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public float getLatitude() {
        return this.latitude;
    }
  
    public float getLongitude() {
        return this.longitude;
    }
}
