package com.company.Question_3;

import java.util.Scanner;

public class Switch {
    Scanner input = new Scanner(System.in);



    public void switchStatement() {

        System.out.println("Selected a number between 0 and 4");

        switch (input.nextInt()) {
            case 0:
                System.out.println("You have selected 0!!! \n would you like to go back? Press 9");
                if (input.nextInt() == 9) {
                    switchStatement();
                }
                break;
            case 1:
                System.out.println("You have selected 1!! \n would you like to go back? Press 9");
                if (input.nextInt() == 9) {
                    switchStatement();
                }
                break;
            case 2:
                System.out.println("You have selected 2!!! \n would you like to go back? Press 9");
                if (input.nextInt() == 9) {
                    switchStatement();
                }
                break;
            case 3:
                System.out.println("You have selected 3!!! \n would you like to go back? Press 9");
                if (input.nextInt() == 9) {
                    switchStatement();
                }
                break;
            case 4:
                System.out.println("You have selected 4!!! \n would you like to go back? Press 9");
                if (input.nextInt() == 9) {
                    switchStatement();
                }
                break;
            default:
                System.out.println("You have selected a wrong number");
                switchStatement();
                break;
        }












    }



















}
