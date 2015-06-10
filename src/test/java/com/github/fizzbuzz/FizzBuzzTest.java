package com.github.fizzbuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @Before
    public void init(){
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void testApp(){
        assertThat("Java", is(anything()));
    }
}
