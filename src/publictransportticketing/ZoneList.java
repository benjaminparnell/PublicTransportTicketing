/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class ZoneList{
    Vector<Zone> zones;
    
    ZoneList(){
        super();
    }
    
    Zone findZone(String zoneID){
        //get a zone based on the zone ID.
        Zone zone = null;
        for(int i = 0; i < zones.size(); i++){
            zone = zones.get(i);
            if(zone.zoneName.equals(zoneID)){
                break;
            }
        }
        return zone;
    }
}