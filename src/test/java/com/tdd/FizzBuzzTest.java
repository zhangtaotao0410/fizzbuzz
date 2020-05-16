package com.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_print_num_when_input_is_normal_num() {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        assertThat(fizzBuzz.print(), is("1"));
    }
}
