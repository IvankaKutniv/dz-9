package com.itproger;

public class App 
{
    public static void main( String[] args ) {

        Man mykhaylo = new Man("Mykhaylo", "Kharchuk", 70);
        Woman ivanna = new Woman("Ivanna", "Kutniv", 65);

        mykhaylo.setPartner(ivanna);
        ivanna.setPartner(mykhaylo);

        mykhaylo.registerPartnership();
        ivanna.registerPartnership();

        System.out.println("Is John retired? " + mykhaylo.isRetired());
        System.out.println("Is Jane retired? " + ivanna.isRetired());

        mykhaylo.deregisterPartnership(true);
        ivanna.deregisterPartnership(false);

    }
}
