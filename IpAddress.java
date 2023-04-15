package guiAssignment;

import java.util.Arrays;

public class IpAddress {
	boolean answer = false;
	int a;
	int IpLen;

	public boolean checkip(String ipAddress) {
		String[] ip = ipAddress.split("\\.", 4);
//		System.out.println(Arrays.toString(ip));
		for (String i : ip) {
			IpLen = i.length();
			System.out.println(IpLen);
//			a = Integer.valueOf(i);
////			System.out.println(a);
//			
//			if (!(a >= 0 && a <= 255)) {
//				return answer;
//			}
		}
		

		return answer;
	}

	public static void main(String[] args) {

		IpAddress obj = new IpAddress();
		obj.checkip("123.2345.255.33"); // false
		obj.checkip("000.12.12.034"); // True
		obj.checkip("23.45.12.56"); // True
		obj.checkip("121.234.12.12"); // True
//		obj.checkip("00.12.123.123123.123"); //False
//		obj.checkip("122.23");//False
//		obj.checkip("Hello.IP"); //False
//		obj.checkip("I.Am.not.an.ip"); //False
//		obj.checkip("23.45.22.32."); //False
//		obj.checkip(".213.123.23.32"); //False
//		obj.checkip("666.666.23.23"); //False
//		obj.checkip("000.12.234.23.32"); //False
	}
}
