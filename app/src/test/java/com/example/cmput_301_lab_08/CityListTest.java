package com.example.cmput_301_lab_08;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CityListTest {
    @Test
    public void testHasCity(){
        CityList cityList = new CityList();
        City city1 = new City("Edmonton", "AB");
        City city2 = new City("Saskatoon", "SK");
        City city3 = new City("Calgary", "SK");
        City city4 = new City("Suzhou", "Jiangsu");
        cityList.add(city1);
        assertTrue(cityList.hasCity(city1));
        cityList.add(city2);
        assertTrue(cityList.hasCity(city2));
        assertFalse(cityList.hasCity(city3));
        assertFalse(cityList.hasCity(city4));
    }
}
