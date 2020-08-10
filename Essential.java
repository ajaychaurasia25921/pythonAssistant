package com;

import java.util.Random;

public class Essential {
  
  public static String GenOTPDecimal(int outputlength) {
    String intialValueInput = "0123456789";
    
    Random generator = new Random();
    
    char[] otp = new char[outputlength];
    
    for (int otplength = 0; otplength < outputlength; otplength++)
    {
      otp[otplength] = intialValueInput.charAt(generator.nextInt(intialValueInput.length()));
    }
    

    return String.valueOf(otp);
  }
  

  public static String GenOTPAlphaNumeric(int outputlength)
  {
    String intialValueInput = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXY";
    
    Random generator = new Random();
    
    char[] otp = new char[outputlength];
    
    for (int otplength = 0; otplength < outputlength; otplength++)
    {
      otp[otplength] = intialValueInput.charAt(generator.nextInt(intialValueInput.length()));
    }
    

    return String.valueOf(otp);
  }
  

  public static String GenOTPHexaDecimalBothCase(int outputlength)
  {
    String intialValueInput = "0123456789abcdefABCDEF";
    
    Random generator = new Random();
    
    char[] otp = new char[outputlength];
    
    for (int otplength = 0; otplength < outputlength; otplength++)
    {
      otp[otplength] = intialValueInput.charAt(generator.nextInt(intialValueInput.length()));
    }
    

    return String.valueOf(otp);
  }
  

  public static String GenOTPHexaDecimal(int outputlength)
  {
    String intialValueInput = "0123456789abcdef";
    
    Random generator = new Random();
    
    char[] otp = new char[outputlength];
    
    for (int otplength = 0; otplength < outputlength; otplength++)
    {
      otp[otplength] = intialValueInput.charAt(generator.nextInt(intialValueInput.length()));
    }
    

    return String.valueOf(otp);
  }
  
 
}
