package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> color = new ArrayList<>(3);
        color.add("Black");
        color.add("Green");
        color.add("Wait");
        color.add("Yellow");
        color.add("Purple");
        color.add("Red");
        System.out.println(color);

        Collections.sort(color);
        System.out.println(color);

        Collections.reverse(color);
        System.out.println(color);

        Collections.shuffle(color);
        System.out.println(color);


        Man man1 = new Man("Alik",25,"Staff");
        Man man2 = new Man("Manas",1000,"Woriorr");

        Wooman wooman1 = new Wooman("Asia",11,"domohozaika");
        Wooman wooman2 = new Wooman("Alina",18,"domohozaika");

        ArrayList<Person> person = new ArrayList<>();
        person.add(man1);
        person.add(man2);
        person.add(wooman1);
        person.add(wooman2);

        System.out.println(person);



    }
}
