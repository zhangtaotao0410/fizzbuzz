package com.tdd;

public class FizzBuzz {
    private int num;

    public FizzBuzz(int num) {

        this.num = num;
    }

    public String print() {
        if (num % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(num);
    }
}
