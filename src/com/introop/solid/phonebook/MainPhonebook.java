package com.introop.solid.phonebook;

import java.util.*;

public class MainPhonebook {
    public static void main(String[] args) {

        Map<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("Ivan", "123456789");
        phoneBook.put("Spas", "987654321");
        phoneBook.put("Ivana", "159357486");
        phoneBook.put("Spasimira", "35796543146");
        phoneBook.put("Georgi", "9654396543333");

        List<String> people = Arrays.asList("Spasimira", "Ivan", "Georgi");

//        for (String person : people) {
//            boolean isFound = false;
//            for (Map.Entry<String, String> entry: phoneBook.entrySet()) {
//                if (entry.getKey().equals(person)) {
//                    System.out.println(entry.getKey() + " - " + entry.getValue());
//                    isFound = true;
//                }
//            }
//            if(!isFound){
//                System.out.println();
//            }
//        }



        }

    }

