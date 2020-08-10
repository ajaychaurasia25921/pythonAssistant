
import java.math.*;
import java.security.*;


public class Encryption 
{ 
static MessageDigest messageDigest;

  static byte[] result;

  

public static String MD5(String inputString) { 
try { 

	messageDigest = MessageDigest.getInstance("MD5");

      result = messageDigest.digest(inputString.getBytes());

      BigInteger number = new BigInteger(1, result);
 
     String outputString = number.toString(16);

      while (outputString.length() < 32) {

        outputString = "0" + outputString;
 
     }
      return outputString;

    } catch (java.security.NoSuchAlgorithmException e) {
  
    throw new RuntimeException();
    
}

  }
  
  
public static String SHA1(String inputString) {

    try {
		messageDigest = MessageDigest.getInstance("SHA1");
 
     result = messageDigest.digest(inputString.getBytes());

      StringBuffer outString = new StringBuffer();
     for (int loopLength = 0; loopLength < result.length; loopLength++) {
 
       outString.append(Integer.toString((result[loopLength] & 0xFF) + 256, 16).substring(1));
   
   }
      
return outString.toString();
   
 }
   
 catch (Exception e) {
  
    throw new RuntimeException(e);
   
 }

  }
  public static void main(String []args){
  System.out.println(SHA1("ajay"));
  }
}
