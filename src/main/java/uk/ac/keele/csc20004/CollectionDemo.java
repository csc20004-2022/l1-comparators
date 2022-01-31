/* ***********************
 * CSC-20004 LECTURE 1   *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Example taken from Deitel {@literal &} Deitel "Java How to program" 7th ed.
 * Using the Collection and List interfaces from the Java Collection Framework.
 * The concrete implementation, in this case, is an ArrayList.
 *
 * @author Marco Ortolani
 */
public class CollectionDemo {
    private static final String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
    private static final String[] removeColors = { "RED", "WHITE", "BLUE" };

    // create ArrayList, add colors to it and manipulate it
    public CollectionDemo() {
        List<String> list = new ArrayList<>();
        List<String> removeList = new ArrayList<>();

        // add elements in colors array to list
        for (String color : colors)
            list.add(color);

        // add elements in removeColors to removeList
        for (String color : removeColors)
            removeList.add(color);

        System.out.println("ArrayList: ");

        // output list contents
        for (int count = 0; count < list.size(); count++)
            System.out.printf("%s ", list.get(count));

        // remove colors contained in removeList
        removeColors(list, removeList);
        System.out.println("\n\nArrayList after calling removeColors(): ");

        // output list contents
        for (String color : list)
            System.out.printf("%s ", color);

        System.out.println();
    } // end CollectionTest constructor

    // remove colors specified in collection2 from collection1
    private void removeColors(Collection<String> collection1, Collection<String> collection2) {

        // get iterator
        Iterator<String> iterator = collection1.iterator();

        // loop while collection has items
        while (iterator.hasNext())
            if (collection2.contains(iterator.next()))
                iterator.remove();
        // remove current Color
    } // end method removeColors

    public static void main(String args[]) {
        new CollectionDemo();
    } // end main
} // end class CollectionTest
