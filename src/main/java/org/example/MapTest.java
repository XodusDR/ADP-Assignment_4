package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    Map map = new HashMap();

    public void populate()
    {
        map.put("1", "Das");
        map.put("2", "Nik");
        map.put("3", "Ally");
        map.put("4", "Angela");
        map.put("5", "Jordan");
        map.put("6", "Kas");
        map.put("7", "Mimi");
    }

    public String findValueAt(String value)
    {
        if (map.containsKey(value))
            return map.get(value).toString();
        else
            return value + " Key has no value";
    }

    public void print()
    {
        Set<String> keys = map.keySet();
        for (String key: keys)
        {
            System.out.println(key + " " + map.get(key));
        }
    }
}
