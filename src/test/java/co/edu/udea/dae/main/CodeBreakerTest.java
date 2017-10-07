/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.dae.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author frank.castrillon
 */
public class CodeBreakerTest {
    
   private CodeBreaker codeBreaker;
    
    public CodeBreakerTest() {
        codeBreaker = new CodeBreaker("8931");
    }

    @Test
    public void test_every_number_match() {
        String result = codeBreaker.verifyNumber("8931");
        String number = "XXXX";
        assertTrue(number.compareTo(result) == 0);
    }
    
    @Test
    public void test_two_number_match_but_not_position() {
        String result = codeBreaker.verifyNumber("9685");
        String number = "--";
        assertTrue(number.compareTo(result) == 0);
    }
    
    @Test
    public void test_no_one_number_match() {
        String result = codeBreaker.verifyNumber("7520");
        String number = "";
        assertTrue(number.compareTo(result) == 0);
    }
    
    @Test
    public void test_send_string() {
        String result = codeBreaker.verifyNumber("as1a");
        String number = "";
        assertTrue(number.compareTo(result) == 0);
    }
    
    @Test
    public void test_number_greather_than_4_characters() {
        String result = codeBreaker.verifyNumber("12345");
        String number = "";
        assertTrue(number.compareTo(result) == 0);
    }
    
    @Test
    public void test_two_in_position_two_not() {
        String result = codeBreaker.verifyNumber("7951");
        String number = "XX";
        assertTrue(number.compareTo(result) == 0);
    }
    
    @Test
    public void test_with_duplicated_number() {
        String result = codeBreaker.verifyNumber("1951");
        String number = "";
        assertTrue(number.compareTo(result) == 0);
    }
    
    @Test
    public void test_number_shorter_than_4_characters() {
        String result = codeBreaker.verifyNumber("12");
        String number = "";
        assertTrue(number.compareTo(result) == 0);
    }
    @Test
    public void test_with_zero_beginning() {
        String result = codeBreaker.verifyNumber("0725");
        String number = "";
        assertTrue(number.compareTo(result) == 0);
    }
    
}
