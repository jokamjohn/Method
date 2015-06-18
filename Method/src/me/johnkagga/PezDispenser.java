package me.johnkagga;

/**
 * Created by JohnKagga on 6/18/2015.
 */
public class PezDispenser {
    public static final int MAX_PREZ = 12;
    private String mCharacterName = "Yoga";

    public PezDispenser(String characterName) {
        mCharacterName = characterName;
    }

    public String getCharacterName() {
        return mCharacterName;
    }
}
