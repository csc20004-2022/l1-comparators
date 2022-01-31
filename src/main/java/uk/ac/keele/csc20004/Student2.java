/* ***********************
 * CSC-20004 LECTURE 1   *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

/**
 * A class defining a student as a pair of their ID and name. This class extends
 * Student1, and its main purpose is to provide a specialised version of
 * equals() that checks only the IDs of the students.
 *
 * @see Student1
 * @see HashcodeDemo
 *
 * @author Marco Ortolani
 */
public class Student2 extends Student1 {

    /**
     * Constructor for a Student object, with obvious meaning.
     *
     * @param id   an integer representing the student's ID
     * @param name a String representing the student's name
     */
    public Student2(int id, String name) {
        super(id, name);
    }

    /**
     * Overridden equals() method. Students are compared wrt their IDs.
     * Note that the equals() method must take a generic Object as parameter
     * (ideally, you may want to compare a Student to an object of a different class).
     * A good practice is to implement your version of equals for your specific class
     * (by using instanceof) and then delegating the general comparison to the default
     * implementation (which would return false in our case).
     *
     * @param o the Object to compare to
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Student1) {
            return this.getId() == ((Student1) o).getId();
        } else
            return super.equals(o);
    }
}
