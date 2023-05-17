package com.introop.solid.personaddress;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Address> addressess;

    public Person(String name, int age, List<Address> addressess) {
        this.name = name;
        this.age = age;
        this.addressess = addressess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddressess() {
        return addressess;
    }

    public void setAddressess(List<Address> addressess) {
        this.addressess = addressess;
    }
}
