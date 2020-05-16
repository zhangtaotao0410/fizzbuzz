package com.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_print_num_when_input_is_normal_num() {
        FizzBuzz fizzBuzz1 = new FizzBuzz(1);
        FizzBuzz fizzBuzz2 = new FizzBuzz(2);
        assertThat(fizzBuzz1.print(), is("1"));
        assertThat(fizzBuzz2.print(), is("2"));
    }
    @Test
    public void should_print_fizz_when_input_is_divided_3(){
        FizzBuzz fizzBuzz1 = new FizzBuzz(3);
        FizzBuzz fizzBuzz2 = new FizzBuzz(6);
        assertThat(fizzBuzz1.print(),is("fizz"));
        assertThat(fizzBuzz2.print(),is("fizz"));
    }
}
