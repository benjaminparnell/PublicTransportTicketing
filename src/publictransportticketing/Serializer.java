package publictransportticketing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Benjamin Parnell
 */
public class Serializer {
    private final String filePath;
    
    /**
     * Creates a Serializer that will read and write instances of Object to filePath.
     * @param filePath 
     */
    public Serializer(String filePath) {
        this.filePath = filePath;
    }
      
    /**
     * Takes an instance of Object and writes to filePath
     * @param object
     * @throws IOException 
     */
    public void serializeObject(Object object) throws IOException {
       FileOutputStream fileWriteStream = new FileOutputStream(filePath);
       ObjectOutputStream outputStream = new ObjectOutputStream(fileWriteStream);
       outputStream.writeObject(object);
       outputStream.close();
       fileWriteStream.close();
    }
    
    /**
     * Opens the file at filePath and attempts to read it into memory. You will need to case the 
     * returned Object to your desired type.
     * @return Object
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public Object deserializeObject() throws IOException, ClassNotFoundException {
       FileInputStream fileReadStream = new FileInputStream(filePath);
       ObjectInputStream inputStream = new ObjectInputStream(fileReadStream);
       Object object = inputStream.readObject();
       inputStream.close();
       fileReadStream.close();
       return object;
    }
}