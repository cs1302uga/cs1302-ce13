package cs1302.ce13;

import cs1302.Utility;

/**
 * Represents a container for {@code Object} objects. Each {@code ObjectContainer} contains a reference to another {@code ObjectContainer}.
 * {@code ObjectContainer} objects cannot store {@code null} values. 
 * However, they can reference {@code null}.
 */
public class ObjectContainer {

    /** The contents of this container. */
    private Object contents;
    /** A reference to another {@code ObjectContainer} */
    private ObjectContainer next;
    
    /**
     * Constructs a {@code cs1302.generics.ObjectContainer} object
     * with the specified {@code Object}. The specified value cannot
     * be {@code null}. This constructor sets the next reference to
     * {@code null}.
     *
     * @param contents the contents for the {@code ObjectContainer}
     * @throws NullPointerException if the contents are null.
     */
    public ObjectContainer(Object contents) {
	set(contents);
    } // ObjectContainer

    /**
     * Constructs a {@code cs1302.generics.ObjectContainer} object
     * with the specified {@code Object} and next reference. 
     * The specified contents value cannot be {@code null}. The next
     * reference may be {@code null}.
     *
     * @param contents the contents for the {@code ObjectContainer}.
     * @param next the {@code ObjectContainer} this container refers to.
     * @throws NullPointerException if the contents are null.
     */
    public ObjectContainer(Object contents, ObjectContainer next) {
	set(contents);
	this.next = next;
    } // ObjectContainer
    /**
     * Returns the referenced {@code ObjectContainer}.
     *
     * @return the referenced {@code ObjectContainer}.
     */
    public ObjectContainer getNext() {
	return next;
    } // getNext
    
    /**
     * Sets the {@code ObjectContainer} that this object
     * refers to.
     *
     * @param nextObj a reference to the specified {@code ObjectContainer}
     */
    public void setNext(ObjectContainer nextObj) {
	this.next = nextObj;
    } // setNext
    
    /**
     * Modifies the contents of this {@code ObjectContainer} object.
     * The specified value cannot be {@code null}.
     *
     * @param contents the contents for the {@code ObjectContainer}
     * @throws NullPointerException if the contents are null.
     */
    public void set(Object contents) {
	Utility.nullCheck("ObjectContainer: set", contents);
	this.contents = contents;
    } // set

    /**
     * Returns the contents of this {@code ObjectContainer} object.
     * @return the contents of this object container.
     */
    public Object get() {
	return contents;
    } // get

} // Container
