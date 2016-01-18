package publictransportticketing;

/**
 *
 * @author benp
 */
public class Stop {
    public String stopId;
    public String stopName;
    public Location stopLocation;
    public String stopType;
    public Zone zone;
 
    public Stop(String stopId, String stopName, Location stopLocation, String stopType, Zone zone) {
        this.stopId = stopId;
        this.stopName = stopName;
        this.stopLocation = stopLocation;
        this.stopType = stopType;
        this.zone = zone;
    }
}
