
import java.util.Scanner;
/*
 * The solution is quite simple: all you have to do is to follow the described procedure of transforming code from 
 * Brainfuck to Unary. If your language has built-in long arithmetics, the solution is straightforward: 
 * replace characters of each type with corresponding binary codes,
convert the resulting string into a long integer and take it modulo 1000003.
 * */
public class Unary {
	public static String input;
	public static Scanner s;

	public static int unaryTotal = 0;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		input = s.next();
		for (int i = 0; i < input.length(); i++) {

			unaryTotal *= 16;
			switch (input.charAt(i)) {
			case '>':
				unaryTotal += 8;
				break;

			case '<':
				unaryTotal += 9;
				break;

			case '+':
				unaryTotal += 10;
				break;

			case '-':
				unaryTotal += 11;
				break;

			case '.':
				unaryTotal += 12;
				break;

			case ',':
				unaryTotal += 13;
				break;

			case '[':
				unaryTotal += 14;
				break;

			case ']':
				unaryTotal += 15;
				break;

			default:
				break;
			}
			unaryTotal %= 1000003;
		}

		System.out.println(unaryTotal);

	}

}
