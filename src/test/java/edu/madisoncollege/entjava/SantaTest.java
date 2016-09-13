package edu.madisoncollege.entjava;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Austin Chappell on 9/12/2016.
 */
public class SantaTest {

    SantaInAnElevator test;
    List directions;

    @Before
    public void setup() {
        test = new SantaInAnElevator();

    }

    @Test
    public void santaTest() throws Exception {
        directions = test.loadDirections();
        test.determineFloor(directions);
    }

    @Test
    public void test1() {
        directions = new ArrayList();
        directions.add("(");
        directions.add(")");

        test.determineFloor(directions);

    }

    @Test
    public void test2() throws Exception {
        directions = new ArrayList();
        directions.add("(");
        directions.add(")");
        directions.add("(");

        test.determineFloor(directions);

    }

    @Test
    public void test3() throws Exception {
        directions = new ArrayList();
        directions.add("(");
        directions.add(")");
        directions.add(")");

        test.determineFloor(directions);

    }
}
