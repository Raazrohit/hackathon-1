package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
//import java.util.Test;
public class SortingCitiesTest {
    SortingCities object;
    String[] citiesname;
    int[] distance;

    @Before
    public void setUp()  {
        object = new SortingCities();
        citiesname = new String[]{"Bern","Lucerne","Interlaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"};
        distance = new int[]{138,52,118,136,85,276,103,87,214,101};
    }

    @After
    public void tearDown()  {

    }

    //write all the test cases here


    @Test
    public void citiesToUpperCase(){
        String[] expected={"BERN","LUCERNE","INTERLAKEN","GRINDELWALD","ENGELBERG","GENEVA","MURREN","BASEL","ZERMATT","JUNGFRAUJOCH"};
        String[] actual = object.convertToUpperCase(citiesname);
        assertArrayEquals(expected,actual);

    }

    @Test
    public void city(){
        String actual = object.greaterCites(distance,citiesname);
        assertEquals("Geneva",actual);
    }

    @Test
    public void cityFromZurich(){
        String actual = object.nearZurich(distance,citiesname);
        assertEquals("Lucerne",actual);
    }
}