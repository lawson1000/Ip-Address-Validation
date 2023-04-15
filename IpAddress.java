package guiAssignment;

import java.util.Arrays;

public class IpAddress {
	boolean answer;
	int num;
	int IpLen;
	int count;

	public boolean checkip(String ipAddress) {
		String[] ip = ipAddress.split("\\.",4); // Spiting the Ip with FullStop
		count = 0;
		for (String i : ip) {
			IpLen = i.length(); // getting the length of each value before the fullstop
			if (IpLen == 0 || IpLen > 3) {
				answer = false;
				return answer;
			} else {
				answer = true;
			}

			try {
				num = Integer.valueOf(i); // Converting and Ensuring the values are Numbers
			} catch (NumberFormatException e) {
				answer = false;
				return answer;
			}

			if (num < 0 || num > 255) { // checking if number is between 0-255
				answer = false;
				return answer;
			} else {
				answer = true;
			}

			answer = false;
			count++;
			if (count == 4) { 		//ensuring there are only three Dots 
				answer = true;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		IpAddress obj = new IpAddress();
		System.out.println(obj.checkip("233.2325.255.33")); // false
		System.out.println(obj.checkip("000.12.12.034")); // True
		System.out.println(obj.checkip("23.45.12.56")); // True
		System.out.println(obj.checkip("121.234.12.12")); // True
		System.out.println(obj.checkip("00.12.123.123123.123")); //False
		System.out.println(obj.checkip("122.23"));//False
		System.out.println(obj.checkip("Hello.IP")); // False
		System.out.println(obj.checkip("I.Am.not.an.ip")); //False
		System.out.println(obj.checkip("23.45.22.32.")); //False
		System.out.println(obj.checkip(".213.123.23.32")); //False
		System.out.println(obj.checkip("666.666.23.23")); //False
		System.out.println(obj.checkip("000.12.234.23.32")); //False
	}
}
