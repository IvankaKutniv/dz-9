package com.itproger;

public class Man extends Person {

    private boolean isMarried;

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.isMarried = false;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

}
