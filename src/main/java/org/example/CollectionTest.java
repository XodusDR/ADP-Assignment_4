package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    Collection values = new ArrayList<Integer>();

    public void populate(int value)
    {
        for (int i = 0; i < 10; i++)
        {
            values.add(i * value);
        }
    }

    public boolean find(int value)
    {
        if (values.contains(value))
        {
            System.out.println(value + " Found");
            return true;
        }
        else
        {
            System.out.println(value + " NOT Found");
            return false;
        }
    }
}
