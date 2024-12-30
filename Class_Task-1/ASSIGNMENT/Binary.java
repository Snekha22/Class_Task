package Binary;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary = "1011";
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal Number " + binary + " is: " + decimal);
    }
 public static int binaryToDecimal(String binary)
    {
        int decimal = 0;
        int binaryLen = binary.length();
        for (int i = 0; i < binaryLen; i++)
        {
            int bit = binary.charAt(i) - '0';
            int power = binaryLen - i - 1;
            decimal += bit * Math.pow(2, power);
        }
        return decimal;
        }
 }


