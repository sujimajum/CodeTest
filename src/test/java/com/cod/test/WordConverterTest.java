package com.cod.test;

import static com.cod.pod.WordConverter.numberToWord;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class WordConverterTest {
	
	private final int input9=9;
    private final String expected9="Nine";
    
    private final int input0=0;
    private final String expected0="Zero";
	
	private final int input=999999999;
    private final String expected="Nine hundred Ninety-Nine million Nine hundred Ninety-Nine thousand Nine hundred Ninety-Nine";
    
    @Test
    public void test9() {
        assertEquals(expected0, numberToWord(input0));
    }
    
    @Test
    public void test0() {
        assertEquals(expected9, numberToWord(input9));
    }

	
	@Test
    public void test999999999() {
        assertEquals(expected, numberToWord(input));
    }
	
	
}
