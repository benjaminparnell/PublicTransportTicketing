package publictransportticketing;

import org.joda.time.DateTime;

/**
 *
 * @author Swapnull
 */
public class Fare {
    String fareID;
    TransportList transport;
    ZoneList zones;
    int stopCount;
    float price;
    DateTime startTime;
    DateTime endTime;
    String tokenType; //should be of type TokenType, which does not exist on uml.
    
    Fare(String fareID, TransportList transport, ZoneList zones){
        this.fareID = fareID;
        this.transport = transport;
        this.zones = zones;
    }
    
    boolean checkFare(JourneyList journeyList){
        //TODO: Figure out what this should return
        return false;
    }
}
