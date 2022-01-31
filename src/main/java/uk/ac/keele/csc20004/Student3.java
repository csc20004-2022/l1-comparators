/* ***********************
 * CSC-20004 LECTURE 1   *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

/**
 * A class defining a student as a pair of their ID and name.
 * This class extends Student2, and inherits the equals() method from it.
 * It adds a specialised version of hashcode() that uses the student ID as hash.
 * Note that this is *not* a good choice, and it is done here just for the sake of
 * explanation.
 * Also note that Student1 and Student2 also implicitly have a hashcode() method, but
 * they just rely on the one inherited from Object.
 *
 * @see Student1
 * @see Student2
 * @see Object#hashCode()
 * @see HashcodeDemo
 *
 * @author Marco Ortolani
 */
public class Student3 extends Student2 {

    public Student3(int id, String name) {
        super(id, name);
    }

    // equals() is inherited from Student2()

    /**
     * Overridden version of the hashcode() method from Object.
     * A hash code is just an integer computed from propertied of the object;
     * however it should possess some mathematicals properties (e.g., it should spread
     * the hashed object evenly over the destination set).
     * Here, I am using the ID which is formally ok, but does not
     * possess those properties so it is *not* a good choice.
     */
    @Override
    public int hashCode() {
        // this is just an example to prove a point
        // the id is *not* a good choice for a hash code!
        return this.getId();
    }
}
