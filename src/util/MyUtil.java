package util;

import java.util.regex.Pattern;

public class MyUtil {
	// 전화번호 하이픈으로 자르는 기능
	public static String makePhoneNumber(String phoneNoStr) {
	      String regEx = "(\\d{3})(\\d{3,4})(\\d{4})";
	      if(!Pattern.matches(regEx, phoneNoStr)) return null;
	      return phoneNoStr.replaceAll(regEx, "$1-$2-$3");
	 
	   }

}
