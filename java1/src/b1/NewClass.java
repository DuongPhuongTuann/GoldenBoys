/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import Java.util.List;
import Java.util.ArrayList;
import Java.util.Collections;
import Java.util.Comparator;

class SoftDrink {
    String name;
    String color;
    int volume; 

    SoftDrink (String name, String color, int volume) {
        this.name = name;
        this.color = color;
        this.volume = volume;
    }
}

public class ListItemComparision {
    public static void main (String...arg) {
        List<SoftDrink> softDrinkList = new ArrayList<SoftDrink>() ;
        softDrinkList .add(new SoftDrink("Faygo", "ColorOne", 4));
        softDrinkList .add(new SoftDrink("Fanta",  "ColorTwo", 3));
        softDrinkList .add(new SoftDrink("Frooti", "ColorThree", 2));       
        softDrinkList .add(new SoftDrink("Freshie", "ColorFour", 1));

        Collections.sort(softDrinkList, new Comparator() {
            @Override
            public int compare(Object softDrinkOne, Object softDrinkTwo) {
                //use instanceof to verify the references are indeed of the type in question
                return ((SoftDrink)softDrinkOne).name
                        .compareTo(((SoftDrink)softDrinkTwo).name);
            }
        }); 
        for (SoftDrink sd : softDrinkList) {
            System.out.println(sd.name + " - " + sd.color + " - " + sd.volume);
        }
        Collections.sort(softDrinkList, new Comparator() {
            @Override
            public int compare(Object softDrinkOne, Object softDrinkTwo) {
                //comparision for primitive int uses compareTo of the wrapper Integer
                return(new Integer(((SoftDrink)softDrinkOne).volume))
                        .compareTo(((SoftDrink)softDrinkTwo).volume);
            }
        });

        for (SoftDrink sd : softDrinkList) {
            System.out.println(sd.volume + " - " + sd.color + " - " + sd.name);
        }   
    }
}
