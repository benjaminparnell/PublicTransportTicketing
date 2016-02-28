package publictransportticketing;

import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class ZoneList{
    public Vector<Zone> zones;
    
    public ZoneList(){
        this.zones = new Vector<Zone>();
    }
    
    public Zone findZone(String zoneID){
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
    
    public boolean addZone (Zone zone) {
        return this.zones.add(zone);
    }
    
    public boolean isEmpty() {
        return this.zones.isEmpty();
    }
    
    public boolean checkIfExists(Zone zone){
        return zones.contains(zone);
    }
}