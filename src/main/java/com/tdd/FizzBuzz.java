package com.tdd;

public class FizzBuzz {
    private int num;

    public FizzBuzz(int num) {
        this.num = num;
    }

    public String print() {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        }
        if (num % 3 == 0) {
            return "fizz";
        }
        if (num % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(num);
    }
}
