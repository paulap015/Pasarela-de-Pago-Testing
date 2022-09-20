package org.example.unitesting.util;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RomanNumbersTest {

    private RomanNumbers romanNumbers;
    @Before
    public void setup(){
        romanNumbers = new RomanNumbers();
    }

    @Test
    public void number_is_less_than_ten(){
        assertThat(romanNumbers.arabicToRoman(9), is("IX"));
    }

    @Test
    public void number_is_greater_than_ten(){
        assertThat(romanNumbers.arabicToRoman(15), is("XV"));
    }
}