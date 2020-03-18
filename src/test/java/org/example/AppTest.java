package org.example;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void CollectionTesting()
    {
        CollectionTest collectionApp = new CollectionTest();
        collectionApp.populate(5);
        assertTrue(collectionApp.find(5));
    }

    @Test
    public void MapTesting()
    {
        MapTest mapApp = new MapTest();
        mapApp.populate();
        assertEquals("Jordan", mapApp.findValueAt("5"));
    }

    @Test
    public void SetTesting()
    {
        SetTest setApp = new SetTest();
        setApp.populate(2);
        assertEquals("Found", setApp.find(2));
        assertFalse(setApp.canAdd(2));
    }

    @Test
    public void ListTest()
    {
        ListTest listApp = new ListTest();
        listApp.populate(5);
        assertEquals(12, listApp.findAt(2));
    }
}


