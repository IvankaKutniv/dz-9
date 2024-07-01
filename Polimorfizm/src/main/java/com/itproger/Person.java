package com.itproger;

public class Person {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected Person partner;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    // Method to check if retired
    public boolean isRetired() {
        if (this instanceof Woman) {
            return age >= 60;
        } else if (this instanceof Man) {
            return age >= 65;
        }
        return false; // Default case, should not happen ideally
    }

    // Method to register partnership
    public void registerPartnership() {
        if (this.partner != null) {
            System.out.println("Already in a partnership.");
        } else {
            System.out.println("Registered partnership.");
        }
    }

    // Method to deregister partnership
    public void deregisterPartnership(boolean revertLastName) {
        if (this.partner != null) {
            if (revertLastName && this instanceof Woman && this.partner instanceof Man) {
                this.lastName = this.partner.getLastName();
                this.partner = null;
                System.out.println("Partnership deregistered. Reverted to previous last name.");
            } else {
                this.partner = null;
                System.out.println("Partnership deregistered.");
            }
        } else {
            System.out.println("Not in a partnership.");
        }
    }

}
