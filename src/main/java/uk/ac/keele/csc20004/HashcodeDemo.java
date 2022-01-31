/* ***********************
 * CSC-20004 LECTURE 1   *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 */
public class HashcodeDemo {
    public static void main(String[] args) {
        // Let's create two Student1's and check their hashcodes
        Student1 alex1 = new Student1(1, "Alex");
        Student1 alex2 = new Student1(1, "Alex");

        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());

        // and how hashcode reflects on equality
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));

        // Now, let's try again with
        Student2 jane1 = new Student2(100, "Jane");
        Student2 jane2 = new Student2(100, "Jane");

        System.out.println("jane1 hashcode = " + jane1.hashCode());
        System.out.println("jane2 hashcode = " + jane2.hashCode());

        System.out.println("Checking equality between jane1 and jane2 = " + jane1.equals(jane2));

        Student2 joe = new Student2(1, "Joe");
        List <Student2> studentsLst = new ArrayList<>();
        studentsLst.add(joe);
        System.out.println("Arraylist size = " + studentsLst.size());
        System.out.println("Arraylist contains Joe = " + studentsLst.contains(new Student2(1, "Joe")));

        HashSet<Student2> studentSet = new HashSet<>();
        studentSet.add(jane1);
        studentSet.add(jane2);
        System.out.println("HashSet size = " + studentSet.size());
        System.out.println("HashSet contains Jane (a) = " + studentSet.contains(new Student2(100, "Jane")));
        System.out.println("HashSet contains Jane (b) = " + studentSet.contains(jane2));

        Student3 tom1 = new Student3(55, "Tom");
        Student3 tom2 = new Student3(55, "Tom");

        HashSet<Student3> studentSet2 = new HashSet<>();
        studentSet2.add(tom1);
        studentSet2.add(tom2);
        System.out.println("HashSet size = " + studentSet2.size());
        System.out.println("HashSet contains Tom (a) = " + studentSet2.contains(new Student3(5, "Tom")));
        System.out.println("HashSet contains Tom (b) = " + studentSet2.contains(new Student3(55, "Tom")));
        System.out.println("HashSet contains Tom (c) = " + studentSet2.contains(tom2));
    }
}
