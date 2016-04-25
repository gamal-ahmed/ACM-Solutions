import java.util.Scanner;

public class Artem {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int howMany = n / 3;
		if (n % 3 == 0)
			System.out.println(howMany * 2);
		else
			System.out.println(howMany * 2 + 1);

	}
}
