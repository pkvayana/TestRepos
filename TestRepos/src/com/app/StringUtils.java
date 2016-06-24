package com.app;

public class StringUtils {

	public static String custMobileNumberMask(String number) {
		String result = "";
		if (number != null && !number.trim().equals("")) {
			try {
				result = number.replaceFirst(".{5}", "XXXXX");
			} catch (Exception e) {
				System.out.println(
						"StringUtil: custnoMask(): Error in custMobileNumberMask:"
								+ number);
			}
		}

		return result;

	}
	
	public static void main(String a[]){
		
		String aq = "0534333943";
		
		System.out.println("format "+custMobileNumberMask(aq.substring(aq.length()-9, aq.length())));
		
		String str ="We$lc#ome t&o ANB's Net";
		
		String result = str.replaceAll("[!#$^&*()<>']", "");
		
		System.out.println("result >>>> "+result);
		
		
	}
}
