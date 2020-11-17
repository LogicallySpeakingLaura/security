package access;

/**
 * Class to demonstrate implementing a security policy for running an application.
 * Copyright: Oracle
 * https://www.oracle.com/java/technologies/javase/seccodeguide.html#9
 *
 * @author LogicallySpeakingLaura
 * @version 2020.10.16
 */
public class AppDriver
{

    /**
     * In the main method check that there is an instance of SecurityManager.
     * The command line input for this will be something like:
     * java -cp .:sealedJarFile.jar -Djava.security.manager -Djava.security.policy=security.policy AppDriver
     * @param args - command line input
     */
    public static void main( String[] args )
    {
        //this policy specifies read, write, delete permissions, if not specified in command line app will not run
        if ( System.getSecurityManager() == null )
        {
            //code for error message and exiting application
        }

        //if there is a SecurityManager, code to start running application
    }

    /**
     * This method demonstrates checking policy permissions against a specific function. In development,
     * this could be done anywhere however, is shown here for demonstrative purposes.
     */
    private static void checkPolicyPermissions()
    {
        if ( System.getProperty( "/<DIRECT_PATH>" ).equals( "read,write,delete" ) ) //can check for any combo of permissions
            //code to do requested functionality
        else
            //show error message and take appropriate action
    }

}
