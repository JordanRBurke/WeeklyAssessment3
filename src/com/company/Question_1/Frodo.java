package com.company.Question_1;

public class Frodo extends Gandolf{

    //Frodo customization
    int frodoAge;
    String frodoEyeColor;
    int frodoHeight;


    public Frodo(int gandolfAge, String gandolfStaffName, int frodoAge, String frodoEyeColor, int frodoHeight) {
        super(gandolfAge, gandolfStaffName);
        this.frodoAge = frodoAge;
        this.frodoEyeColor = frodoEyeColor;
        this.frodoHeight = frodoHeight;
    }

    public Frodo(int frodoAge, String frodoEyeColor, int frodoHeight) {
        this.frodoAge = frodoAge;
        this.frodoEyeColor = frodoEyeColor;
        this.frodoHeight = frodoHeight;
    }

    public Frodo() {




    }


    public int getFrodoAge() {
        return frodoAge;
    }

    public void setFrodoAge(int frodoAge) {
        this.frodoAge = frodoAge;
    }

    public String getFrodoEyeColor() {
        return frodoEyeColor;
    }

    public void setFrodoEyeColor(String frodoEyeColor) {
        this.frodoEyeColor = frodoEyeColor;
    }

    public int getFrodoHeight() {
        return frodoHeight;
    }

    public void setFrodoHeight(int frodoHeight) {
        this.frodoHeight = frodoHeight;
    }
}
