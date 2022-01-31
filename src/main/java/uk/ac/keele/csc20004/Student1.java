/* ***********************
 * CSC-20004 LECTURE 1   *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

/**
 * A class  defining a student as a pair of their ID and name.
 * Student objects are immutable (the fields are final).
 *
 * In this implementation, equals() and hashcode() are *not* overridden, so
 * those objects will make use of the default equals() method as provided by Object.
 *
 * @see java.lang.Object#equals(Object)
 * @see HashcodeDemo
 *
 * @author Marco Ortolani
 */
public class Student1 {
    private final int id;
    private final String name;

    /**
     * Constructor for a Student object, with obvious meaning.
     *
     * @param id an integer representing the student's ID
     * @param name a String representing the student's name
     */
    public Student1(int id, String name) {
        this.name = name;
        this.id = id;
    }

    // no real need for a javadoc here...
    // it's just a getter; functionality is obvious
    public int getId() {
        return id;
    }

    // no real need for a javadoc here...
    // it's just a getter; functionality is obvious
    public String getName() {
        return name;
    }

}
