package edu.madisoncollege.entjava;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Practice working with JUnit by writing some test cases for the Interface List<E>:
 * 1.1 void add(int index, E e)
 * 1.2 void remove(int index)
 * 1.3 void get(int index)
 *
 * Add at least one test for an exception.
 */
public class ListTest {

    private List<String> myList;

    @Before
    public void setup() {
        myList = new ArrayList<String>();
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");
    }

    @Test
    public void testAddSuccess() {
        String elementToInsert = "Item 4";

        myList.add(elementToInsert);
        assertEquals("List size is incorrect", 4, myList.size());
        assertTrue("List missing inserted element", myList.contains(elementToInsert));
    }

    @Test
    public void testRemove() throws Exception {
        myList.remove(1);

        assertEquals("Expected a list size of 2", 2, myList.size());
    }

    @Test
    public void testGet() throws Exception {
        assertEquals(myList.get(0), "Item 1");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testException() throws Exception {
        myList.get(22);
    }
}