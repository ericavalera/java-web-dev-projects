package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    @Test
    public void onlyBracketsReturnsTrue() {
        String message ="a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
//    TODO: Test balanced brackets in front of other characters- "[]Launchcode"
    @Test
    public void singleBracketsBeforeOtherCharacters(){
        String message ="balanced brackets in front of other characters return true";
        String testData= "[]LaunchCode";
        boolean results= BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(results, message);
    }

    /* TODO: Test balanced brackets around other characters - "[LaunchCode]"*/
    @Test
    public void singleBracketsAroundOtherCharacters (){
        String message = "balanced brackets around other characters return true";
        String testData= "[LaunchCode]";
        boolean results= BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(results, message);
    }
//    TODO:  Test balanced brackets within other characters -"Launch[Code]"
    @Test
    public void singleBracketAmongOtherCharacters(){
        String message = "balanced brackets among other characters returns true";
        String testData = "Launch[Code]";
        boolean results= BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(results, message);
    }
//    TODO: Test multiple consecutive pairs of balanced brackets - "[][][]"
@Test
public void tripleBalancedBrackets(){
    String message = "three consecutive pairs of brackets returns true";
    String testData = "[][][]";
    boolean results= BalancedBrackets.hasBalancedBrackets(testData);
    assertTrue(results, message);
}

//    TODO: Test multiple nested balanced brackets -"[[[]]]"
@Test
public void tripleNestedBrackets(){
    String message = "three pairs of nested brackets returns true";
    String testData = "[[[]]]";
    boolean results= BalancedBrackets.hasBalancedBrackets(testData);
    assertTrue(results, message);
}
//  TODO: Test single opening bracket -"["
@Test
public void singleOpeningBracket() {
    String message = "a single opening bracket returns false";
    String testData = "[";
    boolean results = BalancedBrackets.hasBalancedBrackets(testData);
    assertFalse(results, message);
}
//  TODO: Test single closing bracket - "]"
@Test
public void singleClosingBracket() {
    String message = "a single closing bracket returns false";
    String testData = "]";
    boolean results = BalancedBrackets.hasBalancedBrackets(testData);
    assertFalse(results, message);
}
//  TODO: Test reverse brackets -"]["
@Test
public void reverseBrackets() {
    String message = "a pair of reverse brackets returns false";
    String testData = "][";
    boolean results = BalancedBrackets.hasBalancedBrackets(testData);
    assertFalse(results, message);
}
//  TODO: Test single bracket with other characters "[LaunchCode"
@Test
public void singleBracketCharacter() {
    String message = "a single opening bracket with characters returns false";
    String testData = "[LaunchCode";
    boolean results = BalancedBrackets.hasBalancedBrackets(testData);
    assertFalse(results, message);
}
//  TODO: Test unbalanced brackets among other characters -"Launch]Code["
@Test
public void unbalancedBracketsAmongCharacter() {
    String message = "unbalanced brackets with characters returns false";
    String testData = "Launch]Code[";
    boolean results = BalancedBrackets.hasBalancedBrackets(testData);
    assertFalse(results, message);
}

//  TODO: Test a series of mixed unbalanced brackets - "[[]][]["
@Test
public void unbalancedNestedBrackets() {
    String message = "unbalanced nested brackets returns false";
    String testData = "[[]][][";
    boolean results = BalancedBrackets.hasBalancedBrackets(testData);
    assertFalse(results, message);
}

// TODO: Test string with only characters other than brackets -"LaunchCode"
@Test
public void noBrackets() {
    String message = "no brackets returns true";
    String testData = "LaunchCode";
    boolean results = BalancedBrackets.hasBalancedBrackets(testData);
    assertTrue(results, message);
}
// TODO: Test empty string - ""

    @Test
    public void emptyString() {
        String message = "empty returns true";
        String testData = "";
        boolean results = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(results, message);
    }
}