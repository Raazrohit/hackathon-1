package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Test;
public class SortingCitiesTest {
    SortingCities sortingCities;
    String[] citiesname;
    int[] distance;

    @Before
    public void setUp()  {
        sortingCities = new SortingCities();
        citiesname = new String[]{"Bern","Lucerne","Interlaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"};
        distance = new int[] {138,52,118,136,85,276,103,87,214,101};
    }

    @After
    public void tearDown()  {
        sortingCities = null;
        citiesname = null;
        distance = null;
    }

    //write all the test cases here


    @Test
    public void citiesToUpperCase(){
        String[] expected={"BERN","LUCERNE","INTERLAKEN","GRINDELWALD","ENGELBERG","GENEVA","MURREN","BASEL","ZERMATT","JUNGFRAUJOCH"};
        String[] actual = sortingCities.convertToUpperCase(citiesname);
        assertEquals(expected,actual);

    }

    @Test
    public void city(){
        String actual = sortingCities.nearZurich(citiesname,distance);
        assertEquals("Lucerne",actual);
        assertEquals("",sortingCities.nearZurich(new String[0],distance));
    }

    @Test
    public void cityFromZurich(){
        String actual = sortingCities.greaterCites(citiesname,distance);
        assertEquals("Geneva",actual);
        assertEquals("",sortingCities.greaterCites(citiesname,new int[0]));
    }
}