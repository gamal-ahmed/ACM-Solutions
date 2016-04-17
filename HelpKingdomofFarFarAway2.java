import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HelpKingdomofFarFarAway2 {
	static boolean isMinus = false;

	public static void main(String[] args) throws FileNotFoundException {

		String number;

		Scanner in = new Scanner(System.in);
		number = in.next();
		if (number.startsWith("-"))
			isMinus = true;
		else if (number.startsWith("0.00")) {
			System.out.println("$0.00");
			System.exit(0);
		}
		if (number.contains(".")) {
			String[] parts = number.split(Pattern.quote("."));
			String integerPart = analyzeIntegerPart(parts[0]);
			String fractionPart = analyzeFractionPart(parts[1]);
			String financialFormat = produceFinancial(integerPart,
					fractionPart, isMinus);
			System.out.println(financialFormat);
		} else {
			String fractionPart = analyzeFractionPart("");
			String financialFormat = produceFinancial(
					analyzeIntegerPart(number), fractionPart, isMinus);
			System.out.println(financialFormat);
		}
	}

	private static String produceFinancial(String integerPart,
			String fractionPart, boolean minus) {

		char start = '(';
		String financial = "$";
		if (minus) {
			integerPart = integerPart.replaceFirst("-", "");
			financial += integerPart + "." + fractionPart;

			financial = start + financial;
			financial += ")";
			return financial;

		}
		financial += integerPart + "." + fractionPart;

		return financial;
	}

	private static String analyzeFractionPart(String fraction) {

		if (fraction.length() > 1)
			return fraction.substring(0, 2);
		else if (fraction.equals("")) {
			return "00";
		} else
			return fraction += '0';

	}

	private static String analyzeIntegerPart(String integer) {
		if (isMinus)
			integer = integer.replaceFirst("-", "");

		int addedlength = integer.length() / 3;

		if (integer.length() % 3 == 0)
			addedlength--;
		char[] result = new char[integer.length() + addedlength];
		int j = result.length;
		int i = integer.length() - 1;
		int group = 0;
		while (j-- != 0) {

			if (group <= 2) {
				result[j] = integer.charAt(i);
				group++;
				i--;
			} else {
				group = 0;
				result[j] = ',';

			}

		}
		String resultString = new String(result);
		return resultString;
	}
}
