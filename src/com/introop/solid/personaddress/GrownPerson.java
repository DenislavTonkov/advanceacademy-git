package com.introop.solid.personaddress;

import java.util.List;

public class GrownPerson extends Person {
    private String hobby;

    public GrownPerson(String name, int age, List<Address> addressess, String hobby) {
        super(name, age, addressess);
        this.hobby = hobby;
    }


    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
