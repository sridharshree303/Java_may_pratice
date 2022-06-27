package sample;

//java code for generating otp//
public class OTTP {
  static String generateOTP(int len)
  {
      String str = "1234567899876"
    		  +"9876543240123456789";
      int n = str.length();  //32
      // String to hold  OTP
      String OTP="";
//      String OTTP = "";

      for (int i = 1; i <= len; i++) {
//    	  float f = (float) (Math.random()*10);
//    	  System.out.println(f);
//    	  int v = (int) (f % n);
//    	  OTTP += v;
          OTP += (str.charAt((int) ((Math.random()*10) % n)));
      }
      return(OTP);
  }

  public static void main(String[] args)
  {

      // To Declare the length of OTP
      int len = 7;
      System.out.printf("Your OTP is - %s", generateOTP(len));
  }
  }