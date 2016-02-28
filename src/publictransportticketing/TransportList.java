package publictransportticketing;

import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class TransportList {
    public Vector<Transport> transports;
    
    public TransportList() {
        this.transports = new Vector<Transport>();
    }
    
    public Transport findTransportByID(String ID){
        for (Transport aTransport : this.transports) {
            if (aTransport.transportID.equals(ID)) {
                return aTransport;
            }
        }
        return null;
    }
    
    public boolean addTransport(Transport transport) {
        return this.transports.add(transport);
    }
}
