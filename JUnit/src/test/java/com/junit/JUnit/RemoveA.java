package com.junit.JUnit;

 
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;  
  
public class RemoveA {  

    @Test  
    public void testEmptyString(){
    	CheckA checkA = new CheckA();
    	assertEquals("",checkA.remove(""));
    }  
    
    @Test  
    public void testBChar(){
    	CheckA checkA = new CheckA();
    	assertEquals("B",checkA.remove("B"));
    }
    
    @Test  
    public void testAChar(){
    	CheckA checkA = new CheckA();
    	assertEquals("",checkA.remove("A"));
    }
    
    @Test  
    public void testABChar(){
    	CheckA checkA = new CheckA();
    	assertEquals("B",checkA.remove("AB"));
    }	
    
    @Test  
    public void testBAChar(){
    	CheckA checkA = new CheckA();
    	assertEquals("B",checkA.remove("BA"));
    }
    
    @Test  
    public void testNChar(){
    	CheckA checkA = new CheckA();
    	assertEquals("BBCD",checkA.remove("BBCD"));
    }

    @Test  
    public void testN1Char(){
    	CheckA checkA = new CheckA();
    	assertEquals("CD",checkA.remove("AACD"));
    }

    @Test  
    public void testN2Char(){
    	CheckA checkA = new CheckA();
    	assertEquals("BCD",checkA.remove("ABCD"));
    }
    
    
}  