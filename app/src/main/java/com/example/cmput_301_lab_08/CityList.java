package com.example.cmput_301_lab_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();


    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to be added
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * Returns a sorted list of cities
     * @return
     *      return the sorted list
     */
    public List<City>getCities(){
        List<City>list = cities;
        Collections.sort(list);
        return list;
    }


    public boolean hasCity(City city){
        return false;
    }
}