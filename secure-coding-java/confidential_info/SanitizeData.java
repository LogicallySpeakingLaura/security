package confidential_info;

import java.io.*;

/**
 * Class to demonstrate purging sensitive information when exceptions are thrown.
 * Copyright: Oracle
 * https://www.oracle.com/java/technologies/javase/seccodeguide.html#2
 *
 * @author LogicallySpeakingLaura
 * @version 2020.10.16
 */
public class SanitizeData
{

    private void purgeExceptionData()
    {
        for ( File file : new File( "<DIRECTPATH>" ).listFiles() )
        {
            try
            {
                ObjectInputStream ois = new ObjectInputStream( new FileInputStream(file) );
                //code functionality
            }
            catch( IOException e )
            {
                //sysout a custom error message DO NOT print the stack trace
            }
        }
    }

}
