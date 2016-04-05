import java.util.Scanner;
import java.util.regex.Pattern;

public class KseniaandPanScales {

	private static int diff;

	public static void main(String[] args) {

		int leftPTR = 0, rightPTR = 0;
		char currenChar;
		String input, remainingString;

		String right = "";
		String left = "";
		Scanner in = new Scanner(System.in);

		input = in.nextLine();
		remainingString = in.nextLine();
		char[] reminedcharsArray = remainingString.toCharArray();
		int remindeChars = 0;
		String[] splits = input.split(Pattern.quote("|"));
		if (splits.length > 0) {
			left = splits[0];
			leftPTR = left.length();
		}

		if (splits.length > 1) {
			right = splits[1];
			rightPTR = right.length();
		}

		diff = leftPTR - rightPTR;
		if (remainingString.length() < diff) {
			System.out.println("Impossible");
			System.exit(0);
		} else {

			while (remindeChars != reminedcharsArray.length) {

				if (leftPTR < rightPTR) {
					left += reminedcharsArray[remindeChars];
					leftPTR++;
				} else {
					right += reminedcharsArray[remindeChars];
					rightPTR++;
				}
				remindeChars++;

			}

		}

		if (rightPTR == leftPTR)
			System.out.println(left + '|' + right);
		else
			System.out.println("Impossible");
	}
}
