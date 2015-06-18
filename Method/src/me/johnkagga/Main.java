package me.johnkagga;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        This object initiates with a string object
         */
        PezDispenser dispenser = new PezDispenser("yoga");
        System.out.printf("this is %s",dispenser.getCharacterName());
    }
}
