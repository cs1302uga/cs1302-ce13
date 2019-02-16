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

    /**
     * Returns the first {@code ObjectContainer} reference in a list
     * of {@code ObjectContainer} objects. The returned list is made
     * up of four {@code ObjectContainer} objects, each containing 
     * a single {@code String}. 
     *
     * @return a reference to the head of the {@code ObjectContainer} 
     * list.
     */
    private static ObjectContainer createStringList() {
        ObjectContainer oc = new ObjectContainer("Mike");
        oc = new ObjectContainer("Steve", oc);
        oc = new ObjectContainer("Linda", oc);
        oc = new ObjectContainer("Deborah", oc);
        return oc;
    } // createStringList

    /**
     * Returns the first {@code ObjectContainer} reference in a list
     * of {@code ObjectContainer} objects. The returned list is made
     * up of four {@code ObjectContainer} objects, each containing 
     * a single {@code Double}. 
     *
     * @return a reference to the head of the {@code ObjectContainer} 
     * list.
     */
    private static ObjectContainer createDoubleList() {
        ObjectContainer oc = new ObjectContainer(2);
        oc = new ObjectContainer(495.18, oc);
        oc = new ObjectContainer(1234.18, oc);
        oc = new ObjectContainer(1.237, oc);
        return oc;
    } // createStringList
    
} // Driver
