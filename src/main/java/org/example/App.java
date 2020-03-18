package org.example;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Animal a1 = new Animal("Lily",2,"Brown","Blue","dog");
        Animal a2 = new Animal("Lily",2,"Brown","Blue","cat");
        Animal a3 = new Animal("Duke",2,"Brown","Blue","dog");
        Animal a4 = new Animal("Princess",2,"Brown","Blue","cat");
        Person p1 = new Person("Amy","Kyo","64998044446409","Blue","Red");
        Person p2 = new Person("Amy","Kyo","64998044446409","Blue","Red");
        Person p3 = new Person("Amy","Kyo","64998044446409","Blue","Red");
        Person p4 = new Person("Amy","Kyo","64998044446409","Blue","Red");

        ArrayList <Object> b = new ArrayList<>();
        b.add(a1);
        b.add(a2);
        b.add(a3);
        b.add(a4);
        b.add(p1);
        b.add(p2);
        b.add(p3);
        b.add(p4);
        int size= b.size();
        for (int i = 0; i < size ; i++) {
            System.out.println(b.get(i).toString());
        }





    }
}
