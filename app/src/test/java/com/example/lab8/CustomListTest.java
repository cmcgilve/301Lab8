package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList() {
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City testCity = new City("Estevan", "SK");
        list.addCity(testCity);
        assertTrue(list.hasCity(testCity));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        City testCity = new City("Estevan", "SK");
        list.addCity(testCity);
        assertEquals(list.getCount(),listSize + 1);
        list.deleteCity(testCity);
        assertEquals(list.getCount(),listSize);
        assertFalse(list.hasCity(testCity));
    }

    @Test
    public void countCitiesTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.countCities(),listSize + 1);
        list.addCity(new City("Vancouver", "BC"));
        assertEquals(list.countCities(),listSize + 2);
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.countCities(),listSize + 3);
        list.addCity(new City("Calgary", "AB"));
        assertEquals(list.countCities(),listSize + 4);
    }
}
