package serializing;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Class to demonstrate the encryption and decryption of object serialization and deserialization.
 * Copyright: Oracle
 * https://www.oracle.com/java/technologies/javase/seccodeguide.html#8
 *
 * @author LogicallySpeakingLaura
 * @version 2020.10.10
 * @see immutability.Boot for understanding of class construction
 */
public final class SecretStuff implements Serializable
{

    //Attributes
    private final String SECRET_STR;

    private static final long serialVersionUID = -2020270707415652354L;


    //Constructors
    private SecretStuff( String secretStr )
    {
        this.SECRET_STR = secretStr;
    }

    public static SecretStuff getInstance( String secretStr )
    {
        return new SecretStuff( secretStr );
    }


    //Deserialization
    private void readObject( ObjectInputStream ois )
            throws IOException, ClassNotFoundException
    {
        decrypt( ois.readUTF() ); //decrypt what is being retrieved from stream in the moment
    }

    //Serialization
    private void writeObject( ObjectOutputStream oos )
            throws IOException
    {
        oos.writeUTF( encrypt(SECRET_STR) ); //encrypt what is being retrieved from stream in the moment
    }

    private String encrypt( String toEncrypt )
    {
        //Code encryption method of choice
    }

    private String decrypt( String toDecrypt )
    {
        //Code decryption method of choice
    }


    //Getters as normal...

}