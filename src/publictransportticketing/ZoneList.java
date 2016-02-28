package publictransportticketing;

import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class ZoneList{
    Vector<Zone> zones;
    
    ZoneList(){
        this.zones = new Vector<Zone>();
    }
    
    Zone findZone(String zoneID){
        //get a zone based on the zone ID.
        Zone zone;
        for(int i = 0; i < this.zones.size(); i++){
            zone = this.zones.get(i);
            if(zone.zoneName.equals(zoneID)){
                return zone;
            }
        }
        return null;
    }
    
    boolean checkIfExists(Zone zone){
        return zones.contains(zone);
    }
}