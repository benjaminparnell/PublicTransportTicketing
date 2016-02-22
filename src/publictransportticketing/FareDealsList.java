
package publictransportticketing;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class FareDealsList {
    Vector<Fare> dealsList;
    
       
    Fare findDeal(String dealName){
        //TODO: Figure out what this should do and return
        return new Fare("1234abc", new TransportList(), new ZoneList());
    }
    
    Fare findDeal(Fare fare){
        //TODO: Figure out what this should do and return
        return new Fare("1234abc", new TransportList(), new ZoneList());
    }
    
    Fare getValidDeal(Journey journey){
        //TODO: Figure out what this should do and return
        return new Fare("1234abc", new TransportList(), new ZoneList());
    }
    
    void addDeal(Transport transport, int numberOfStops, Date time, ZoneList zones, String tokenType){
        //TODO: Figure out what this should do and return
    }
}
