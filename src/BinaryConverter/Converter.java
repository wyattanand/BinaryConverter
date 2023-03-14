package BinaryConverter;

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
		System.out.println(decToBi(100000000000));
		System.out.println(biToDec("111011100110101100101000000000"));
	}
}


