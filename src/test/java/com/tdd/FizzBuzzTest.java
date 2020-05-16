package com.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    private String fizzBuzzPrint(int num) {
        return new FizzBuzz(num).print();
    }

    @Test
    public void should_print_num_when_input_is_normal_num() {
        assertThat(fizzBuzzPrint(1), is("1"));
        assertThat(fizzBuzzPrint(2), is("2"));
    }

    @Test
    public void should_print_fizz_when_input_is_divided_3() {
        assertThat(fizzBuzzPrint(3), is("fizz"));
        assertThat(fizzBuzzPrint(6), is("fizz"));
    }

    @Test
    public void should_print_buzz_when_num_is_divided_5() {
        assertThat(fizzBuzzPrint(5), is("buzz"));
        assertThat(fizzBuzzPrint(50), is("buzz"));
    }
    @Test
    public void should_print_fizzbuzz_when_num_is_divided_3_and_5(){
        assertThat(fizzBuzzPrint(15),is("fizzbuzz"));
        assertThat(fizzBuzzPrint(45),is("fizzbuzz"));
    }
}
