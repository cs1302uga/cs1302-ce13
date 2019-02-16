package cs1302.ce13;

/**
 * Driver program for cs1302 class exercise 13 using various types of 
 * container objects.
 * 
 * @author Brad Barnes and Supa' Mike
 * @version 1.0
 */

public class Driver {

    /**
     * Creates objects for each type of container to check basic functionality.
     * @param args command line argument array.
     */
    public static void main(String[] args) {
	
	ObjectContainer stringHead = createStringList();
	ObjectContainer doubleHead = createDoubleList();

	String lastString = stringHead.getNext()
	    .getNext()
	    .getNext()
	    .get();

	Double lastDouble = doubleHead.getNext()
	    .getNext()
	    .getNext()
	    .get();

	System.out.println(lastString);	
	System.out.println(lastDouble);
	
    } // main

    private static ObjectContainer createStringList() {

	ObjectContainer oc = new ObjectContainer("Mike");
	oc = new ObjectContainer("Steve", oc);
	oc = new ObjectContainer("Linda", oc);
	oc = new ObjectContainer("Deborah", oc);
    } // createStringList

    private static ObjectContainer createDoubleList() {

	ObjectContainer oc = new ObjectContainer(2.3);
	oc = new ObjectContainer(495.18, oc);
	oc = new ObjectContainer(1234.18, oc);
	oc = new ObjectContainer(1.901, oc);
    } // createStringList
    
} // Driver
