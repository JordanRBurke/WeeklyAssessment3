package com.company.Question_4;

import com.sun.xml.internal.bind.v2.model.core.ArrayInfo;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    int potato = 5;




    public static void main(String[] args) {
        Main main = new Main();
        main.displayArray();
        String potato = "Maybe potato";
        String potato2 = "Spicy potato";
        String potato3 = "Hot potato";
        String potato4 = "Mild potato";
        String potato5 = "Potato Milkshake";
        String potato6 = "No potato";
        List<String> arrayLists = new ArrayList();
        arrayLists.add(potato);
        arrayLists.add(potato2);
        arrayLists.add(potato3);
        arrayLists.add(potato4);
        arrayLists.add(potato5);
        arrayLists.add(potato6);


        /*
        1. In this main method initialize a List as an ArrayList.
        Add 6 values of your choosing to this ArrayList.
        2. Create a new method in this class called displayArray that takes a List parameter.
        3. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */



    }

    public void displayArray() {

        System.out.println(potato);

//        for () {
//
//        }



    }



}
