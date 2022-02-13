package com.java.designpatterns;

public class App 
{
    public static void main( String[] args )
    {	
    	BedroomBuilder babyroom = new BedroomBuilder().setCeilingHeight(300).setDouble(false);
    	
    	System.out.println("Babyroom created with ceiling of height "+ babyroom.getCeilingHeight());
    }
}

