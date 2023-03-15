package BinaryConverter;
import java.util.*;
import java.util.Scanner;

public class Converter {
	public static String decToBi(long dec) {
		String binary = "";
		while (dec > 0) {
			long remainder = dec % 2;
			binary = remainder + binary;
			dec = dec / 2;
		}
		return binary;
	}
	public static String biToDec(String binary) {
		long decimal = 0;
		int j = 0;
		for (int i = binary.length()-1; i >= 0; i--) {
			decimal += ((Long.parseLong(String.valueOf(binary.charAt(j))))) * Math.pow(2, i);
			j++;
		}
		return decimal+"";
	}
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number to convert from decimal to binary: ");
		String numOne = input.nextLine();
		System.out.println("Enter a number to convert from binary to decimal");
		String numTwo = input.nextLine();
		System.out.println("Your decimal number in binary is: " + decToBi(Long.parseLong(numOne)));
		System.out.println("Your binary number in decimal is: " + biToDec(numTwo));
	}
}


