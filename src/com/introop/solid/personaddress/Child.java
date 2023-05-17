package com.introop.solid.personaddress;

import java.util.List;

public class Child extends Person {
    private String favouriteColour;

    public Child(String name, int age, List<Address> addressess, String favouriteColour) {
        super(name, age, addressess);
        this.favouriteColour = favouriteColour;
    }


}
