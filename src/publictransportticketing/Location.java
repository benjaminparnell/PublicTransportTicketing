package publictransportticketing;

/**
 *
 * @author benp
 */
public class Location {
    private final float latitude;
    private final float longitude;
    
    public Location (float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    /**
     * Returns the latitude.
     * @return float
     */
    public float getLatitude() {
        return this.latitude;
    }
    
    /**
     * Returns the longitude.
     * @return float
     */
    public float getLongitude() {
        return this.longitude;
    }
}
