package publictransportticketing;

import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class TransportList {
    Vector<Transport> transport;
    
    Transport findTransport(String name){
        //TODO: Figure out what this should do and return
        return new Transport("test", new TransportType("bus"));
    }
    
    Transport findTransportByID(String ID){
        //TODO: Figure out what this should do and return
        return new Transport("test", new TransportType("train"));
    }
}
