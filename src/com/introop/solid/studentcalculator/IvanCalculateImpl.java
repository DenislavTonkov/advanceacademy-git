package com.introop.solid.studentcalculator;

import java.util.List;

public class IvanCalculateImpl implements Calculate {
    @Override
    public int sum(List<Integer> numbers) {
        int result = 0;
        for (Integer number: numbers) {
            if(number % 2 == 0){
                result += number;
            }
        }
        return result;
    }

    @Override
    public int maxNumber(List<Integer> numbers) {
        return numbers.get(numbers.size() - 1); // To get the last element!
    }
}
