import java.util.Scanner;

public class YaroslavandPermutations {

	public static int[] numbers = new int[10001];
	private static Scanner in;
	private static int elements;
	private static int currentInt;
	private static boolean noHope = true;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		elements = in.nextInt();
		int mid = elements / 2;
		if (elements == 1) {
			System.out.println("YES");

			System.exit(0);
		}
		for (int i = 0; i < elements; i++) {

			currentInt = in.nextInt();

			numbers[currentInt]++;
			if (elements % 2 == 0) {
				if (numbers[currentInt] > (elements / 2)) {
					noHope = false;
					break;
				}
			} else {
				if (numbers[currentInt] - mid >= 2) {
					noHope = false;
					break;
				}
			}

		}
		if (noHope)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
