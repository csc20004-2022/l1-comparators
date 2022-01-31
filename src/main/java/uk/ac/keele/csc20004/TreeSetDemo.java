/* ***********************
 * CSC-20004 LECTURE 1   *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * An implementation of Comparator that relies on the
 * original comparison of Strings (lexicographic order, i.e. like
 * the dictionary)
 *
 * @see java.util.Comparator
 * @see java.lang.String#compareTo(String)
 */
class MyComparator1 implements Comparator<String> {
    public int compare(String str1, String str2) {
    String first_Str = str1 ;
    String second_Str = str2;

    return second_Str.compareTo(first_Str);
    }
}

/**
 * An implementation of Comparator that compares Strings only
 * wrt to their relative lenghts (so Strings with the same lenght are "equal")
 *
 * @see java.util.Comparator
 */
class MyComparator2 implements Comparator<String> {
    public int compare(String str1, String str2) {
        if (str1.length() < str2.length())
            return -1;
        else if (str1.length() > str2.length())
            return 1;
        else
            return 0;
    }
}

/**
 * An example of use of the TreeSet class, with Comparator.
 *
 * @see java.util.TreeSet
 * @see java.util.Comparator
 *
 * @author Marco Ortolani
 */
public class TreeSetDemo {
    public static void main(String[] args)
    {
        // Declare a set, as a TreeSet, providing the object implementing
        // the comparator ()
        // You can experiment with the other provided Comparator (MyComparator2)
        // or by implementing your own
        TreeSet<String> tree_set = new TreeSet<String>(new MyComparator1());

        tree_set.add("hello");
        tree_set.add("cya");
        tree_set.add("ciao");
        tree_set.add("farewell");
        tree_set.add("ciao");
        tree_set.add("bye");

        System.out.println("The elements sorted in descending order:");
        for (String element : tree_set)
            System.out.print(element + " ");
        System.out.println();

    }
}
