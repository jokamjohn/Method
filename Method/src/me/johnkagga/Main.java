package me.johnkagga;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        This object initiates with a string object
         */
        PezDispenser dispenser = new PezDispenser("yoga");
        System.out.printf("this is %s\n", dispenser.getCharacterName());
        System.out.print(dispenser.isEmpty());

        if (dispenser.isEmpty()){
            System.out.println("\nIt is empty");
        }
        System.out.println("Loading content......");
        //loading the dispenser
        dispenser.load();
        if (!dispenser.isEmpty()){
            System.out.println("It is not empty");
        }
    }
}
