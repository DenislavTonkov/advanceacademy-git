package com.introop.solid.studentcalculator;

import java.util.List;

public class RightCalculateImpl implements Calculate {
    @Override
    public int sum(List<Integer> numbers) {
        int result = 0;
        for (Integer number: numbers) {
                result += number;
        }
        return result;
    }

    @Override
    public int maxNumber(List<Integer> numbers) {
        int result = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if(result < number){
                result = number;
            }
        }
        return result;
    }
}
