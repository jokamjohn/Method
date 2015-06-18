package me.johnkagga;

/**
 * Created by JohnKagga on 6/18/2015.
 */
public class PezDispenser {
    /*
    We have created a PezDispenser (object)
    its maximum input is 12, that is why it a constant
    mcharacter is the type of the dispenser
     */
    public static final int MAX_PREZ = 12;
    /*
    final means this value cannot be changes
    static enables it to be read off the class directly
     */
    private String mCharacterName = "Yoga";
    private int mPezCount;

    /*
    The constructor takes in the desired type of prez.
    It enables construction when the object is instantiated
     */
    public PezDispenser(String characterName) {
        mCharacterName = characterName;
        mPezCount = 0; //variable is initialized when the class is instantiated
    }

    /*
    This method returns the name of the prez character
     */
    public String getCharacterName() {
        return mCharacterName;
    }

    public void load (){
        //we are filling the dispenser with maximum prezs
        //when this method is called, this is the default value
        load(MAX_PREZ);
    }

    public boolean isEmpty () {
        //checks for contents in the dispenser
        return mPezCount == 0;
    }

    public boolean dispense(){
        //return false if it is empty
        boolean wasDispensed = false;
        if (!isEmpty()){
            mPezCount--;
            //return true if it is not empty.
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public void load(int pezAmount){
        //user can increment mpezcount
        //We are adding an exception so that perAmount input does not exceed maximum(MAXPREZ)
        int newAmount = mPezCount + pezAmount;
        if (newAmount > MAX_PREZ){
            throw new IllegalArgumentException("Too many pez entered");
        }
        //else the new mpezAmount will be
        mPezCount =newAmount;

    }
    /*
    A method signature is a name and value of the method
     */
}
