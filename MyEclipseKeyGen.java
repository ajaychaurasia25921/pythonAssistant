
import java.io.BufferedReader;

public class MyEclipseKeyGen
{
  private static final String LL = "Decompiling this copyrighted software is a violation of both your license agreement and the Digital Millenium Copyright Act of 1998 (http://www.loc.gov/copyright/legislation/dmca.pdf). Under section 1204 of the DMCA, penalties range up to a $500,000 fine or up to five years imprisonment for a first offense. Think about it; pay for a license, avoid prosecution, and feel better about yourself.";
  
  public String getSerial(String userId, String licenseNum, String type)
  {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.add(5, 1000);
    
    java.text.NumberFormat nf = new java.text.DecimalFormat("000");
    licenseNum = nf.format(Integer.valueOf(licenseNum));
    String verTime = "-" + 
      new java.text.SimpleDateFormat("yyMMdd").format(cal.getTime()) + 
      "0";
    String need = userId.substring(0, 1) + type + 
      "300" + licenseNum + verTime;
    String dx = need + "Decompiling this copyrighted software is a violation of both your license agreement and the Digital Millenium Copyright Act of 1998 (http://www.loc.gov/copyright/legislation/dmca.pdf). Under section 1204 of the DMCA, penalties range up to a $500,000 fine or up to five years imprisonment for a first offense. Think about it; pay for a license, avoid prosecution, and feel better about yourself." + 
      userId;
    int suf = decode(dx);
    String code = need + String.valueOf(suf);
    
    return change(code);
  }
  



  private int decode(String s)
  {
    int i = 0;
    char[] ac = s.toCharArray();
    int j = 0;
    int k = ac.length;
    while (j < k) {
      i = 31 * i + ac[j];
      j++;
    }
    return Math.abs(i);
  }
  




  private String change(String s)
  {
    byte[] abyte0 = s.getBytes();
    char[] ac = new char[s.length()];
    int i = 0;
    int k = abyte0.length;
    while (i < k) {
      int j = abyte0[i];
      if ((j >= 48) && (j <= 57)) {
        j = (j - 48 + 5) % 10 + 48;
      }
      else if ((j >= 65) && (j <= 90)) {
        j = (j - 65 + 13) % 26 + 65;
      }
      else if ((j >= 97) && (j <= 122)) {
        j = (j - 97 + 13) % 26 + 97;
      }
      ac[i] = ((char)j);
      i++;
    }
    return String.valueOf(ac);
  }
  
  


  public static void main(String[] args)
  {
    try
    {
      String type = "YE3MB-";
      
      System.out.println("please input register name:");
      BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(
        System.in));
      String userId = null;
      userId = reader.readLine();
      MyEclipseKeyGen myeclipsegen = new MyEclipseKeyGen();
      String res = myeclipsegen.getSerial(userId, "5", type);
      System.out.println("Serial:" + res);
      reader.readLine();
    }
    catch (java.io.IOException localIOException) {}
  }
}
