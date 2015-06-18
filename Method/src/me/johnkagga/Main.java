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

        //loop through the stored prez. the while loop runs as long as its true
        while (dispenser.dispense()){
            System.out.println("We are eating");
        }
        //when it is empty
        if (dispenser.isEmpty()){
            System.out.println("They are done");
        }
        //add more pezs
        dispenser.load(4);
        dispenser.load(5);
        //loop through them
        while (dispenser.dispense()){
            System.out.println("We are eating");
        }

        /*
        we put code in try catch block
        try: code that is likely going to cause an exception
        catch: exception and display message to the user
         */
        try {
            dispenser.load(500);
            System.out.println("This will never happen");
        } catch (IllegalArgumentException iae) {
            System.out.println("There was an error");
            System.out.printf("Because %s",iae.getMessage());
        }
    }
}
