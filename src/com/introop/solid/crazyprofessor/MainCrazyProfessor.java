package com.introop.solid.crazyprofessor;

import java.util.*;

public class MainCrazyProfessor {
    public static void main(String[] args) {

        List<String> students = Arrays.asList("Ivan", "Ivana", "Spas", "Spasimira", "Gergana");
        Map<String, Boolean> notes = new HashMap<>();

        Random random = new Random();
        int lateStudentNumber = 0;
//        Popalvame zapiskite
        for (String student : students) {
            boolean isLate = random.nextBoolean();
            notes.put(student, random.nextBoolean());
            String message = isLate ? "is late": "on time";
            System.out.println(student + " is " + message);
//            lateStudentNumber = isLate ? lateStudentNumber++ : lateStudentNumber;
            if(isLate){
                lateStudentNumber++;
            }
        }

        if(lateStudentNumber > students.size() / 2){
            System.out.println("Won't enter");
        }else{
            System.out.println("make an exam");
        }

    }
}
