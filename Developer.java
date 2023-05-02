package ser_desr_home;

import java.io.*;

public class Developer extends Employee {
    int numofdev=15;


    // By implementing writeObject method,
    private void writeObject(ObjectOutputStream out) throws IOException
    {
        throw new NotSerializableException();
    }

     //By implementing readObject method,
    private void readObject(ObjectInputStream in) throws IOException
    {
        throw new NotSerializableException();
    }



}
