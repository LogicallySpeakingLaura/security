package defensive_copying;

/**
 * Class to demonstrate how to copy and clone the input/output of a mutable object.
 * Copyright: Oracle
 * https://www.oracle.com/java/technologies/javase/seccodeguide.html#6
 *
 * @author LogicallySpeakingLaura
 * @version 2020.10.16
 * @see MutableObject for copied object's structure
 */
public class ShallowCopy
{

    //Attributes
    private String str;
    private MutableObject mo;


    //Constructors
    public ShallowCopy() {
    }

    public ShallowCopy(MutableObject mo, String str) {
        this.mo = mo;
        this.str = str;
    }


    /**
     * Method to demonstrate how to create a shallow copy using a reference to an external object.
     * Different objects, same values and references, changing one changes the other
     */
    public void createCopy()
    {
        MutableObject mo = new MutableObject("not empty"); //referenced external object
        ShallowCopy sc = new ShallowCopy(mo, "also not empty"); //instantiation of current class

        ShallowCopy shallowCopy = new ShallowCopy(sc.getMo(), sc.getStr()); //copy references MutableObject as well as its own attribute(s)
    }


    //Getters & setters
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public MutableObject getMo() {
        return mo;
    }

    public void setMo(MutableObject mo) {
        this.mo = mo;
    }

}