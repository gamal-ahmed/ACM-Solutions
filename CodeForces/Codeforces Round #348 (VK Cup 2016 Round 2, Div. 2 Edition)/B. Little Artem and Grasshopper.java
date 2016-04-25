import java.util.Scanner;

public class Grasshopper {

	private static Scanner in;

	public static void main(String[] args) {

		boolean infinte = false;
		in = new Scanner(System.in);
		int n = in.nextInt();
		int[] values = new int[n];
		String myCells = in.next();
		int[] iterativeTime = new int[n];

		for (int i = 0; i < values.length; i++) {

			values[i] = in.nextInt();
		}
		
		int next = 0, current = 0;

		for (;;) {

			current = next;
			iterativeTime[current]++;

			if (iterativeTime[current] > 1) {
				infinte = true;
				break;
			}
			if (myCells.charAt(next) == '>') {

				next = next + values[next];
			} else if (myCells.charAt(next) == '<') {

				next = next - values[next];
			}
			if (next >= n || next < 0)
				break;
		}
		if (infinte) {
			System.out.println("INFINITE");

		} else
			System.out.println("FINITE");

	}
}
