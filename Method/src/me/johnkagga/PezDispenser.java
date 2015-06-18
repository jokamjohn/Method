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
    private String mCharacterName = "Yoga";

    /*
    The constructor takes in the desired type of prez.
    It enables construction when the object is initiated
     */
    public PezDispenser(String characterName) {
        mCharacterName = characterName;
    }

    /*
    This method returns the name of the prez character
     */
    public String getCharacterName() {
        return mCharacterName;
    }
}
