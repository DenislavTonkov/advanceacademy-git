package com.introop.solid.studentcalculator;

import java.util.List;

public class GoshoCalculateImpl implements Calculate {
    @Override
    public int sum(List<Integer> numbers) {
        int result = 0;
        for (Integer number: numbers) {
            if(number % 2 != 0){
                result += number;
            }
        }
        return result;
    }

    @Override
    public int maxNumber(List<Integer> numbers) {
        return numbers.get(0);
    }
}
