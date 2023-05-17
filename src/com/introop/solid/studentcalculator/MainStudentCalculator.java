package com.introop.solid.studentcalculator;

import java.util.*;

public class MainStudentCalculator {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(15, 89, 2, 1, 76, 20);
        Calculate ivanCalculate = new IvanCalculateImpl();
        Calculate georgiCalculate = new GoshoCalculateImpl();
        Calculate rightCalc = new RightCalculateImpl();

        System.out.println(ivanCalculate.sum(numbers));
        System.out.println(ivanCalculate.maxNumber(numbers));

        System.out.println("----------");

        System.out.println(georgiCalculate.sum(numbers));
        System.out.println(georgiCalculate.maxNumber(numbers));

        System.out.println("----------");

        System.out.println(rightCalc.sum(numbers));
        System.out.println(rightCalc.maxNumber(numbers));
    }
}
