package colections;

import org.parking.WeekDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MyMapTest {


    @Test
    void getKey() {
        MyMap<WeekDay, Integer> myMap = new MyMap<>();
        myMap.put(WeekDay.MONDAY, 0);
        myMap.put(WeekDay.TUESDAY, 1);
        myMap.put(WeekDay.TUESDAY, 1);
        myMap.put(WeekDay.WEDNESDAY, 2);
        myMap.put(WeekDay.THURSDAY, 3);
        myMap.put(WeekDay.FRIDAY, 4);
        assertEquals(0, myMap.get(WeekDay.MONDAY));
    }

    @Test
    void getKeyWednesday() {
        MyMap<WeekDay, Integer> myMap = new MyMap<>();
        myMap.put(WeekDay.MONDAY, 0);
        myMap.put(WeekDay.TUESDAY, 1);
        myMap.put(WeekDay.TUESDAY, 1);
        myMap.put(WeekDay.WEDNESDAY, 2);
        myMap.put(WeekDay.THURSDAY, 3);
        myMap.put(WeekDay.FRIDAY, 4);
        assertEquals(1, myMap.get(WeekDay.TUESDAY));
        assertEquals(6, myMap.size());
    }


    @Test
    void getRefactor() {
        MyMap<WeekDay, Integer> myMap = new MyMap<>();
        myMap.put(WeekDay.MONDAY, 0);
        myMap.put(WeekDay.TUESDAY, 1);
        assertEquals(1, myMap.get(WeekDay.TUESDAY));
        assertEquals(2, myMap.size());
    }

    @Test
    void addOneObject(){
        MyMap<WeekDay, Integer> myMap = new MyMap<>();
        myMap.put(WeekDay.MONDAY, 0);
        assertEquals("[MONDAY-0]", myMap.toString());
    }

    @Test
    void addTwoObject(){
        MyMap<WeekDay, Integer> myMap = new MyMap<>();
        myMap.put(WeekDay.MONDAY, 0);
        myMap.put(WeekDay.MONDAY, 1);
        myMap.put(WeekDay.TUESDAY, 1);
        assertEquals("[MONDAY-1, TUESDAY-1]", myMap.toString());
    }

    @Test
    void addTForeObject(){
        MyMap<WeekDay, Integer> myMap = new MyMap<>();
        myMap.put(WeekDay.MONDAY, 0);
        myMap.put(WeekDay.MONDAY, 1);
        myMap.put(WeekDay.TUESDAY, 1);
        myMap.put(WeekDay.TUESDAY, 2);
        assertEquals("[MONDAY-1, TUESDAY-2]", myMap.toString());
    }

    @Test
    void zeroMonday(){
        MyMap<Integer, WeekDay> myMap = new MyMap<>();
        myMap.put(0, WeekDay.MONDAY);
        assertEquals("[0-MONDAY]", myMap.toString());
    }

    @Test
    void zeroTuesday(){
        MyMap<Integer, WeekDay> myMap = new MyMap<>();
        myMap.put(0, WeekDay.MONDAY);
        myMap.put(0, WeekDay.TUESDAY);
        assertEquals("[0-TUESDAY]", myMap.toString());
    }

}