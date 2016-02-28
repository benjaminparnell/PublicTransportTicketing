package publictransportticketing;

import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class ZoneList{
    public Vector<Zone> zones;
    
    /**
     * Creates a new instance of ZoneList.
     */
    public ZoneList(){
        this.zones = new Vector<Zone>();
    }
    
    /**
     * Attempts to find a Zone in zones that has the ID of zoneID.
     * @param zoneID
     * @return Zone
     */
    public Zone findZone(String zoneID){
        //get a zone based on the zone ID.
        Zone zone;
        for(int i = 0; i < this.zones.size(); i++){
            zone = this.zones.get(i);
            if (zone.zoneName.equals(zoneID)){
                return zone;
            }
        }
        return null;
    }
    
    /**
     * Pass through to java.util.Vector. Returns true if the add succeeded.
     * @param zone
     * @return boolean 
     */
    public boolean addZone (Zone zone) {
        return this.zones.add(zone);
    }
    
    /**
     * Pass through to java.util.Vector
     * @return boolean 
     */
    public boolean isEmpty() {
        return this.zones.isEmpty();
    }
    
    public boolean checkIfExists(Zone zone){
        return zones.contains(zone);
    }
}